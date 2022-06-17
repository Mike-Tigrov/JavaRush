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
// Мы удаляем из списка именно ту страну, которая была выбрана до этого, чтобы в следующем случайном вызове её не было
                Random random_country = new Random();
                int general_number = random_country.nextInt(countryCopy.size());
                System.out.println();
                System.out.println("Случайное число: " + general_number);
                System.out.println("Случайному числу " + general_number + " соответствует страна: " + countryCopy.get(general_number));

                String country_to_char = countryCopy.get(general_number);
                char first_simbol = country_to_char.charAt(0);
                System.out.println("Первый символ строки из списка стран: " + country_to_char + " Первый символ - " + first_simbol);

                System.out.println("Какая столица страны: " + countryCopy.get(general_number) + " - ?");
                System.out.println("Варианты ответов:");



                /* Сноска с описанием переменных:
                general_number - общий номер. Создаётся случайно. По этому номеру появляется страна в вопросе и правильная столица в ответах
Так как у нас удаляются страны из списка-копии, то у нас меняются значения позиций и страны перестают соответствовать столицам по номеру позиции из 2х списков.
Поэтому мы ищем в строке первый символ, а он у нас "цифра" и по нему уже ищем столицу.

String str = "Первый символ строки";
int first = str.length()-1;// на форуме где читал, там был пример с последним символом, поэтому -1, а 0 не работает
char ch = str.charAt(first);
System.out.println(ch);
char c = str.charAt(0);
                 */

                        //Нужно сформировать список стран, которые заполнят варианты ответов.
                //Для этого нужно, чтобы на случайное место, встала правильная страна,
                //А остальные 3 места заняли случайные страны из оставшегося списка
                        //Необходимо составить список из правильной столицы и 3х случайных, затем генератором случайных чисел заполнить массив и уже этот массив выдавать
                        //как данные для 4х кнопок

                //Кнопка с правильным ответом
                    System.out.println(capital.get(general_number));
/*
... мы берём 1 столицу из списка столиц по номеру страны. 3 других мы получаем генератором сл.чисел, и следим, чтобы из этих трёх столиц не было дублей.

То есть, используем генератор на второй столице. Если выпадает такое же число, генерируем ещё раз.
Третья столица не должна быть равна 1 и 2.
Четвёртая не должна быть равна 1,2 и 3.

Таким образом, у нас есть 4 разные цифры.

Мы записываем их в массив.
Массив мы перемешиваем генератором.
Перемешанный массив уже имеет случайное распределение столиц на 4 кнопках. И его используем для установления текстов на кнопках.
...
После каждого нажатия кнопки срабатывает счётчик.
Общий счётчик вопросов
Счётчик правильных ответов
Счётчик неправильных ответов
...
И как решить вопрос с оставшейся последней страной?
 */

                //Кнопка с неправильным ответом №1, которая отличается от кнопки с правильным ответом
                Random random_capital_1 = new Random();
                    int number_random_capital_1 = random_capital_1.nextInt(capital.size());
                    if (number_random_capital_1 == general_number) {
                        number_random_capital_1 = random_capital_1.nextInt(capital.size());
                    }
                    System.out.println(capital.get(number_random_capital_1));

                    //Кнопка с неправильным ответом №2, которая отличается от кнопки с правильным ответом и кнопки с неправильным ответом №1
                Random random_capital_2 = new Random();
                //генерируем случайную цифру
                int number_random_capital_2 = random_capital_2.nextInt(capital.size());
                //Если случайная цифра равна правильной кнопке
                if (number_random_capital_2 == general_number || number_random_capital_2 == number_random_capital_1) {
                    number_random_capital_2 = random_capital_2.nextInt(capital.size());
                }
              System.out.println(capital.get(number_random_capital_2));

//Кнопка с неправильным ответом №3, которая отличается от кнопки с правильным ответом и кнопок с неправильным ответом №1 и №2
                Random random_capital_3 = new Random();
                int number_random_capital_3 = random_capital_3.nextInt(capital.size());
                if (number_random_capital_3 == general_number || number_random_capital_3 == number_random_capital_1 || number_random_capital_3 == number_random_capital_2) {
                    number_random_capital_3 = random_capital_3.nextInt(capital.size());

                }

                System.out.println(capital.get(number_random_capital_3));

                System.out.println("Введите номер страны и нажмите Enter:");
                String number_button = reader.readLine();
                int number_int = Integer.parseInt(number_button);
                System.out.println();

//Список стран-копия, скорректированный после нахождения 1 страны (эта страна из списка удаляется)
                countryCopy.remove(general_number);
                System.out.println("Список стран-копия после удаления: ");
                for (String sc : countryCopy) {
                    System.out.println(sc);
                }

            }
        }
    }
}