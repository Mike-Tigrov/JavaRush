public class JR_task_02_02_Our_first_converter {
    /*
Наш первый конвертер!
*/

          public static void main(String[] args) {
            System.out.println(convertCelsiusToFahrenheit(60));
        }

        public static double convertCelsiusToFahrenheit(int celsius) {
            double fahrenheit = celsius * (9.0 / 5.0) + 32;

            return fahrenheit;
        }
    }
