import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.awt.event.ActionEvent;

public class Rabattrechner extends JFrame {

	private JPanel contentPane;
	private JTextField textField_preis;
	private JTextField textField_Menge;
	private JLabel lblSumme;
	private JCheckBox chckbxTreuerr;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_2;
	private JLabel lblberechnen;
	private JCheckBox chboxmehrwertBox;
	List<Berechnen> list = new ArrayList<>();
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rabattrechner frame = new Rabattrechner();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Rabattrechner() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 156, 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		lblNewLabel = new JLabel("Rabattrechner");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);

		btnNewButton_1 = new JButton("zurücksetzten");
		btnNewButton_1.addActionListener((e) -> {

			zurücksetzen();

		});
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.anchor = GridBagConstraints.EAST;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_1.gridx = 1;
		gbc_btnNewButton_1.gridy = 0;
		contentPane.add(btnNewButton_1, gbc_btnNewButton_1);

		JLabel lblNewLabel_1 = new JLabel("Einzepreis");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 2;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);

		textField_preis = new JTextField();
		GridBagConstraints gbc_textField_preis = new GridBagConstraints();
		gbc_textField_preis.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_preis.insets = new Insets(0, 0, 5, 0);
		gbc_textField_preis.gridx = 1;
		gbc_textField_preis.gridy = 2;
		contentPane.add(textField_preis, gbc_textField_preis);
		textField_preis.setColumns(10);

		lblNewLabel_2 = new JLabel("");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 3;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Menge");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 4;
		contentPane.add(lblNewLabel_3, gbc_lblNewLabel_3);

		textField_Menge = new JTextField();
		textField_Menge.addActionListener((e) -> {
			String mengeString = textField_Menge.getText();
			String preiString = textField_preis.getText();
			double zwischensumme = 0;
			double menge = Double.parseDouble(mengeString);

			double preis = Double.parseDouble(preiString);
			if (!mengeString.equals("") && !preiString.equals("")) {

				zwischensumme = menge * preis;
				lblberechnen.setText("" + zwischensumme);

			}

		});
		GridBagConstraints gbc_textField_Menge = new GridBagConstraints();
		gbc_textField_Menge.insets = new Insets(0, 0, 5, 0);
		gbc_textField_Menge.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_Menge.gridx = 1;
		gbc_textField_Menge.gridy = 4;
		contentPane.add(textField_Menge, gbc_textField_Menge);
		textField_Menge.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Zwischensumme");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 6;
		contentPane.add(lblNewLabel_4, gbc_lblNewLabel_4);

		lblberechnen = new JLabel("");
		GridBagConstraints gbc_lblberechnen = new GridBagConstraints();
		gbc_lblberechnen.insets = new Insets(0, 0, 5, 0);
		gbc_lblberechnen.gridx = 1;
		gbc_lblberechnen.gridy = 6;
		contentPane.add(lblberechnen, gbc_lblberechnen);

		chboxmehrwertBox = new JCheckBox("Mehrwertsteuerrabatt");
		GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
		gbc_chckbxNewCheckBox.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox.gridx = 0;
		gbc_chckbxNewCheckBox.gridy = 7;
		contentPane.add(chboxmehrwertBox, gbc_chckbxNewCheckBox);

		chckbxTreuerr = new JCheckBox("5 % Treuerrabatt");
		GridBagConstraints gbc_chckbxNewCheckBox_1 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_1.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxNewCheckBox_1.anchor = GridBagConstraints.EAST;
		gbc_chckbxNewCheckBox_1.gridx = 1;
		gbc_chckbxNewCheckBox_1.gridy = 7;
		contentPane.add(chckbxTreuerr, gbc_chckbxNewCheckBox_1);

		lblSumme = new JLabel("");
		GridBagConstraints gbc_lblSumme = new GridBagConstraints();
		gbc_lblSumme.anchor = GridBagConstraints.EAST;
		gbc_lblSumme.insets = new Insets(0, 0, 0, 5);
		gbc_lblSumme.gridx = 0;
		gbc_lblSumme.gridy = 9;
		contentPane.add(lblSumme, gbc_lblSumme);

		JButton btnNewButton = new JButton("berechnen");

		btnNewButton.addActionListener(e -> {

			berechnen();
			berechnen2("");

		});

		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.EAST;
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 9;
		contentPane.add(btnNewButton, gbc_btnNewButton);
	}

	private void berechnen2(String gString) {
		String mengeString = textField_Menge.getText();
		String preiString = textField_preis.getText();
		double zwischensumme = 0;
		double menge = Double.parseDouble(mengeString);

		double preis = Double.parseDouble(preiString);
		if (!mengeString.equals("") && !preiString.equals("")) {

			zwischensumme = menge * preis;
			lblberechnen.setText("" + zwischensumme);

		}

	}

	private void zurücksetzen() {
		textField_Menge.setText("");
		textField_preis.setText("");
		chboxmehrwertBox.setSelected(false);
		chckbxTreuerr.setSelected(false);
		lblberechnen.setText("");
		lblSumme.setText("");
	}

	private void berechnen() {
		String mengeString = textField_Menge.getText();
		String preiString = textField_preis.getText();
		double zwischensumme = 0;
		double menge = Double.parseDouble(mengeString);

		double preis = Double.parseDouble(preiString);
		if (!mengeString.equals("") && !preiString.equals("")) {

			zwischensumme = menge * preis;
			lblberechnen.setText("" + zwischensumme);

		}

		if (chboxmehrwertBox.isSelected() & chckbxTreuerr.isSelected()) {
			zwischensumme = zwischensumme - zwischensumme * 0.19 - zwischensumme * 0.05;
		} else if (chckbxTreuerr.isSelected()) {
			zwischensumme = zwischensumme - zwischensumme * 0.05;
		} else if (chboxmehrwertBox.isSelected()) {
			zwischensumme = zwischensumme - zwischensumme * 0.19;
		}

		lblSumme.setText("zu zahlen :" + zwischensumme + " €");
		list.add(new Berechnen(preis, menge, zwischensumme));
		double berechnen = 0;
		for (Berechnen b : list) {
			System.out.println(b);
			berechnen += b.getSumme();
		}
		System.out.println("Die Summe : " + berechnen);

	}

}
