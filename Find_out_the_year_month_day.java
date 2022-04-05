// 1. Find out the year, month and day between your birthday and today
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Find_out_the_year_month_day {
    public static void main(String[] args) throws ParseException {

            String thatDay = "25/12/2000 12:40:12 AM";
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa");
            Date date1 = formatter.parse(thatDay);
            Date date2 = new Date();
            long d = date2.getTime() - date1.getTime();
            long year = d / (1000l  * 60 * 60 * 24 * 365);
            long day = d / (1000 * 60 * 60 * 24) % 365;
            long month = (day / 30);
            long day_2 = (day % 24);

          //  long hour = (d / (1000 * 60 * 60)) % 24;
           // long minutes = (d / (1000 * 60)) % 60;
            //long second = (d / 1000) % 60;
            System.out.println("Year " + year);
            System.out.println("Month " + month);
             System.out.println("day " + day_2);
//            System.out.println("Day " + day);
//            System.out.println("Hour " + hour);
//            System.out.println("Minute " + minutes);
//            System.out.println("Second " + second);
        }
    }

