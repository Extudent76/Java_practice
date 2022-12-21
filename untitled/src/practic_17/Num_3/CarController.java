package practic_17.Num_3;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class CarController {
	private final CarView view;
	private final CarModel model;

	public CarController() {
		this.model = new CarModel();
		this.view = new CarView();
		view.addActionListener(new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				model.setbrand(view.getInputTextbrend());
				view.setLabelTextbrend(model.getbrand());

				model.setModel(view.getInputTextmodel());
				view.setLabelTextmodel(model.getModel());
			}
		});
	}
	public static void main(String[] args) {
		new CarController();
	}
}
