import javax.swing.JOptionPane;

public class Comparison{
    public static void main( String args[] )
    {
        String firstNumber,
            secondNumber,
            result;//contendo a saida

        int number1,
            number2;

        firstNumber = 
            JOptionPane.showInputDialog( "Enter first Integer " );
        secondNumber = 
            JOptionPane.showInputDialog( "Enter second Integer " );
        
        number1 = Integer.parseInt( firstNumber );
        number2 = Integer.parseInt( secondNumber );

        //inicializa o resultado com o String vazio
        result = "";

        if(number1 == number2)
        {
            result = result + number1 + " == " + number2;
        }
        if(number1 != number2)
        {
            result = result + number1 + " != " + number2;
        }
        if(number1 < number2)
        {
            result = result + "\n" + number1 + " < " + number2;
        }
        if(number1 > number2)
        {
            result = result + "\n" + number1 + " > " + number2;
        }
        if(number1 <= number2)
        {
            result = result + "\n" + number1 + " <= " + number2;
        }
        if(number1 >= number2)
        {
            result = result + "\n" + number1 + " >= " + number2;
        }

        JOptionPane.showMessageDialog(
            null, result, "Comparison Results",
            JOptionPane.INFORMATION_MESSAGE );

        System.exit( 0 );
    }
}
