public class JR_task_2_8_Minimum_four_numbers {
    /*
Минимум четырех чисел
*/

          public static int min(int a, int b, int c, int d) {
            int m4ab = min(a,b);
            int m4cd = min(c,d);
            int m4abcd = min(m4ab,m4cd);
            return m4abcd;
        }

        public static int min(int a, int b) {
            int m2;
            if (a < b)
                m2 = a;
            else m2 = b;
            return m2;
        }

        public static void main(String[] args) throws Exception {
            System.out.println(min(-20, -10));
            System.out.println(min(-40, -10, -30, 40));
            System.out.println(min(-20, -40, -30, 40));
            System.out.println(min(-20, -10, -40, 40));
            System.out.println(min(-20, -10, -30, -40));
        }
    }
