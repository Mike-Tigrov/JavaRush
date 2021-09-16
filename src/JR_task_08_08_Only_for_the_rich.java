import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;

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

         public static void removeItemFromMap(Map<String, Integer> rich) {


                 Iterator<Map.Entry<String, Integer> salary = rich.entrySet().iterator();

                 for (int i = 0; i < rich.size(); i++) {
                         Map.Entry<String, Integer> entry = salary.next();
                         while (salary.hasNext())
                         {

                         }
                 }


        }
        public static void main(String[] args) {
        //Проверка созданной коллекции:
                        System.out.println(createMap());
        }
}
