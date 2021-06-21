public class JR_task_7_12_Family_census {
    public static void main(String[] args) {

        // Создаём дедушку Васю
        Human Vasya = new Human();

        // Создаём дедушку Петю
        Human Petya = new Human();

        // Создаём бабушку Машу
        Human Masha = new Human();

        // Создаём бабушку Марусю
        Human Marysya = new Human();

        // Создаём маму Вику, её папа - Вася, мама - Маша
        Human Vika = new Human();

        // Создаём папу Сергея, его папа - Петя, мама - Маруся
        Human Sergey = new Human();

        // Создаём сына Максима, его папа - Сергей, мама - Вика
        Human Max = new Human();

        // Создаём сына Влада, его папа - Сергей, мама - Вика
        Human Vlad = new Human();

        // Создаём дочь Ольгу, её папа Сергей, мама Вика
        Human Olga = new Human();
    }
// Создаём класс Человек с полями: имя, пол, возраст, наличие отца, матери:
    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

// Создаём конструктор с полями имя, пол и возраст:
            public Human (String name, boolean sex, int age) {
this.name = name;
this.sex = sex;
this.age = age;
        }
// Создаём конструктор с полями имя, пол, возраст, наличие отца, наличие матери:
        public Human (String name, boolean sex, int age, Human father, Human mother) {
this.name = name;
this.sex = sex;
this.age = age;
this.father = father;
this.mother = mother;
        }

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
