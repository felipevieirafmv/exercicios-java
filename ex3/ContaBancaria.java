public class ContaBancaria {
    
    private int numeroConta;
    public int getNumeroConta()
    {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta)
    {
        this.numeroConta = numeroConta;
    }

    private String nomeTitular;
    public String getNomeTitular()
    {
        return nomeTitular;
    }
    public void setNomeTitular(String nomeTitular)
    {
        this.nomeTitular = nomeTitular;
    }

    private double saldo;
    public double getSaldo()
    {
        return saldo;
    }
    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }

    public ContaBancaria(int numeroConta, String nomeTitular)
    {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 0;
    }

    public void Depositar(double valor)
    {
        this.saldo += valor;
        System.out.println("Depósito realizado, seu saldo agora é: " + this.saldo);
    }

    public void Sacar(double valor)
    {
        if(this.saldo < valor)
        {
            System.out.println("Saldo insuficiente");
            return;
        }
        this.saldo -= valor;
        System.out.println("Saque realizado, seu saldo agora é: " + this.saldo);
    }
}
