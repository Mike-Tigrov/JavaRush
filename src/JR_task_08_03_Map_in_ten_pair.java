import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class JR_task_08_03_Map_in_ten_pair {

/*
Map из 10 пар
*/

        public static void main(String[] args) {
            //напишите тут ваш код
            Map <String, String> map = new HashMap<String, String>();

            map.put("арбуз", "ягода");
            map.put("банан", "трава");
            map.put("вишня", "ягода");
            map.put("груша", "фрукт");

            map.put("дыня", "овощ");
            map.put("ежевика", "куст");
            map.put("жень-шень", "корень");

            map.put("земляника", "ягода");
            map.put("ирис", "цветок");
            map.put("картофель", "клубень");

            Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();


                    while (iterator.hasNext()) {
                        Map.Entry<String, String> pair = iterator.next();
                        String key = pair.getKey();
                        String value = pair.getValue();
                        System.out.println(key + " - " + value);
                    }
        }
    }
