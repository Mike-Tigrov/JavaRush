import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class JR_task_7_9_Play_in_Jolushka {

/*
Играем в Jолушку

Цифры для вставки (20 чисел):
5
10
16
17
9
3
4
46
97
89
12
45
98
111
42
99
98
9
71
150
*/

    public static void main(String[] args) throws Exception {

        ArrayList<Integer> main = new ArrayList<>();
        ArrayList<Integer> na3 = new ArrayList<>();
        ArrayList<Integer> na2 = new ArrayList<>();
        ArrayList<Integer> last = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        printList(na3);
        printList(na2);
        printList(last);

// Добавили 20 чисел в список main:
        for (int i = 0; i < 20; i++) {
            main.add(i, Integer.parseInt(reader.readLine()));
        }
// Сортируем числа из списка main по 3 спискам (делятся на 3, на 2 и кратные 3 и 2 одновременно):
        for (int i = 0; i < main.size(); i++) {
            // Если делится на 3 и на 2, то добавляем в оба списка na3, na2:
            if (main.get(i) % 3 == 0 & main.get(i) % 2 == 0) {
    na3.add(main.get(i));
    na2.add(main.get(i));
    // Если делится на 3, добавляем в na3:
            } else if (main.get(i) % 3 == 0) {
                na3.add(main.get(i));
                // Если делится на 2, добавляем в na2:
            } else if (main.get(i) % 2 == 0) {
                na2.add(main.get(i));
                // Все остальные цифры добавляем в список last:
            } else {
                last.add(main.get(i));
            }
        }

// Проверочные тесты по спискам (Главный список, в котором есть все 20 чисел):
System.out.println("Главный список:");

            for (Integer main_print : main) {
                System.out.println(main_print);
            }

            System.out.println("Делятся на 3:");

            for (Integer na3_print : na3) {
                System.out.println(na3_print);
            }

            System.out.println("Делятся на 2:");

            for (Integer na2_print : na2) {
                System.out.println(na2_print);
            }

            System.out.println("Остальные:");

            for (Integer last_print : last) {
                System.out.println(last_print);
            }
        }
    // Метод, который выводит список на печать: 
        public static void printList (ArrayList <Integer> list) {

            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }
    }
