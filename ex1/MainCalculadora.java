import java.util.Scanner;

public class MainCalculadora {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            System.out.println("\nEscolha qual operação fazer:");
            System.out.println("1- Soma");
            System.out.println("2- Subtração");
            System.out.println("3- Multiplicação");
            System.out.println("4- Divisão");
            System.out.println("0- Sair");
            int option = scanner.nextInt();
            scanner.nextLine();

            if(option == 0)
                break;

            System.out.println("Digite o primeiro valor:");
            float x = scanner.nextFloat();
            scanner.nextLine();
            System.out.println("Digite o segundo valor:");
            float y = scanner.nextFloat();
            scanner.nextLine();
            
            float result = 0;

            switch(option) 
            {
                case 1:
                    result = Calculadora.Add(x, y);
                    System.out.println("\nO resultado é: " + result);
                    break;
                case 2:
                    result = Calculadora.Sub(x, y);
                    System.out.println("\nO resultado é: " + result);
                    break;
                case 3:
                    result = Calculadora.Mul(x, y);
                    System.out.println("\nO resultado é: " + result);
                    break;
                case 4:
                    result = Calculadora.Div(x, y);
                    if(result == 0)
                        break;
                    System.out.println("\nO resultado é: " + result);
                    break;
                default: 
                    break;
            }
        }
    }
}
