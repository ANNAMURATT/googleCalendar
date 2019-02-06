import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Maintest {
    public static void main(String args[]){
//        Date date = Calendar.getInstance().getTime();
//        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
//        String strDate = dateFormat.format(date);
//        System.out.println("Converted String: " + strDate);

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("E ,dd E");

        formatter = new SimpleDateFormat("E, dd MMM yyyy");
        String strDate = formatter.format(date);
        System.out.println("Date Format with E, dd MMM yyyy HH:mm:ss z : "+strDate);

    }
}
