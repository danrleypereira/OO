//Declaração de classe com um método
import javax.swing.JOptionPane;

public class GradeBook
{
    //Exibe uma mensagem de boas vindas
    public void displayMessage( String courseName )
    {
        JOptionPane.showMessageDialog( null, "Welcome to the Grade Book " +
courseName + "!", "Dialog", JOptionPane.PLAIN_MESSAGE );
    }
}
