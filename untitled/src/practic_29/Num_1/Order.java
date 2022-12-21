package practic_29.Num_1;

public interface Order {
	boolean add(Item item) throws IllegalTableNumber;

	boolean remove(String name) throws IllegalTableNumber;

	boolean removeAll();

	int getQuantity();

	Item[] getItems();

	double getCostTotal();

	int getQuantity(String name);

	Item[] getNoRepeatsItems(String name);

	Item[] getSortedItemsByCost();
}
