import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JR_task_3_8_Big_and_clean {

    /*
 Большая и чистая
 */

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код

        String name1 = reader.readLine();
        String name2 = reader.readLine();
        String name3 = reader.readLine();

        System.out.println(name1+" + "+name2+" + "+name3+" = Чистая любовь, да-да!");
    }

}
