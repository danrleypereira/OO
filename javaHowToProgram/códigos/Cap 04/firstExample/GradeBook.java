//Declaração de classe com um método
import javax.swing.JOptionPane;
import java.util.Scanner;

public class GradeBook
{
    private String courseName; //Variável de instância, pois String é uma classe

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
    
    public void determineClassAverage()
    {
        Scanner input = new Scanner( System.in ); //input é um objeto Scanner
        
        int total = 0;
        int gradeCounter = 0;
        int grade;
        double average;

        System.out.println( "Enter grade or -1 to quit:" );
        grade = input.nextInt();

        while( grade != -1 )
        {
            total = total + grade;
            gradeCounter = gradeCounter + 1;
            
            System.out.println( "Enter grade or -1 to quit:" );
            grade = input.nextInt();
        }

        if(gradeCounter != 0)
        {
            average = (double) total / gradeCounter;//Casting, total é um inteiro()
         
            System.out.printf( "\nTotal of the %d grades entered is %d\n", gradeCounter, total );
            System.out.printf( "\nClass average is %.2f.\n", average );
        }     
        else
        {
            System.out.println( "\nNO GRADES WERE ENTERED\n");
        }
    }
    
}
