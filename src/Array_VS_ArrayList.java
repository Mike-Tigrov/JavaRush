import java.util.ArrayList;

public class Array_VS_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> arr_list = new ArrayList<>();
        {
            arr_list.add("1Канада");
            arr_list.add("2Канада");
            arr_list.add("3Канада");
            arr_list.add("4Канада");
            arr_list.add("5Канада");

            System.out.println(arr_list.size());
        }

        String[] simpl_list = new String[5];
        {
            System.out.println(simpl_list.length);
        }
    }
}
