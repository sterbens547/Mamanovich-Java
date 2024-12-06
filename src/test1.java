import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        // Ввод данных
        Scanner scan = new Scanner(System.in);

        System.out.println("Ведиде число а:");
        float num1 = scan.nextFloat();

        System.out.println("введите число б");
        float num2 = scan.nextFloat();
        // сравнение
        if (num1 > num2) {
            System.out.println("Число а больше.");
        }
        else if (num1 < num2) {
            System.out.println("Число б больше.");
        } else if (num1 == num2) {
            System.out.println("Числа равны");
        }
        //калякулятор
        System.out.println("Сумма:" +(num1 + num2));
        System.out.println("Вычетание:" +(num1 - num2));
        System.out.println("Умножение:" + (num1 * num2));
        if (num2 != 0) {
            System.out.println("Деление:" + (num1 / num2));
        }else
            System.out.println("Действие недопустимо");



    }
    }