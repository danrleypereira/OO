package view;

import javax.swing.JOptionPane;

public class Error {
	public static void error(){
		JOptionPane.showConfirmDialog(null, "Dado inválido", "ERROR", JOptionPane.OK_CANCEL_OPTION,JOptionPane.ERROR_MESSAGE);
	}
	public static void error(String errorMessage){
		JOptionPane.showConfirmDialog(null, errorMessage, "ERROR", JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
	}
}
