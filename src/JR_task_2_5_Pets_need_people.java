public class JR_task_2_5_Pets_need_people {
    /*
Питомцам нужны люди
*/

         public static void main(String[] args) {
            Cat may = new Cat();

            Dog dog = new Dog();

            Fish fish = new Fish();

            Woman woman = new Woman();
            may.owner = woman;
            dog.owner = woman;
            fish.owner = woman;
        }

        public static class Cat {
            public Woman owner;
        }

        public static class Dog {
            public Woman owner;
        }

        public static class Fish {
            public Woman owner;
        }

        public static class Woman {
        }
    }
