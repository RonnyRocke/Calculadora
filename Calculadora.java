public class Calculadora {
    char adicao = '+';
    char subtracao = '-';
    char multiplicacao = '*';
    char divisao = '/';

    int result;

    public void somandonumeros(int num1, int num2) {
        result = num1 + num2;
    }

    public void subtraindonumeros(int num1, int num2) {
        result = num1 - num2;
    }

    public void multiplicandonumeros(int num1, int num2) {
        result = num1 * num2;
    }

    public void dividindonumeros(int num1, int num2) {
        result = num1 / num2;
    }
}
