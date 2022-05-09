import java.util.*;

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

    public static void removeTheFirstNameDuplicates(Map<String, String> fio) {

//Создаём лист
        ArrayList<String> name = new ArrayList<>();

//В лист передаём value от fio
        list.addAll(fio.values());

//Делаем два цикла, чтобы сравнить каждое с каждым. Т.е. первое со всеми, второе со всеми и т.д.
// И мы сразу записываем в новый лист строки с уникальными именами,
// затем этот список сравниваем с нашим словарём и оставляем только те значения, которые в листе есть
// Третий цикл

        String first;
        String last;

        for(int i = 0; i < name.size(); i++) {
            first = name.get[i];
            for(int z = 1; z < name.size(); z++) {
                last = name.get[z];
                removeItemFromMapByValue(

                if (first.equals(last)) {
                    removeItemFromMapByValue(


                }

// Метод, создающий копию словаря, получает на входе имя словаря и значение, по которому ищет совпадения для удаления

                public static void removeItemFromMapByValue(Map<String, String> fio, String value) {
                    Map<String, String> copy = new HashMap<>(fio);
                    for (Map.Entry<String, String> pair : copy.entrySet()) {
                        if (pair.getValue().equals(value)) {
                            fio.remove(pair.getKey());
                        }
                    }
                }

                public static void main(String[] args) {

                }
            }
}

