import java.util.Scanner;

public class test2 {
    {
        public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение a:");
        String num = scanner.nextLine();
        System.out.println("Введиде значение б");
        String num1 = scanner.nextLine();
        if (num.equals(num1)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }

    }
    }

}
