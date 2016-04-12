package View;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controller.Procedures;
import Controller.StudentValidation;
import Model.Student;

public class Register extends JFrame {
	
	private JLabel labelName = new JLabel("Nome: ");
	private JLabel labelRegistration = new JLabel("Matrícula: ");
	private JLabel labelAverage = new JLabel("Média: ");
	private JTextField textName = new JTextField(20);
	private JTextField textRegistration = new JTextField(20);
	private JTextField textAverage = new JTextField(20);

	private JButton buttonGo = new JButton("Pronto!");

	public  Register(final ArrayList<Student> arrayStudent) {
		
		// create a new panel with GridBagLayout manager
		JPanel newPanel = new JPanel(new GridBagLayout());

		GridBagConstraints constraints = new GridBagConstraints();
		constraints.anchor = GridBagConstraints.WEST;
		constraints.insets = new Insets(10, 10, 10, 10);

		// add components to the panel
		constraints.gridx = 0;
		constraints.gridy = 0;
		newPanel.add(labelName, constraints);

		constraints.gridx = 1;
		newPanel.add(textName, constraints);

		constraints.gridx = 0;
		constraints.gridy = 1;
		newPanel.add(labelRegistration, constraints);

		constraints.gridx = 1;
		newPanel.add(textRegistration, constraints);

		constraints.gridx = 0;
		constraints.gridy = 2;
		newPanel.add(labelAverage, constraints);

		constraints.gridx = 1;
		newPanel.add(textAverage, constraints);

		constraints.gridx = 0;
		constraints.gridy = 3;
		constraints.gridwidth = 2;
		constraints.anchor = GridBagConstraints.CENTER;
		newPanel.add(buttonGo, constraints);

		// set border for the panel
		newPanel.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createEtchedBorder(), "Entre com a descrição"));

		// add the panel to this frame
		add(newPanel);

		pack();
		setLocationRelativeTo(null);
		setVisible(true);

		// Add action listener to button
		buttonGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Perform function when button is pressed
				try {
					if ( StudentValidation.validationName(textName.getText())
							&& StudentValidation.validationRegistration(textRegistration.getText(), arrayStudent)
							&& StudentValidation.validationAverage(textAverage.getText()) ) 
					{
						if(Controller.Procedures.doesRegistrationExist(Integer.parseInt(textRegistration.getText()), arrayStudent)){
							JOptionPane.showMessageDialog(null,"Matrícula já existe","", JOptionPane.ERROR_MESSAGE);
						}else{
							Procedures.registerStudent(textName.getText(), textRegistration.getText(), Float.parseFloat(textAverage.getText()), arrayStudent);
							dispose();
						}
					}else{
						JOptionPane.showMessageDialog(null,"Dados Inválidos","Error", JOptionPane.ERROR_MESSAGE);	
					}
				} catch (Exception exception) {
					JOptionPane.showMessageDialog(null,"Error","Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

	}
}
