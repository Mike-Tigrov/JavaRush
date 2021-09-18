import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;

public class JR_task_08_08_Only_for_the_rich {

/*
Только для богачей

Цель:
Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
Удалить из словаря всех людей, у которых зарплата ниже 500.

Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов
String, Integer состоящих из 10 записей по принципу "фамилия" - "зарплата".
4. Метод removeItemFromMap() должен удалять из словаря всех людей,
у которых зарплата ниже 500.

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

                 Iterator<Map.Entry<String, Integer>> salary = rich.entrySet().iterator();

                 while (salary.hasNext()) {
                         Map.Entry<String, Integer> temp = salary.next();
                         String name = temp.getKey();
                         Integer value = temp.getValue();
                        if(value < 500) {
                                temp.remove();
                        }
                        }

                         {

                         }
                 }


        }
        public static void main(String[] args) {
        //Проверка созданной коллекции:
                        System.out.println(createMap());
        }
}
