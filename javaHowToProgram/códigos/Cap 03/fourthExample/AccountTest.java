import java.util.Scanner;
//import java.util.Locale;

public class AccountTest
{
    public static void main( String args[] )
    {
        //Cria os objetos
        Account account1 = new Account( 50.00 );
        Account account2 = new Account( -7.53 );

        //exibe o saldo inicial de cada objeto
        System.out.printf( "account1 balance is: $%.2f \n",
            account1.getBalance() );
        System.out.printf( "account2 balance is: $%.2f \n",
            account2.getBalance() );

        //Cria Scanner para obter entrada a patir do teclado
        Scanner input = new Scanner( System.in );
//→→→→  Scanner.useLocale(Locale.US);
        double depositAmount;//quantia de depósito lida a partir do usuário
        
        System.out.print( "Enter deposit amount for account1: " );
        depositAmount = input.nextDouble();
        System.out.printf( "\n adding %.2f to account1 balance\n\n",
            depositAmount );
        account1.credit( depositAmount );//adiciona saldo a account1

        //exibe os saldos
        System.out.printf( "account1 balance is: $%.2f \n",
            account1.getBalance() );
        System.out.printf( "account2 balance is: $%.2f \n",
            account2.getBalance() );

        //prompt
        System.out.print( "Enter deposit amount for account2: " );
        depositAmount = input.nextDouble();
        System.out.printf( "\n adding %.2f to account2 balance\n\n",
            depositAmount );
        account2.credit( depositAmount );//adiciona saldo a account2
        
        //exibe os saldos
        System.out.printf( "account1 balance is: $%.2f \n",
            account1.getBalance() );
        System.out.printf( "account2 balance is: $%.2f \n",
            account2.getBalance() );
        
    }
}
