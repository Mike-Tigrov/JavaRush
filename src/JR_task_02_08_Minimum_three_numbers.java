public class JR_task_02_08_Minimum_three_numbers {
    /*
Минимум трёх чисел
*/

        public static int min(int a, int b, int c) {
            //напишите тут ваш код
            if (a <= b && a <= c) {
                return a;
            } else if (b <= a && b <= c) {
                return b;
            } else {
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
