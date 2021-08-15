public class JR_task_03_06_Escape_characters {

/*
Экранирование символов
*/

        public static void main(String[] args) {
            String a = " It's a Windows path: ";
            String aa = "\"C:\\Program Files\\Java\\jdk1.7.0\\bin\"";
            System.out.println(a+aa);
            String b = "It's a Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\\\"";
            System.out.println(b);

        }
    }
