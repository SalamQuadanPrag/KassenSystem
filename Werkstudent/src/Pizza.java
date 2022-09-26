import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import javax.swing.JCheckBox;
import java.awt.Insets;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Pizza extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtStraße;
	private JTextField txtOrt;
	private JCheckBox chckbxPaprika;
	private JRadioButton rdbtnBarbezahlung;
	private JCheckBox chckbxSalami;
	private JRadioButton rdbtnBitcoin;
	private JCheckBox chckbxPilze;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pizza frame = new Pizza();
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
	public Pizza() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		JLabel lblNewLabel = new JLabel("Zutaten");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel.gridwidth = 6;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Zahlungsweise");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 14;
		gbc_lblNewLabel_1.gridy = 0;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);

		chckbxPaprika = new JCheckBox("Paprika");
		GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
		gbc_chckbxNewCheckBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_chckbxNewCheckBox.gridwidth = 6;
		gbc_chckbxNewCheckBox.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox.gridx = 0;
		gbc_chckbxNewCheckBox.gridy = 1;
		contentPane.add(chckbxPaprika, gbc_chckbxNewCheckBox);

		rdbtnBarbezahlung = new JRadioButton("Barzahlung");
		buttonGroup.add(rdbtnBarbezahlung);
		GridBagConstraints gbc_rdbtnNewRadioButton = new GridBagConstraints();
		gbc_rdbtnNewRadioButton.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton.gridx = 14;
		gbc_rdbtnNewRadioButton.gridy = 1;
		contentPane.add(rdbtnBarbezahlung, gbc_rdbtnNewRadioButton);

		chckbxSalami = new JCheckBox("Salami");
		GridBagConstraints gbc_chckbxNewCheckBox_1 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_1.anchor = GridBagConstraints.WEST;
		gbc_chckbxNewCheckBox_1.gridwidth = 5;
		gbc_chckbxNewCheckBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_1.gridx = 0;
		gbc_chckbxNewCheckBox_1.gridy = 2;
		contentPane.add(chckbxSalami, gbc_chckbxNewCheckBox_1);

		rdbtnBitcoin = new JRadioButton("Bitcoin");
		buttonGroup.add(rdbtnBitcoin);
		GridBagConstraints gbc_rdbtnNewRadioButton_1 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_rdbtnNewRadioButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_1.gridx = 14;
		gbc_rdbtnNewRadioButton_1.gridy = 2;
		contentPane.add(rdbtnBitcoin, gbc_rdbtnNewRadioButton_1);

		chckbxPilze = new JCheckBox("Pilze");
		GridBagConstraints gbc_chckbxNewCheckBox_2 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_2.anchor = GridBagConstraints.WEST;
		gbc_chckbxNewCheckBox_2.gridwidth = 4;
		gbc_chckbxNewCheckBox_2.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_2.gridx = 1;
		gbc_chckbxNewCheckBox_2.gridy = 3;
		contentPane.add(chckbxPilze, gbc_chckbxNewCheckBox_2);

		JLabel lblNewLabel_2 = new JLabel("Lieferadresse");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.gridwidth = 5;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 4;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Name");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_3.gridwidth = 2;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 5;
		contentPane.add(lblNewLabel_3, gbc_lblNewLabel_3);

		txtName = new JTextField();
		GridBagConstraints gbc_txtName = new GridBagConstraints();
		gbc_txtName.gridwidth = 8;
		gbc_txtName.insets = new Insets(0, 0, 5, 5);
		gbc_txtName.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtName.gridx = 5;
		gbc_txtName.gridy = 5;
		contentPane.add(txtName, gbc_txtName);
		txtName.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Straße");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.gridwidth = 2;
		gbc_lblNewLabel_4.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 1;
		gbc_lblNewLabel_4.gridy = 6;
		contentPane.add(lblNewLabel_4, gbc_lblNewLabel_4);

		txtStraße = new JTextField();
		GridBagConstraints gbc_txtStraße = new GridBagConstraints();
		gbc_txtStraße.gridwidth = 8;
		gbc_txtStraße.insets = new Insets(0, 0, 5, 5);
		gbc_txtStraße.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtStraße.gridx = 5;
		gbc_txtStraße.gridy = 6;
		contentPane.add(txtStraße, gbc_txtStraße);
		txtStraße.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Ort");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.gridwidth = 2;
		gbc_lblNewLabel_5.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_5.gridx = 1;
		gbc_lblNewLabel_5.gridy = 7;
		contentPane.add(lblNewLabel_5, gbc_lblNewLabel_5);

		txtOrt = new JTextField();
		GridBagConstraints gbc_txtOrt = new GridBagConstraints();
		gbc_txtOrt.gridwidth = 8;
		gbc_txtOrt.insets = new Insets(0, 0, 0, 5);
		gbc_txtOrt.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtOrt.gridx = 5;
		gbc_txtOrt.gridy = 7;
		contentPane.add(txtOrt, gbc_txtOrt);
		txtOrt.setColumns(10);

		JButton btnNewButton = new JButton("Hunger");
		btnNewButton.addActionListener(e -> {
			JOptionPane.showMessageDialog(null,
					"Hallo " + (txtName.getText()) + ", " + (chckbxPaprika.isSelected() ? " Paprika " : "")
							+ (chckbxPilze.isSelected() ? " Pilze " : "")
							+ (chckbxSalami.isSelected() ? "Salami " : "")
							+ (rdbtnBarbezahlung.isSelected() ? "Mit Barzahlung bezahlt" : "Mit Bitcoin bezahlt")
							+ "Wird in 5 Minuten nach " + "\n" + (txtStraße.getText()) + " , " + (txtOrt.getText())
							+ " , " + "Bitte halten Sie entsprechend Bargeld bereit. \n" + "Guten Appetit"

			);
			zurücksetzten();
		});

		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 14;
		gbc_btnNewButton.gridy = 7;
		contentPane.add(btnNewButton, gbc_btnNewButton);
	}

	private void zurücksetzten() {
		chckbxPaprika.setSelected(false);
		chckbxPilze.setSelected(false);
		chckbxSalami.setSelected(false);
		buttonGroup.clearSelection();
		txtName.setText("");
		txtOrt.setText("");
		txtStraße.setText("");

	}

}
