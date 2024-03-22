import java.util.Scanner;

public class MainAgenda {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();
        while(true)
        {
            System.out.println("\nEscolha qual opcao voce deseja:");
            System.out.println("1- Criar contato");
            System.out.println("2- Buscar contato");
            System.out.println("0- Sair");
            int option = scanner.nextInt();
            scanner.nextLine();
            
            if(option == 0)
            break;
            
            switch(option) 
            {
                case 1:
                    System.out.println("Qual o nome do contato?");
                    String nome = scanner.nextLine();
                    System.out.println("Qual o numero do contato?");
                    String telefone = scanner.nextLine();
                    agenda.AddContato(nome, telefone);;
                    break;
                case 2:
                    System.out.println("Qual o nome do contato?");
                    String nomeBusca = scanner.nextLine();
                    Contato selecionado = agenda.BuscarContato(nomeBusca);
                    selecionado.ExibirInfo();
                    break;
                default:
                    break;
            }
        }
    }
}
