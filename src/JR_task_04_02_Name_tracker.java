public class JR_task_04_02_Name_tracker {
    /*
Программа учета имен

Цель:
1. Напишите код метода setName, чтобы с его помощью установить значение private String fullName
равное значению локальной переменной String fullName.

Требование:
1. Класс JR_task_04_02_Name_tracker должен содержать только одну переменную fullName.
2. Переменная fullName должна иметь модификатор доступа private и тип String.
3. Класс Cat должен содержать только два метода setName и main.
4. Метод setName должен иметь локальную переменную fullName.
5. Метод setName класса Cat должен устанавливать значение
глобальной переменной private String fullName равным локальной переменной fullName.
*/
    private String fullName;

    public void setName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        this.fullName = fullName;

    }

    public static void main(String[] args) {

    }
}
