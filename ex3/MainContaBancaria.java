import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class MainContaBancaria {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        List<ContaBancaria> banco = new ArrayList<ContaBancaria>();
        banco.add(new ContaBancaria(1, "Felipe"));
        banco.add(new ContaBancaria(2, "Teste 2"));
        while(true)
        {
            System.out.println("\nEscolha qual operação fazer:");
            System.out.println("1- Consultar conta");
            System.out.println("0- Sair");
            int option = scanner.nextInt();
            scanner.nextLine();
            
            if(option == 0)
            break;

            ContaBancaria minhaConta = null;
            
            switch(option) 
            {
                case 1:
                    System.out.println("Insira Numero da conta: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    Optional<ContaBancaria> selecionado = banco.stream().filter(conta -> conta.getNumeroConta() == id).findFirst();
                    minhaConta = selecionado.get();
                    System.out.println("\nBem-vindo " + minhaConta.getNomeTitular());

                    while(true)
                    {
                        System.out.println("\nEscolha qual operação fazer:");
                        System.out.println("1- Saque");
                        System.out.println("2- Deposito");
                        System.out.println("0- Sair");
                        int option2 = scanner.nextInt();
                        scanner.nextLine();
                        
                        if(option2 == 0)
                        break;
                        
                        switch(option2) 
                        {
                            case 1:
                                System.out.println("Quanto deseja sacar?");
                                double valorSaque = scanner.nextDouble();
                                scanner.nextLine();
                                minhaConta.Sacar(valorSaque);
                                break;
                            case 2:
                                System.out.println("Quanto deseja depositar?");
                                double valorDeposito = scanner.nextDouble();
                                scanner.nextLine();
                                minhaConta.Depositar(valorDeposito);
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
