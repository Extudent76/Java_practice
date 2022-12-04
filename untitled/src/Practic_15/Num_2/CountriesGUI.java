package Practic_15.Num_2;

import javax.swing.*;
import java.awt.*;
import java.util.Locale;
import java.util.Objects;

public class CountriesGUI  extends JFrame {
	private final JComboBox<Country> comboBox;
	private final JLabel textInfo;
	private final JPanel panelBox;
	private final JPanel panelTextInfo;

	public CountriesGUI() {
		super("Страны");
		setLayout(new GridLayout(2, 1));
		setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panelBox = new JPanel();
		panelTextInfo = new JPanel();
		add(panelBox);
		add(panelTextInfo);

		panelBox.add(comboBox = new JComboBox<>(Country.values()));
		panelTextInfo.add(textInfo = new JLabel(""));

		comboBox.addActionListener(e -> textInfo.setText("Население страны: " + String.format(Locale.US, "%,d",
				Country.valueOf(Objects.requireNonNull(((JComboBox<?>) e.getSource()).getSelectedItem()).toString()).getPopulation()) + " человек"));
		setVisible(true);
	}
	public static void main(String[] args) {
		new CountriesGUI();
	}
}
