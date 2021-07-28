import java.util.HashMap;
import java.util.Map;

public class JR_task_8_8_Population_census {

/*
Перепись населения
*/

        public static Map<String, String> createMap() {

            Map <String, String> fio = new HashMap<>();

            fio.put("Петров", "Саша");
            fio.put("Егоров", "Вадим");
            fio.put("Шубин", "Толя");

            fio.put("Керо", "Маша");
            fio.put("Сокол", "Сергей");
            fio.put("Колчин", "Владислав");
            fio.put("Громов", "Анатолий");

            fio.put("Забелин", "Сергей");
            fio.put("Пиро", "Нина");
            fio.put("Валов", "Роман");

            return fio;
        }

        public static int getCountTheSameFirstName(Map<String, String> fio, String firstName) {
            int countF = 0;

            return countF;
        }

        public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
            int countL = 0;

            return countL;
        }

        public static void main(String[] args) {
            System.out.println (getCountTheSameFirstName (createMap(), "Сокол"));
            System.out.println (getCountTheSameLastName (createMap(), "Саша"));
        }
}
