public class JR_task_02_02_Count_circumference {
    /*
Считаем длину окружности
*/

         public static void main(String[] args) {
            printCircleLength(5);
        }

        public static void printCircleLength(int radius) {
            double Pi = 3.14;
            System.out.println(2 * Pi * radius);
        }
    }
