import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JR_task_3_12_Financial_expectations {

/*
Финансовые ожидания
*/

        public static void main(String[] args) throws Exception {
                System.out.println("Введите сумму вашего заработка в час (число от 1 до 1000):");
                BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
int num = Integer.parseInt(reader.readLine());

System.out.println("Я буду зарабатывать $" + num + " в час.");
        }
}
