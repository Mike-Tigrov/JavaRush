public class JR_task_2_8_NOT_COMPLITE_Minimum_three_numbers {
    /*
Минимум трёх чисел
*/

// Не решена!
        public static int min(int a, int b, int c) {
            //напишите тут ваш код
            if (a < b && a < c) {
                return a;
            } else if (b < a && b < c) {
                return b;
            } else if (c < a && c < b) {
                return c;
            }
        }


        public static void main(String[] args) {
            System.out.println(min(1, 2, 3));
            System.out.println(min(-1, -2, -3));
            System.out.println(min(3, 5, 3));
            System.out.println(min(5, 5, 10));
        }
}
