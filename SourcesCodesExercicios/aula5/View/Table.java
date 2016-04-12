package View;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Model.Student;


public class Table extends JFrame{
	String[] columns = {"Nome", "Matrícula", "Média"};
	
	public Table(ArrayList<Student> arrayStudent){
		DefaultTableModel tableModel = new DefaultTableModel(columns, 0);
		tableModel.addRow(columns);
		
		for(int i = 0; i < arrayStudent.size(); i++){
			String name = arrayStudent.get(i).getName();
			String registration = arrayStudent.get(i).getRegistration();
			float average = arrayStudent.get(i).getAverage();
			
			Object[] data = {name, registration, average};

			tableModel.addRow(data);
		}
		JTable table = new JTable(tableModel);
		add(table);
		
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
}
