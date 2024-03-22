import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class MainLivro {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        List<Livro> biblioteca = new ArrayList<Livro>();
        while(true)
        {
            System.out.println("\nEscolha qual operação fazer:");
            System.out.println("1- Adicionar livro");
            System.out.println("2- Consultar livro");
            System.out.println("0- Sair");
            int option = scanner.nextInt();
            scanner.nextLine();
            
            if(option == 0)
            break;
            
            switch(option) 
            {
                case 1:
                    System.out.println("Insira o título do livro: ");
                    String titulo = scanner.nextLine();
                    System.out.println("Insira o autor do livro: ");
                    String autor = scanner.nextLine();
                    System.out.println("Insira o ano de lançamento do livro: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine();
                    biblioteca.add(new Livro(titulo, autor, ano));
                    System.out.println("Livro adicionado com sucesso");
                    break;
                case 2:
                    System.out.println("Insira o nome do livro a ser consultado: ");
                    String consulta = scanner.nextLine();
                    Optional<Livro> selecionado = biblioteca.stream().filter(livro -> livro.Titulo.equals(consulta)).findFirst();
                    selecionado.get().ExibirInfo();
                    break;
                default:
                    break;
            }
        }
    }
}
