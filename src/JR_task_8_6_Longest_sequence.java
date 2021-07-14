import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class JR_task_8_6_Longest_sequence {

/*
Cамая длинная последовательность

Цифры для ввода:
89
12
12
98
111
42
98
98
98
71
*/

        public static void main(String[] args) throws IOException {
// Создаём коллекцию - список строк:
            ArrayList<Integer> nums = new ArrayList<Integer>();

// Для считывания с клавиатуры:
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

// Заполняем коллекцию цифрами с клавиатуры:
            for (int i = 0; i < 10; i++) {
                nums.add(i, Integer.parseInt(reader.readLine()));
            }

// Проверяем, что в список добавились все цифры:
            for (int i = 0; i < nums.size(); i++) {
                System.out.println(nums.get(i));
            }
            System.out.println();

// Создаём переменные для подсчёта последовательностей:
            int count = 1;
            int max_count = 1;

             for (int i = 0; i < nums.size() - 1; i++) {
                if (nums.get(i).equals(nums.get(i + 1))) {
//Если два соседних элемента одинаковы, то переменная увеличивается на 1:
                    max_count++;
// Если два соседних элемента - разные, то мы проверяем длину последовательности "накопившуюся" в max_count:
                } else if (max_count > count) {
// Если накопилось больше чем было в count, то мы записываем в count
                }
                    index1 = i;
                }
            }

            System.out.println(count1);
            System.out.println(index1);
            System.out.println();

            for (int i = index1 + 1; i < nums.size() - (1+i); i++) {
                if (nums.get(i) == nums.get(i+1)) {
                    count2++;
                    index2 = i;
                }
            }

            System.out.println(count2);
            System.out.println(index2);
            System.out.println();

            for (int i = index2 + 1; i < nums.size() - (1+i); i++) {
                if (nums.get(i) == nums.get(i+1)) {
                    count3++;
                    index3 = i;
                }
            }

            System.out.println(count3);
            System.out.println(index3);
            System.out.println();



        }
    }







