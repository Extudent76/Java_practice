package practic_6.Num_12;

import java.util.Stack;

public class StringBuilder2 {
	private final StringBuilder stringBuilder;
	private final Stack<Command> commandStack;

	public StringBuilder2() {
		this.stringBuilder = new StringBuilder();
		this.commandStack = new Stack<>();
	}
	public void undo() {
		if (!commandStack.isEmpty()) {
			commandStack.pop().undo();
		}
	}
	public StringBuilder2 reverse() {
		stringBuilder.reverse();
		commandStack.add(() -> stringBuilder.reverse());
		return this;
	}
	public StringBuilder2 append(String str) {
		stringBuilder.append(str);
		commandStack.add(() -> stringBuilder.delete(stringBuilder.length() - str.length(), stringBuilder.length()));
		return this;
	}
	public StringBuilder2 delete(int start, int end) {
		String deleted = stringBuilder.substring(start, end);
		stringBuilder.delete(start, end);
		commandStack.add(() -> stringBuilder.insert(start+1, deleted));
		return this;
	}
	public StringBuilder2 replace(int start, int end, String str) {
		String deleted = stringBuilder.substring(start, end);
		stringBuilder.replace(start, end, str);
		commandStack.add(() -> stringBuilder.replace(start, end, deleted));
		return this;
	}
	public StringBuilder2 insert(int offset, String str) {
		stringBuilder.insert(offset, str);
		commandStack.add(() -> stringBuilder.delete(offset, str.length()));
		return this;
	}

	@Override
	public String toString() {
		return stringBuilder.toString();
	}


}
