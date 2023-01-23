// *+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет. 24 45 //24 + 45 = 69 (n=2)

/**
 * Task4
 */
public class Task4 {

    public static void main(String[] args) {
        String str = "2x + x5 = 69";

        str = str.replaceAll(" ", "");
        String a = str.substring(0, str.indexOf("+"));
        String b = str.substring(str.indexOf("+") + 1, str.indexOf("="));
        int result = Integer.parseInt(str.substring(str.indexOf("=") + 1));

        for(int i = 0; i < 10; i++){
            String num = Integer.toString(i);
            int first = Integer.parseInt(a.replaceAll("x", num));
            int second = Integer.parseInt(b.replaceAll("x", num));
            
            if(first + second == result) System.out.println(i);
        }

    }
    
}