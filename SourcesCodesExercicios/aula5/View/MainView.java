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
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Model.Student;

public class MainView extends JFrame{
	
	private JButton buttonCancel = new JButton("Cancelar");
	private JButton buttonRegister = new JButton("Cadastrar");
	private JButton buttonShowTable = new JButton("Mostrar Tabela");
	private ArrayList<Student> studentArray = new ArrayList<Student>();
	
	
	public MainView() {
		super("Inicial");
		
		JPanel panel = new JPanel(new GridBagLayout());
		
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.anchor = GridBagConstraints.WEST;
		constraints.insets = new Insets(10, 10, 10, 10);
		
		// add components to the panel
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridwidth = 2;
		constraints.anchor = GridBagConstraints.CENTER;
		panel.add(buttonRegister, constraints);

		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.gridwidth = 2;
		constraints.anchor = GridBagConstraints.CENTER;
		panel.add(buttonShowTable, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 2;
		constraints.gridwidth = 2;
		constraints.anchor = GridBagConstraints.CENTER;
		panel.add(buttonCancel, constraints);
		
		
		// set border for the panel
				panel.setBorder(BorderFactory.createTitledBorder(
						BorderFactory.createEtchedBorder(), "Entre com a descrição"));

		// add the panel to this frame
		add(panel);
		
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		
		buttonRegister.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Register registerPanel = new Register(studentArray);
				
			}
		});
		
		buttonShowTable.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(studentArray.size() > 0){
					Table table = new Table(studentArray);
				}else{
					JOptionPane.showMessageDialog(null,"Não há dados","", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		buttonCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null,"Finalizando Aplicação","", JOptionPane.PLAIN_MESSAGE);
					dispose();
			}
		});
		
		
		
	}
	
	

}
