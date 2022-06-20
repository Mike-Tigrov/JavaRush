import java.io.*;
import java.util.ArrayList;

import java.util.Random;

public class Logic_for_app {
    public static void main(String[] args) throws IOException {

        //Создаём систему ввода с клавиатуры
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//Создаём список стран
        //System.out.println("Список стран:");
        ArrayList<String> country = new ArrayList<>();
        country.add("0. Белоруссия");
        country.add("1. Франция");
        country.add("2. Германия");
        country.add("3. Австралия");
        country.add("4. Япония");

/*Выводим список стран
        for (String s : country) {
            System.out.println(s);
        }
        System.out.println();

 */

        //Создаём список столиц
        //System.out.println("Список столиц:");
        ArrayList<String> capital = new ArrayList<>();
        capital.add("0. Минск");
        capital.add("1. Париж");
        capital.add("2. Берлин");
        capital.add("3. Канберра");
        capital.add("4. Токио");

        /*Выводим список столиц на экран
        for (String capitalList : capital) {
            System.out.println(capitalList);
        }

         */

        /*
        Вначале я хотел сделать так, чтобы страны (т.е. вопросы по странам) появлялись случайным образом,
        но возникла сложность с выводом правильного ответа - страна - столица. Первоначально думал сделать по номеру.
        Затем создать список стран-копию, и из него постепенно удалять по 1 стране, которые были уже названы.
        Однако в этом случае сбивалась общая нумерация стран, а без неё доставать правильные ответы - столицы,
        стало сложнее. И в итоге я отказался от этой сложной конструкции.
        Возможно она будет в следующих обновлениях.

        А пока что страны будут возникать по алфавиту.
        При этом ответы будут добавляться в список вариантов ответом следующим образом:
        1. Ответ - правильный - соответствует номеру страны и = номеру в списке столиц.
        2. Неправильный ответ - генерируется случайно из списка столиц и он не равен правильному.
        3. Неправильный ответ - генерируется случайно из списка столиц и он не равен правильному и 2 неправильному.
        4. Неправильный ответ - генерируется случайно из списка столиц и он не равен правильному, 2 и 3 неправильным.

        Затем мы добавляем полученные 4 ответа в массив. Этот массив перемешиваем и получаем список, с последовательностью
        кнопок для вывода на экран. То есть правильный ответ будет попадаться в разных местах.

        Перемешивание массива с вариантами ответом реализуется путём перемешивания двух позиций, т.е. позиция правильного
        ответа и случайная позиция меняются местами.
         */

        System.out.println();
        System.out.println("Поехали!");
        System.out.println();


        //Цикл - выбор страны по порядку (в приложении это будет делать кнопка Далее или проверка)
        for (int i = 0; i < country.size(); i++) {
            System.out.println();
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
            String[] answer_capital = new String[4];
            answer_capital[0] = capital.get(i);
            answer_capital[1] = capital.get(incorrect_random_capital_1);
            answer_capital[2] = capital.get(incorrect_random_capital_2);
            answer_capital[3] = capital.get(incorrect_random_capital_3);

            /* Выводим неперемешаный список вариантов ответов на экран
            for (String cap : answer_capital){
                System.out.println(cap);
            }
             */

            //Перемешиваем список
//Мы меняем в массиве местами 2 позиции: позицию правильного ответа и позицию случайной строки
//                    System.out.println("Начали перемешивать" );
            Random a_c = new Random();
            int temp_i = a_c.nextInt(answer_capital.length);
            String temp = answer_capital[temp_i];
            //System.out.println("Сгенерировали случайное число " + temp_i + " и поменяли местами 2 позиции: позицию правильного ответа и случайного числа");
            answer_capital[temp_i] = answer_capital[0];
            answer_capital[0] = temp;
            //Выводим перемешаный список на экран
            for (String cap : answer_capital){
                System.out.println(cap);
            }


            System.out.println("Введите номер столицы (1,2,3 или 4) и нажмите Enter:");
            String number_button = reader.readLine();
            int number_int = Integer.parseInt(number_button);
            System.out.println();

            //Мы проверяем список столиц и ищем там совпадение со столицей, которая была выбрана
            System.out.println("Вы ввели цифру: " + number_int + " это " + answer_capital[number_int-1]);
            System.out.println();

            //Алгоритм проверки правильности выбора столицы:
            //Цикл поиска номера по списку столиц
            int num_cap = 0;
            for (int q = 0; q < capital.size(); q++) {
                if (answer_capital[number_int-1].equals(capital.get(q))) {
                    System.out.println("Номер найденной позиции в списке столиц = " + capital.get(q));
                    num_cap = q;
                }
                 }
            //Цикл поиска номера по списку стран
            int num_cou = 0;
            for (int w = 0; w < country.size(); w++) {
                if (country.get(i).equals(country.get(w))) {
                    System.out.println("Номер найденной позиции в списке стран = " + country.get(w));
                    num_cou = w;
                }
                            }

            if (num_cap == num_cou) {
                System.out.println("Верный ответ!");
            } else {
                System.out.println("Ошибка");
            }
        }

    }
}