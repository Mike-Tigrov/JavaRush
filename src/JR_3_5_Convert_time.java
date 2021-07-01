public class JR_3_5_Convert_time {

/*
Конвертируем время
*/

        public static int convertToSeconds(int hour){


            return hour*60*60;

        } public static void main(String[] args) {
            System.out.println(convertToSeconds(24));
            System.out.println(convertToSeconds(1));

        }
    }
