import java.util.ArrayList;
import java.util.Random;

public class NewTest {
    public static void main(String[] args) {
        Random rnd = new Random();
        int number = rnd.nextInt(5);
        System.out.println("Случайное число: " + number);
        System.out.println();

//Создаём список стран
                System.out.println("Список стран:");
        ArrayList<String> country = new ArrayList<>();
        country.add("1. Белоруссия");
        country.add("2. Франция");
        country.add("3. Германия");
        country.add("4. Австралия");
        country.add("5. Япония");


//Создаём копию списка стран
        ArrayList<String> countryCopy = new ArrayList<>(country);

//Выводим список стран
        for (String s : country) {
            System.out.println(s);
        }

//Выводим копию списка стран
        System.out.println("Список стран-копия:");
        for (String sc : countryCopy) {
            System.out.println(sc);
        }
        System.out.println();


        System.out.println("Случайная страна:");
        System.out.println(country.get(number));
        System.out.println();

        for (int i = 0; i < 10; i++) {
            Random rand = new Random();
            int number1 = rand.nextInt(5);
            System.out.println(country.get(number1));
        }


    }
}
