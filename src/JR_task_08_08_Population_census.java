import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class JR_task_08_08_Population_census {

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

// создаём массив, заносим имена из fio
        ArrayList<String> nameFirstValue = new ArrayList<>(fio.values());

        int countF = 0;

        for (int i = 0; i < nameFirstValue.size(); i++) {

        }

        return countF;
    }

    public static int getCountTheSameLastName(Map<String, String> fio, String lastName) {
// создаём массив, туда заносим фамилии из fio
        ArrayList<String> nameLastKey = new ArrayList<>(fio.keySet());
        int countLast = 0;
        for (int i = 0; i < nameLastKey.size(); i++) {
            if (key.get(i).equals(lastName) {
                countLast++
            }
        }

        return countL;
        }

        public static void main(String[] args) {
            System.out.println (getCountTheSameFirstName (createMap(), "Сокол"));
            System.out.println (getCountTheSameLastName (createMap(), "Саша"));
        }
}
