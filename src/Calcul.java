import java.util.Scanner;

public class Calcul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int operand1 = scanner.nextInt();
        System.out.print("Введите операцию (+, -, *, /):  ");
        char operation = scanner.next().charAt(0);
        System.out.print("Введите второе число: ");
        int operand2 = scanner.nextInt();
        int result = 1;
        switch (operation) {
            case '+' :
                result = operand1 + operand2;
                break;
            case '-' :
                result = operand1 - operand2;
                break;
            case '*' :
                result = operand1 * operand2;
                break;
            case '/' :
                if (operand2 != 0) {
                    result = operand1 / operand2;
                } else {
                    System.out.println("Деление на ноль недопустимо");
                }
                break;
            default:
                System.out.println("Некорректный ввод");
        break;
        }

        System.out.printf("Результат: " + result) ;
    }



}