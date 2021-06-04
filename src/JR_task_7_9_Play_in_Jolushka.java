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
        ArrayList<Integer> main = new ArrayList<Integer>();
        ArrayList<Integer> na3 = new ArrayList<Integer>();
        ArrayList<Integer> na2 = new ArrayList<Integer>();
        ArrayList<Integer> last = new ArrayList<Integer>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        for (int i = 0; i < 20; i++) {
            main.add(i, Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < main.size(); i++) {
            if (main.get(i) % 3 == 0) {
                na3.add(main.get(i));
            } else if (main.get(i) % 2 == 0) {
                na2.add(main.get(i));
            } else {
                last.add(main.get(i));
            }
        }
            for (int i = 0; i < main.size(); i++) {
                if (main.get(i) % 3 == 0 & main.get(i) % 2 == 0) {
                    na3.add(main.get(i));
                    na2.add(main.get(i));
                }
            }


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
        public static void printList (ArrayList < Integer > list) {
            //напишите тут ваш код

        }
    }
