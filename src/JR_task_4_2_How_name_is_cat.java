public class JR_task_4_2_How_name_is_cat {
/*
Как зовут кота?
*/
public class Cat {
    private String name = "безымянный кот";

    public void setName(String name) {
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Жужик");
        System.out.println(cat.name);
    }
}}

