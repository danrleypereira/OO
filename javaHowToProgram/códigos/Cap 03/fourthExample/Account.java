//classe Account com um construtor para validar e 
//inicializar a variável de instância balance do tipo double

public class Account
{
    private double balance; //variável de instância que armazena o saldo

    public Account( double initialBalance )
    {
        //valida se initialBalance é maior que 0.0;
        //se não, o saldo é inicializado com o valor padrão 0.0;
        if( initialBalance > 0.0 )
        {
            balance = initialBalance;
        }
    }

    //credita (adiciona) um valor a conta
    public void credit( double amount )
    {
        balance = balance + amount;
    }
    
    //retorna o saldo da conta
    public double getBalance()
    {
        return balance;
    }
}
