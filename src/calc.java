import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 1 число");
        int operand1 = scan.nextInt();
        System.out.println("Введите операцию");
        char operation = scan.next().charAt(0);
        System.out.println("Введите 2 число");
        int operand2 = scan.nextInt();
        int result = 1;

            switch (operation) {
                case '-' :
                    result = operand1 - operand2;
                    break;
                case '+' :
                    result = operand1 + operand2;
                break;
                case '*' :
                    result = operand1 * operand2;
                break;
                case '/' :
                    result = operand1 / operand2;
                break;
                default:
                    System.out.println("Нет такого оператора");
            }

        System.out.println("Результат: " + result);
    }
}
