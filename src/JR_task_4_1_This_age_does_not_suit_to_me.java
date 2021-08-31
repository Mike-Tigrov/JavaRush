public class JR_task_4_1_This_age_does_not_suit_to_me {
/*
Мне не подходит этот возраст…
*/
public static void main(String[] args) {
    Person person = new Person();
    System.out.println("Age is: " + person.age);
    person.adjustAge(person.age);
    System.out.println("Adjusted age is: " + person.age);
}

}
