import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Logic_for_app {
    public static void main(String[] args) throws IOException {

        //Создаём систему ввода с клавиатуры
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//Создаём список стран
        System.out.println("Список стран:");
        ArrayList<String> country = new ArrayList<>();
        country.add("0. Белоруссия");
        country.add("1. Франция");
        country.add("2. Германия");
        country.add("3. Австралия");
        country.add("4. Япония");


//Выводим список стран
        for (String s : country) {
            System.out.println(s);
        }
        System.out.println();

        //Создаём список столиц
        System.out.println("Список столиц:");
        ArrayList<String> capital = new ArrayList<>();
        capital.add("0. Минск");
        capital.add("1. Париж");
        capital.add("2. Берлин");
        capital.add("3. Канберра");
        capital.add("4. Токио");

        //Выводим список столиц на экран
        for (String capitalList : capital) {
            System.out.println(capitalList);
        }
        System.out.println();

//Создаём копию списка стран
        ArrayList<String> countryCopy = new ArrayList<>(country);

//Выводим копию списка стран
        System.out.println("Список стран-копия:");
        for (String counry_copy : countryCopy) {
            System.out.println(counry_copy);
        }
        System.out.println();
        System.out.println("Поехали!");


        //Цикл - выбор страны случайной генерацией (в приложении это будет делать кнопка Далее)
        for (int f = 0; f < country.size(); f++) {

            //Нужно обработать действие после того, как список будет пуст... !!!в процессе!!!
            if (countryCopy.size() == 1) {
                System.out.println();
                System.out.println("Закончили! " + "Правильных ответов: ..." + "Стоит подумать над: ... ответами");
            } else {

//Выбираем случайную страну
//В диапазоне, равном размеру копии-списка стран, создаём случайное число, с каждой итерацией, размер списка уменьшается на 1
                Random random_country = new Random();
                int number = random_country.nextInt(countryCopy.size());
                System.out.println();
                System.out.println("Случайное число: " + number);
                System.out.println("Случайная страна: " + countryCopy.get(number));
                System.out.println("Какая столица страны: " + countryCopy.get(number) + " - ?");
                System.out.println("Введите номер страны:");
                String number_button = reader.readLine();
                int number_int = Integer.parseInt(number_button);
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