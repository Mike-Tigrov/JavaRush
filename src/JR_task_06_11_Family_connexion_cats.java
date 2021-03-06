/*
Родственные связи кошек:
дедушка Вася (папин папа)
бабуша Мурка (мамина мама)
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Для ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JR_task_06_11_Family_connexion_cats {

        public static void main(String[] args) throws IOException {

// Читаем вводимые значения:
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

// Читаем первую строку - дедушка Вася:
            String Grandpa_Vasya = reader.readLine();
// Создаём нового кота - дедушку Васю:
            Cat Vasya = new Cat(Grandpa_Vasya);

            // Читаем вторую строку - бабушка Мурка:
            String Grandma_Myrka = reader.readLine();
            // Создаём нового кота - бабушку Мурку:
            Cat Myrka = new Cat(Grandma_Myrka);

            // Читаем третью строку - папа Котофей:
            String Father_Kotofey = reader.readLine();
            // Создаём нового кота - папу Котофея и добавляем его папу - дедушку Васю:
            Cat Kotofey = new Cat(Father_Kotofey, null, Vasya);

            // Читаем 4 строку - мама Василиса:
            String Mother_Vasilisa = reader.readLine();
            // Создаём нового кота - маму Василису и добавляем её мама - бабушку Мурку:
            Cat Vasilisa = new Cat(Mother_Vasilisa, Myrka, null);

            // Читаем 5 строку - сын Мурчик:
            String Sun_Myr4ik = reader.readLine();
            // Создаём нового кота - сына Мурчика и добавляем ему родителей:
            Cat Myr4ik = new Cat(Sun_Myr4ik, Vasilisa, Kotofey);

            // Читаем 6 сроку - дочь Пушинка:
            String Daughter_Pux = reader.readLine();
            // Создаём нового кота - дочь Пушинку и добавляем ей родителей:
            Cat Pux = new Cat(Daughter_Pux, Vasilisa, Kotofey);

            System.out.println(Vasya);
            System.out.println(Myrka);
            System.out.println(Kotofey);
            System.out.println(Vasilisa);
            System.out.println(Myr4ik);
            System.out.println(Pux);
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
