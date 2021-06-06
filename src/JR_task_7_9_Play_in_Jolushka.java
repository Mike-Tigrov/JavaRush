import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class JR_task_7_9_Play_in_Jolushka {

/*
Играем в Jолушку

Для вставки:
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
        //напишите тут ваш код
        ArrayList<Integer> main = new ArrayList<>();
        ArrayList<Integer> na3 = new ArrayList<>();
        ArrayList<Integer> na2 = new ArrayList<>();
        ArrayList<Integer> last = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

// Добавили 20 чисел в список main:
        for (int i = 0; i < 20; i++) {
            main.add(i, Integer.parseInt(reader.readLine()));
        }
// Сортируем числа из списка main по 3 спискам:
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
        public static void printList (ArrayList <Integer> list) {
            //напишите тут ваш код
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }
    }
