import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Set;

public class JR_task_08_08_Only_for_the_rich {

/*
Только для богачей
*/

        public static Map<String, Integer> createMap() {
                // создаём список пар Фамилия - зарплата

                Map<String, Integer> rich = new HashMap<>();
// заполняем список пар

                rich.put("Петров", 100);
                rich.put("Иванов", 200);
                rich.put("Сидоров", 300);
                rich.put("Смирнов", 400);

                rich.put("Петренко", 490);
                rich.put("Куценко", 600);
                rich.put("Соколов", 700);

                rich.put("Борисов", 800);
                rich.put("Сизонов", 900);
                rich.put("Воронов", 970);

                return rich;
        }

        Set<Map.Entry<String, Integer>> set = createMap().entrySet();
/*
        for (Map.Entry<String, Integer> prints : set ) {
                System.out.println(prints.getKey() + " : " + prints.getValue());
        }

        public static void removeItemFromMap(Map<String, Integer> map) {
            // нам надо пройтись циклом по коллекции, найти значения менее 500 и удалить их из коллекции
        }
*/
        public static void main(String[] args) {

        }
}
