public class JR_task_7_12_Family_census {
    public static void main(String[] args) {

        // Создаём дедушку Васю
        Human Grandfather_Vasya = new Human();

        // Создаём дедушку Петю
        Human Grandfather_Petya = new Human();

        // Создаём бабушку Машу
        Human Grandmother_Masha = new Human();

        // Создаём бабушку Марусю
        Human Grandmother_Marysya = new Human();
        Human Mother = new Human();
        Human Father = new Human();
        Human Sun_Max = new Human();
        Human Sun_Vlad = new Human();
        Human Doughter = new Human();
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
