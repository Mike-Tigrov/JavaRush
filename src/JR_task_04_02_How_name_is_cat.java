public class JR_task_04_02_How_name_is_cat {
/*
Как зовут кота?
*/

    // Не работает!!!

public static class Cat {
    private String name = "безымянный кот";

    public void setName(String name) {

    }

    public void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Жужик");
        System.out.println(cat.name);
    }
}
}

