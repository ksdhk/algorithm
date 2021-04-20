import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) throws ParseException {
        String DT = "20200817";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date date =  sdf.parse(DT);
      
        String DOC = sdf.format(date);
        System.out.println(DOC);
    }
}
