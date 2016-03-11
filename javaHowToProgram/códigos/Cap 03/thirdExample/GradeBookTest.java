//Criando um objeto GradeBook e chamando seu método displayMessage.
import java.util.Scanner;

public class GradeBookTest
{
    public static void main( String[] args)
    {
        //Cria Scanner para obter entrada a partir da janela de comando.
        Scanner input = new Scanner( System.in );
        
        System.out.println( "Please enter the first course name:" );
        String theName1 = input.nextLine();
        System.out.println( "Please enter the second course name:" );
        String theName2 = input.nextLine();

        //Cria um objeto GradeBook e atribui a myGradeBook
        //e passa nameOfCourse como argumento
        GradeBook myGradeBook1 = new GradeBook( theName1 );
        GradeBook myGradeBook2 = new GradeBook( theName2 );
        
        //Prompt para entrada do nome do curso
        System.out.println(); //gera saída de uma linha em branco

        myGradeBook1.getCourseName();
        myGradeBook2.getCourseName();

        //Chama o método displayMessage de myGradeBook
        myGradeBook1.displayMessage();
        myGradeBook2.displayMessage();
    }
}
