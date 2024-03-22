import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class MainJogador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        List<Jogador> jogadores = new ArrayList<Jogador>();
        jogadores.add(new Jogador("Felipe"));
        jogadores.add(new Jogador("Teste"));
        System.out.println("Insira o nome do jogador: ");
        String consulta = scanner.nextLine();
        Optional<Jogador> selecionado = jogadores.stream()
            .filter(player -> player.getNome().equals(consulta)).findFirst();
        Jogador jogadorAtual = selecionado.get();
        System.out.println("\nBem-vindo " + jogadorAtual.getNome());

        while(true)
        {
            System.out.println("\nEscolha qual operação fazer:");
            System.out.println("1- Aumentar nivel");
            System.out.println("2- Aumentar pontuacao");
            System.out.println("3- Ver informacoes");
            System.out.println("0- Sair");
            int option = scanner.nextInt();
            scanner.nextLine();
            
            if(option == 0)
            break;
            
            switch(option) 
            {
                case 1:
                    System.out.println("Quantos niveis deseja aumentar?");
                    int niveisSubiu = scanner.nextInt();
                    scanner.nextLine();
                    jogadorAtual.setNivel(niveisSubiu + jogadorAtual.getNivel());
                    break;
                case 2:
                    System.out.println("Quantos pontos voce fez?");
                    int pontosSubiu = scanner.nextInt();
                    scanner.nextLine();
                    jogadorAtual.setPontuacao(pontosSubiu + jogadorAtual.getPontuacao());
                    break;
                case 3:
                    jogadorAtual.exibirInformacoes();
                    break;
                default:
                    break;
            }
        }
    }
}
