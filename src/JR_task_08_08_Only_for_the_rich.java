import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class JR_task_08_08_Only_for_the_rich {

/*
Только для богачей
*/

        public static Map<String, Integer> createMap() {
                // создаём список пар Фамилия - зарплата

                Map<String, Integer> rich = new HashMap<>();

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

        public static void removeItemFromMap(Map<String, Integer> map) {
            // код
        }

        public static void main(String[] args) {

        }
}
