import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Iterator;

public class JR_task_08_8 {

/*
Добрая Зинаида и летние каникулы
*/

            public static Map<String, Date> createMap() throws ParseException {
            DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
            Map<String, Date> name_date = new HashMap<>();

            name_date.put("Смирнов", dateFormat.parse("MAY 1 2012"));

            // код

            name_date.put("Сидоров", dateFormat.parse("Jun 4 2003"));
            name_date.put("Гориванов", dateFormat.parse("APR 16 1984"));
            name_date.put("Стукалов", dateFormat.parse("SEP 7 1999"));

            name_date.put("Гнойко", dateFormat.parse("NOV 24 1976"));
            name_date.put("Борисов", dateFormat.parse("DEC 28 2001"));
            name_date.put("Чекменёв", dateFormat.parse("AUG 10 1987"));

            name_date.put("Сизонов", dateFormat.parse("OCT 22 1984"));
            name_date.put("Корлаков", dateFormat.parse("JUN 12 1981"));
            name_date.put("Полянский", dateFormat.parse("SEP 29 2000"));

            return name_date;
        }

/*
    public static void removeAllSummerPeople(Map<String, Date> map) {
        //
return map;
    }
*/

        public static void main(String[] args) {

        }
    }