public class JR_Temporary {
    public static void main (String[] agrs) {
        int number_base = 678;
        int number2 = number_base % 10;
        int number1 = number2 % 10;

        System.out.print("Базовое трёхзначное число: ");
        System.out.println(number_base);

        System.out.println(number2);
        System.out.println(number1);
    }
}
