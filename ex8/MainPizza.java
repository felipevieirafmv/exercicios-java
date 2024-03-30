import java.util.Scanner;

public class MainPizza
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pizza Marguerita = new Pizza("Marguerita", 30.0f, "Molho de tomate, queijo mussarela, manjericão");
        Pizza Calabresa = new Pizza("Calabresa", 35.0f, "Molho de tomate, queijo mussarela, calabresa, cebola, azeitona");
        Pizza FrangoCatupiry = new Pizza("Frango com Catupiry", 40.0f, "Molho de tomate, queijo mussarela, frango desfiado, catupiry");

        Pedido pedido = new Pedido();

        while (true) {
            System.out.println("\nEscolha uma pizza:");
            System.out.println("1- Marguerita");
            System.out.println("2- Calabresa");
            System.out.println("3- Frango com Catupiry");
            System.out.println("0- Finalizar Pedido");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 0)
                break;

            switch (opcao) {
                case 1:
                    pedido.AdicionarPizza(Marguerita);
                    break;
                case 2:
                    pedido.AdicionarPizza(Calabresa);
                    break;
                case 3:
                    pedido.AdicionarPizza(FrangoCatupiry);
                    break;
                default:
                    break;
            }
        }

        System.out.println("\nInforme o endereço de entrega:");
        String enderecoEntrega = scanner.nextLine();
        pedido.setEnderecoEntrega(enderecoEntrega);

        pedido.gerarRelatorio();
    }
}
