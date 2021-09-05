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

         public static void removeItemFromMap(Map<String, Integer> map) {
// Создаём копию коллекции, чтобы по ней проходить циклом

                Map<String, Integer> rich_copy = new HashMap<>(createMap());

                // Создаём список и заносим туда значения из коллекции
ArrayList<Integer> salary = new ArrayList<>();
        }
        public static void main(String[] args) {
        //Проверка созданной коллекции:
                        System.out.println(createMap());
        }
}
