import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;

public class test{
   public static void main(String[] args) {

	customDateFormatter("1:34 PM 12/08/2014");

   }


private static void customDateFormatter(String strReceivedDate){

	DateFormat formatter;
	formatter = new SimpleDateFormat("dd MMM yyyy HH:mm");

	String strNewDate = (String)formatter.format(new Date(strReceivedDate));

	System.out.println(strNewDate);

	String strDate = (String)strNewDate.substring(0,11);
	String strTime = (String)strNewDate.substring(11);

	System.out.println("You last logged in on " + strDate + " at" + strTime);
   }
}