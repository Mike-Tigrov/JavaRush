/*
Родственные связи кошек
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JR_task_6_11_Family_connexion_cats {

        public static void main(String[] args) throws IOException {

// Читаем вводимые значения:
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

// Читаем первую строку - дедушка Вася:
            String Grandpa_Vasya = reader.readLine();
// Создаём нового кота - дедушку Васю:
            Cat catGrandpa = new Cat(Grandpa_Vasya);

// Читаем вторую строку - бабушка Мурка:
            String catGrandM = reader.readLine();
            Cat catGrandM= new Cat(catGrandM);

            String f= reader.readLine();
            Cat catFather = new Cat(fatherName);

            System.out.println(catGrand);
            System.out.println(catDaughter);
            System.out.println(catFather);
        }

        public static class Cat {
            private String name;
            private Cat mother;
            private Cat father;

            Cat(String name) {
                this.name = name;
            }

            Cat(String name, Cat mother, Cat father) {
                this.name = name;
                this.mother = mother;
                this.father = father;
            }

            @Override
            public String toString() {
                if (mother == null & father == null)
                    return "The cat's name is " + name + ", no mother, no father";
                else if (mother == null)
                    return "The cat's name is " + name + ", no mother, " + "father is " + father.name;
                else if (father == null)
                    return "The cat's name is " + name + ", mother is " + mother.name + " no father";
                else
                    return "The cat's name is " + name + ", mother is " + mother.name + ", father is " + father.name;
            }
        }

































}
