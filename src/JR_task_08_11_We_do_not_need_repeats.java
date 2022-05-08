import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

/*

"Повторы нам не нужны"

Условие задачи:
1. Создать словарь (Map<String,String>) и занести в него десять записей по принципу "фамилия" - "имя".
2. Удалить людей, имеющий одинаковые имена.

Требования:
1) Программа не должна выводить текст на экран.
2) Программа не должна считывать значения с клавиатуры.
3) Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей.
4) Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющих одинаковые имена.
5) Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().
 */
public class JR_task_08_11_We_do_not_need_repeats {


    public static Map<String, String> createMap() {
        //Создаём словарь fio и заполняем его десятью парами имя + фамилия
        Map<String, String> fio = new HashMap<String, String>();

        fio.put("Борисов", "Иван");
        fio.put("Загоскин", "Алексей");
        fio.put("Гнойко", "Дмитрий");

        fio.put("Голубенко", "Александр");
        fio.put("Соколов", "Сергей");
        fio.put("Иодко", "Женя");

        fio.put("Куценко", "Паша");
        fio.put("Стукалов", "Иван");
        fio.put("Бортник", "Иван");
        fio.put("Сизонов", "Сергей");

        return fio;
    }
}

