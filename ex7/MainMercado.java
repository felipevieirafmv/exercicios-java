package ex7;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class MainMercado {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        List<Produto> mercado = new ArrayList<Produto>();
        while(true)
        {
            System.out.println("\nEscolha qual opcao voce deseja:");
            System.out.println("1- Adicionar produto");
            System.out.println("2- Buscar produto");
            System.out.println("0- Sair");
            int option = scanner.nextInt();
            scanner.nextLine();
            
            if(option == 0)
            break;
            
            switch(option) 
            {
                case 1:
                    System.out.println("Qual o nome do produto?");
                    String nome = scanner.nextLine();
                    System.out.println("Qual o codigo do produto?");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Qual o preco do produto?");
                    float preco = scanner.nextFloat();
                    scanner.nextLine();
                    System.out.println("Quantos produtos desse deseja adicionar?");
                    int quantidade = scanner.nextInt();
                    scanner.nextLine();
                    mercado.add(new Produto(nome, codigo, preco, quantidade));
                    break;
                case 2:
                    System.out.println("Qual o codigo do produto?");
                    int cdgBusca = scanner.nextInt();
                    scanner.nextLine();
                    Optional<Produto> selecionado = mercado.stream()
                        .filter(prd -> prd.getCodigo() == cdgBusca).findFirst();

                    Produto prdSelected = selecionado.get();

                    while(true)
                    {
                        System.out.println("\nEscolha qual opcao voce deseja:");
                        System.out.println("1- Aumentar estoque");
                        System.out.println("2- Diminuir estoque");
                        System.out.println("3- Informacoes gerais");
                        System.out.println("4- Alterar preço");
                        System.out.println("0- Voltar");
                        int option2 = scanner.nextInt();
                        scanner.nextLine();
                        
                        if(option2 == 0)
                        break;
                        
                        switch(option2) 
                        {
                            case 1:
                                System.out.println("Quanto deseja adicionar no estoque?");
                                int quantAdd = scanner.nextInt();
                                scanner.nextLine();
                                prdSelected.AddEstoque(quantAdd);
                                break;
                            case 2:
                                System.out.println("Quanto deseja remover do estoque?");
                                int quantRmv = scanner.nextInt();
                                scanner.nextLine();
                                prdSelected.RemoveEstoque(quantRmv);
                                break;
                            case 3:
                                prdSelected.ShowInfo();
                                break;
                            case 4:
                                System.out.println("Qual o novo valor?");
                                float novoValor = scanner.nextFloat();
                                scanner.nextLine();
                                prdSelected.setPreco(novoValor);
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
