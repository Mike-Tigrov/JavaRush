public class JR_task_03_03_Currency_exchange {

    /*
Обмен валют
*/

        public static void main(String[] args) {
            System.out.println(convertEurToUsd(2, 3.1));
            System.out.println(convertEurToUsd(4, 2.2));
        }

        public static double convertEurToUsd(int eur, double exchangeRate) {
            {
                return eur*exchangeRate;
            }
        }
    }
