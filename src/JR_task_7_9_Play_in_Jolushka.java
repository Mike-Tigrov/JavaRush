import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class JR_task_7_9_Play_in_Jolushka {

/*
Играем в Jолушку
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

        }
        public static void printList(ArrayList<Integer> list) {
            //напишите тут ваш код
        }
































}
