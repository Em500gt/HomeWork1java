import java.util.Scanner;

// Реализовать простой калькулятор (пользователь вводит 2 числа и вводит операцию (+ - / *). int a ; int b; String op (op!=”Stop”); (char != ’b’)
/**
 * Task3
 */
public class Task3 {

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в калькулятор.");
        Scanner iScanner = new Scanner(System.in);

        boolean status = true;
        while (status) {
            System.out.print("Введите первое число: ");
            int first = iScanner.nextInt();

            System.out.print("Введите второе число: ");
            int second = iScanner.nextInt();

            System.out.print("Введите операцию (+ - / *): ");
            char op = iScanner.next().charAt(0);

            System.out.println(oper(first, second, op));
            System.out.println("Для выхода введите -> s\nПродолжить -> Любой другой символ");

            op = iScanner.next().charAt(0);
            if(op == 's') status = false;
        }

        iScanner.close();
        System.out.println("Спасибо!");

    }

    public static int oper(int a, int b, char o) {
        int result = 0;
        switch (o) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if(b != 0) result = a / b;
                else System.out.println("Деление на ноль!");
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
        }
        return result;        
    }
    
}
