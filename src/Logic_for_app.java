import java.util.ArrayList;
import java.util.Random;

public class Logic_for_app {
    public static void main(String[] args) {

//Создаём список стран
        System.out.println("Список стран:");
        ArrayList<String> country = new ArrayList<>();
        country.add("1. Белоруссия");
        country.add("2. Франция");
        country.add("3. Германия");
        country.add("4. Австралия");
        country.add("5. Япония");


//Выводим список стран
        for (String s : country) {
            System.out.println(s);
        }
        System.out.println();

//Создаём копию списка стран
        ArrayList<String> countryCopy = new ArrayList<>(country);

//Выводим копию списка стран
        System.out.println("Список стран-копия:");
        for (String sc : countryCopy) {
            System.out.println(sc);
        }
        System.out.println();
        System.out.println("Поехали!");

        //Нужно обработать действие после того, как список будет пуст... в процессе
        if (countryCopy.size() == 0) {
            System.out.println("Закончили! " + "Правильных ответов: ..." + "Стоит подумать над: ... ответами");
        } else {

            //Цикл - выбор страны случайной генерацией (в приложении это будет делать кнопка Далее)
            for (int f = 0; f < country.size(); f++) {

//Выбираем случайную страну
//В диапазоне, равном размеру копии-списка стран, создаём случайное число, с каждой итерацией, размер списка уменьшается на 1
                Random random_country = new Random();
                int number = random_country.nextInt(countryCopy.size());
                System.out.println();
                System.out.println("Случайное число: " + number);
                System.out.println("Случайная страна: " + countryCopy.get(number));
                System.out.println();

//Список стран-копия, скорректированный после нахождения 1 страны (эта страна из списка удаляется)
                countryCopy.remove(number);
                System.out.println("Список стран-копия после удаления: ");
                for (String sc : countryCopy) {
                    System.out.println(sc);
                }

            }
        }
    }
}