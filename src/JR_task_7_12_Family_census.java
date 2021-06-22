import java.util.ArrayList;

public class JR_task_7_12_Family_census {
    public static void main(String[] args) {

        ArrayList<Human> humans = new ArrayList<Human>();

        // Создаём дедушку Васю
        Human Vasya = new Human("дедушка Вася", true, 73);

        // Создаём дедушку Петю
        Human Petya = new Human("дедушка Петя", true, 78);

        // Создаём бабушку Машу
        Human Masha = new Human("бабушка Маша", false, 69);

        // Создаём бабушку Марусю
        Human Marysya = new Human("бабушка Маруся", false, 67);

        // Создаём маму Вику, её папа - Вася, мама - Маша
        Human Vika = new Human("мама Вика", false, 41, Vasya.father, Masha.mother);

        // Создаём папу Сергея, его папа - Петя, мама - Маруся
        Human Sergey = new Human("папа Сергей", true, 42, Petya.father, Marysya.mother);

        // Создаём сына Максима, его папа - Сергей, мама - Вика
        Human Max = new Human("сын Максим", true, 17, Sergey.father, Vika.mother);

        // Создаём сына Влада, его папа - Сергей, мама - Вика
        Human Vlad = new Human("сын Владислав", true, 14, Sergey.father, Vika.mother);

        // Создаём дочь Ольгу, её папа Сергей, мама Вика
        Human Olga = new Human("дочь Ольга", false, 11, Sergey.father, Vika.mother);

        humans.add(Vasya);
        humans.add(Petya);
        humans.add(Masha);
        humans.add(Marysya);
        humans.add(Vika);
        humans.add(Sergey);
        humans.add(Max);
        humans.add(Vlad);
        humans.add(Olga);

        for (int i = 0; i < humans.size(); i++) {
            System.out.println(humans.get(i));
        }
    }

    // Создаём класс Человек с полями: имя, пол, возраст, наличие отца, матери:
    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        // Создаём конструктор с полями имя, пол и возраст:
        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        // Создаём конструктор с полями имя, пол, возраст, наличие отца, наличие матери:
        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
@Override
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}
