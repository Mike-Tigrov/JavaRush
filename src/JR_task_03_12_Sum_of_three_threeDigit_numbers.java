public class JR_task_03_12_Sum_of_three_threeDigit_numbers {
    /*
Сумма цифр трехзначного числа
*/

            public static void main(String[] args)

            {
            System.out.println(sumDigitsInNumber(456));
        }

        public static int sumDigitsInNumber(int number) {
                       int number3 = number % 10;
            int number1 = number / 100;
            int number2 = (number / 10) % 10;
int sum = number1 + number2 + number3;


            return sum;
        }
    }
