//Criando um objeto GradeBook e chamando seu método displayMessage.
import java.util.Scanner;

public class GradeBookTest
{
    public static void main( String[] args)
    {
        //Cria Scanner para obter entrada a partir da janela de comando.
        Scanner input = new Scanner( System.in );
        
        //Cria um objeto GradeBook e atribui a myGradeBook
        //e passa nameOfCourse como argumento
        GradeBook myGradeBook = new GradeBook();
        
        //Exibe o valor inicial de courseName
        System.out.printf( "Initial course name is: %s\n\n",
            myGradeBook.getCourseName() );

        //Prompt para entrada do nome do curso
        System.out.println( "Please enter the course name:" );
        String theName = input.nextLine();
        myGradeBook.setCourseName( theName );
        System.out.println(); //gera saída de uma linha em branco

        //Chama o método displayMessage de myGradeBook
        myGradeBook.displayMessage();
        myGradeBook.determineClassAverage();
    }
}
