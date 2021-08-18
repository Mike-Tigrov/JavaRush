import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JR_task_03_8_Plan_to_captured_the_world {

/*
План по захвату мира
*/

        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String age = reader.readLine();
            String name = reader.readLine();
            System.out.println(name+" захватит мир через "+age+" лет. Му-ха-ха!");
        }
    }
