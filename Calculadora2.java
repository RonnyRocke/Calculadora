import java.util.Scanner;

public class Calculadora2 {

    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        Scanner sc = new Scanner(System.in);

        System.out.println("DIGITE DOIS NÚMEROS: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("ESCOLHA A OPERAÇÃO (+, -, *, /): ");
        char operacao = sc.next().charAt(0);

        switch (operacao) {
            case '+':
                c.somandonumeros(num1, num2);
                System.out.println("Resultado: " + c.result);
                System.out.println("******************");
                break;
            case '-':
                c.subtraindonumeros(num1, num2);
                System.out.println("Resultado: " + c.result);
                System.out.println("******************");
                break;
            case '*':
                c.multiplicandonumeros(num1, num2);
                System.out.println("Resultado: " + c.result);
                System.out.println("******************");
                break;
            case '/':
                if (num2 != 0) {
                    c.dividindonumeros(num1, num2);
                    System.out.println("Resultado: " + c.result);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                System.out.println("******************");
                break;
            default:
                System.out.println("Operação inválida.");
                System.out.println("******************");
        }

        sc.close();
    }
}
