public class JR_task_03_05_Collect_water_in_the_pool {

/*
Набираем воду в бассейн
*/

        public static void main(String[] args)
        {
            System.out.println(getVolume(25, 5, 2));
        }

        public static long getVolume(int a, int b, int c)
        {
            return a*b*c*1000;
        }
    }
