import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Wechseln extends JFrame {

	private JPanel contentPane;

	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton radioL;
	private JRadioButton radioP;
	private JLabel lblumrechnung;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Wechseln frame = new Wechseln();
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
	public Wechseln() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		JLabel lblNewLabel = new JLabel("Euro =");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);

		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.anchor = GridBagConstraints.WEST;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 0;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);

		radioP = new JRadioButton("P");
		buttonGroup.add(radioP);
		GridBagConstraints gbc_radioP = new GridBagConstraints();
		gbc_radioP.insets = new Insets(0, 0, 5, 0);
		gbc_radioP.gridx = 4;
		gbc_radioP.gridy = 0;
		contentPane.add(radioP, gbc_radioP);

		JLabel lblNewLabel_1 = new JLabel("");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);

		JButton btnNewButton = new JButton("berechnen");
		btnNewButton.addActionListener(e -> {
			double wert = Double.parseDouble(textField.getText());
			if (radioP.isSelected()) {

				Kurs k1 = new Kurs();

				double p = k1.getKurs("P");

				lblNewLabel_2.setText(String.valueOf(wert * p));
				System.out.println(String.valueOf(wert * p));
			}
			else if (radioL.isSelected()) {
				Kurs k2 =new Kurs(); 
				double r = k2.getKurs("L"); 
				lblNewLabel_2.setText(String.valueOf(wert*r)); 
				System.out.println(String.valueOf(wert * r));
			
			}

		});

		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 3;
		contentPane.add(btnNewButton, gbc_btnNewButton);

		radioL = new JRadioButton("L");
		buttonGroup.add(radioL);
		GridBagConstraints gbc_radioL = new GridBagConstraints();
		gbc_radioL.insets = new Insets(0, 0, 5, 0);
		gbc_radioL.gridx = 4;
		gbc_radioL.gridy = 3;
		contentPane.add(radioL, gbc_radioL);

		lblumrechnung = new JLabel("");
		GridBagConstraints gbc_lblumrechnung = new GridBagConstraints();
		gbc_lblumrechnung.insets = new Insets(0, 0, 5, 5);
		gbc_lblumrechnung.gridx = 2;
		gbc_lblumrechnung.gridy = 4;
		contentPane.add(lblumrechnung, gbc_lblumrechnung);

		lblNewLabel_2 = new JLabel("");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_2.gridx = 2;
		gbc_lblNewLabel_2.gridy = 6;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
	}
}
