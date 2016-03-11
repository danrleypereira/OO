import javax.swing.JOptionPane; 

public class Addition{
    public static void main( String args[] )
    {
        String firstNumber,
            secondNumber;
        int number1,
            number2,
            sum;

        //lê o primeiro número como um String
        firstNumber = 
            JOptionPane.showInputDialog( "Enter first integer" );
        
        secondNumber = 
            JOptionPane.showInputDialog( "Enter second integer" );

        //Converte os números tipo String para o tipo Int
        number1 = Integer.parseInt( firstNumber );
        number2 = Integer.parseInt( secondNumber );
    
        sum = number1 + number2;

        //exibe os resultados
        JOptionPane.showMessageDialog(
            null, "The sum is " + sum, "Results",
            JOptionPane.PLAIN_MESSAGE );
        
        System.exit( 0 ); //termina o programa
        
    }
}
