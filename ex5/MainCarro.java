import java.util.Scanner;

public class MainCarro {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a marca do carro: ");
        String marca = scanner.nextLine();
        System.out.println("Insira o modelo do carro: ");
        String modelo = scanner.nextLine();
        System.out.println("Insira o ano do carro: ");
        int ano = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Insira a placa do carro: ");
        String placa = scanner.nextLine();

        Carro myCar = new Carro(marca, modelo, ano, placa);

        while(true)
        {
            System.out.println("\nEscolha qual operação fazer:");
            System.out.println("1- Acelerar");
            System.out.println("2- Frear");
            System.out.println("3- Ver informacoes");
            System.out.println("0- Sair");
            int option = scanner.nextInt();
            scanner.nextLine();
            
            if(option == 0)
            break;
            
            switch(option) 
            {
                case 1:
                    myCar.Acelerar();
                    break;
                case 2:
                    myCar.Frear();
                    break;
                case 3:
                    myCar.ExibirInfo();
                    break;
                default:
                    break;
            }
        }
    }
}
