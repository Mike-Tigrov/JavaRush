import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JR_task_03_08_Prediction_to_the_future {

/*
Предсказание на будущее
*/

        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String name = reader.readLine();
            String in1 = reader.readLine();
            String in2 = reader.readLine();

            System.out.println(name+" получает "+in1+" через "+in2+" лет/года.");
        }
    }
