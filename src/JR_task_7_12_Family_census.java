public class JR_task_7_12_Family_census {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human Grandfather_Vasya = new Human(Grandfather_Vasya.name,  );
        Human Grandfather_Petya = new Human(Grandfather_Petya.name, );
        Human Grandmother_Masha = new Human(Grandmother_Masha.name, );
        Human Grandmother_Marysya = new Human(Grandmother_Marysya.name, );
        Human Mother = new Human(Mother.name);
        Human Father = new Human(Father.name);
        Human Sun_Max = new Human(Sun_Max.name,);
        Human Sun_Vlad = new Human(Sun_Vlad.name,);
        Human Doughter = new Human(Doughter.name,);
    }
// Создаём класс Человек с полями: имя, пол, возраст, наличие отца, матери:
    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human (String name, boolean sex, int age) {
this.name = name;
this.sex = sex;
this.age = age;
        }

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
