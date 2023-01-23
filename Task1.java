import java.util.Scanner;

// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
public class Task1 {
    public static void main(String[] args) {

    Scanner iScanner = new Scanner(System.in);
    System.out.print("Введите число: ");

    int num = iScanner.nextInt();
    int sum = 0;
    int multiplication = 1;
    for(int i = 1; i < num + 1; i++)
    {
        sum += i;
        multiplication *= i;
    }
    System.out.println("Вы ввели число -> " + num);
    System.out.println("Сумма -> " + sum);
    System.out.println("Произведение -> " + multiplication);
    iScanner.close();

    }
    
}
