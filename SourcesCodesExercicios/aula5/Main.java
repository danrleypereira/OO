/**
 * Síntese 
	 * Objetivo: Armazenar dados de quantos alunos o usuário desejar tratando as excessões;
	 * Entrada: Nome completo de um aluno, sua matrícula na instituição e sua média final; 
	 * Saída: Apresentar os dados, depois de os ter armazenado, em formato tabelar.
 */

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import View.MainView;

public class Main {
	public static void main(String[] args) {
		final View.MainView panel = new MainView();
		
		// set look and feel to the system look and feel
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
         
        SwingUtilities.invokeLater(new Runnable() {
			
			public void run() {
				panel.setVisible(true);
			}
		});
	}
}
