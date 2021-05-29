import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class JR_task_7_9_Check_orderliness {

/*
Проверка на упорядоченность

Для вставки:
дедушка
бабушка
папа
мама
сын
дочь
коты
собака
программа
машина
*/

        public static void main(String[] args) throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            ArrayList<String> list = new ArrayList<String>();

            for (int i = 0; i < 10; i++) {
                list.add(i, reader.readLine());
            }

            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i).length() >= list.get(i+1).length()) {
                    System.out.print(i + 1);
                    break;
                }
            }

        }
}
