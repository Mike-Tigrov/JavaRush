public class JR_Temporary_code {
    public static void main (String[] agrs) {
        int number_base = 678;
        int number3 = number_base % 10;
        int number1 = number_base / 100;
        int number2 = (number_base / 10) % 10;

        System.out.print("Базовое трёхзначное число: ");
        System.out.println(number_base);

        System.out.print("Первая цифра базового числа: ");
        System.out.println(number1);

        System.out.print("Вторая цифра базового числа: ");
        System.out.println(number2);

        System.out.print("Третья цифра базового числа: ");
        System.out.println(number3);

System.out.print("Сумма цифр базового числа: ");
System.out.println(number1 + number2 + number3);


    }
}

