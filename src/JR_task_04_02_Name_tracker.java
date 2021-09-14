public class JR_task_04_02_Name_tracker {
    /*
Программа учета имен

Условие:
1.

Требование:
1. Класс Cat должен содержать только одну переменную fullName.
2. Переменная FullName должна иметь модификатор доступа private и тип String.
3. Класс Cat должен содержать только два метода setName и main.
*/
    private String fullName;

    public void setName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        this.fullName = fullName;

    }

    public static void main(String[] args) {

    }
}
