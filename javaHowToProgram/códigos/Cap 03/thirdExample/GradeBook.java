//Declaração de classe com um método
import javax.swing.JOptionPane;

public class GradeBook
{
    private String courseName; //Variável de instância

    //o construtor inicializa courseName com o argumento String
    public GradeBook( String name )
    {
        courseName = name;//inicializa o courseName
    }
    
    //método para configurar o nome do curso
    public void setCourseName( String name )
    {
        courseName = name;//armazena o nome do curso
    }

    //método para recuperar o nome do curso
    public String getCourseName()
    {
        return courseName;
    }
    
    //Exibe uma mensagem de boas vindas
    public void displayMessage()
    {
        JOptionPane.showMessageDialog( null, "Welcome to the Grade Book " +
getCourseName() + "!", "Dialog", JOptionPane.PLAIN_MESSAGE );
    }
}
