// Вывести все простые числа от 1 до 1000
/**
 * Task2
 */
public class Task2 {

    public static void main(String[] args) {
    for(int i = 1; i < 1001; i++)
    {
        int count = 0;
        for(int j = 2; j < i; j++)
        {
            if(i % j == 0) count++;
        }
        if(count == 0) System.out.println(i);
    }        
    }
}