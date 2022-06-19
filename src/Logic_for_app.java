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

        /*
        Вначале я хотел сделать так, чтобы страны (т.е. вопросы по странам) появлялись случайным образом,
        но возникла сложность с выводом правильного ответа - страна - столица. Первоначально думал сделать по номеру.
        Затем создать список стран-копию, и из него постепенно удалять по 1 стране, которые были уже названы.
        Однако в этом случае сбивалась общая нумерация стран, а без неё доставать правильные ответы - столицы,
        стало сложнее. И в итоге я отказался от этой сложной конструкции.
        Возможно она будет в следующих обновлениях.
        А пока что страны будут возникать по алфавиту.
        При этом ответы будут добавляться в список вариантов ответом следующим образом:
        1. Ответ - правильный - соответствует номеру страны и = номеру в списке столиц
        2. Неправильный ответ - генерируется из списка столиц и он не равен правильному
        3. Неправильный ответ - генерируется из списка столиц и он не равен правильному и 2 неправильному
        4. Неправильный ответ - генерируется из списка столиц и он не равен правильному, 2 и 3 неправильным
        Затем мы добавляем полученные ответ в массив. Этот массив перемешиваем и получаем список, с последовательностью
        кнопок для вывода на экран. То есть правильный ответ будет попадаться в разных местах.
         */

        System.out.println();
        System.out.println("Поехали!");
        System.out.println();


        //Цикл - выбор страны по порядку (в приложении это будет делать кнопка Далее или проверка)
        for (int i = 0; i < country.size(); i++) {
            System.out.println("Какая столица у страны - " + country.get(i) + " ?");
            System.out.println();
            System.out.println("Варианты ответов:");

            //Правильный - берётся по номеру страны из списка столиц:
            // System.out.println(capital.get(i));
            //Неверный 1 - генерируется случайным образом из числа позиций в списке столиц
            Random random_capital_1 = new Random();
            int incorrect_random_capital_1 = random_capital_1.nextInt(capital.size());
            //Исключаем дублирования столиц
            while (incorrect_random_capital_1 == i){
                incorrect_random_capital_1 = random_capital_1.nextInt(capital.size());
            }

            // System.out.println(capital.get(incorrect_random_capital_1));

            //Неверный ответ2
            Random random_capital_2 = new Random();
            int incorrect_random_capital_2 = random_capital_2.nextInt(capital.size());
            //Исключаем дублирования столиц
            while (incorrect_random_capital_2 == i || incorrect_random_capital_2 == incorrect_random_capital_1){
                incorrect_random_capital_2 = random_capital_2.nextInt(capital.size());
            }
            // System.out.println(capital.get(incorrect_random_capital_2));

            //Неверный 3
            Random random_capital_3 = new Random();
            int incorrect_random_capital_3 = random_capital_3.nextInt(capital.size());
            //Исключаем дублирования столиц
            while (incorrect_random_capital_3 == i || incorrect_random_capital_3 == incorrect_random_capital_1 || incorrect_random_capital_3 == incorrect_random_capital_2){
                incorrect_random_capital_3 = random_capital_3.nextInt(capital.size());
            }
            // System.out.println(capital.get(incorrect_random_capital_3));


            //Создаём список с ответами. Пока что ответы в порядке создания, их надо перемешать
            ArrayList<String> answer_capital = new ArrayList<>();
            answer_capital.add(capital.get(i));
            answer_capital.add(capital.get(incorrect_random_capital_1));
            answer_capital.add(capital.get(incorrect_random_capital_2));
            answer_capital.add(capital.get(incorrect_random_capital_3));

            // Выводим список вариантов ответов на экран
            for (String cap : answer_capital){
                System.out.println(cap);
            }



            System.out.println("Введите номер столицы (1,2,3 или 4) и нажмите Enter:");
            String number_button = reader.readLine();
            int number_int = Integer.parseInt(number_button);
            System.out.println();


            //Мы проверяем список столиц и ищем там совпадение со столицей, которая была выбрана



            System.out.println("Вы ввели цифру: " + number_int + " это " + answer_capital.get(number_int));
            System.out.println();
        }
    }
}
/*
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
/*
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
*/