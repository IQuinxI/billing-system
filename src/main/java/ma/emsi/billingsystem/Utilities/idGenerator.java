package ma.emsi.billingsystem.Utilities;
import java.text.SimpleDateFormat;
import java.util.Date;
public class idGenerator {

        public static String generateId() {
            SimpleDateFormat dateFormat = new SimpleDateFormat("HHmmssYY");
            return dateFormat.format(new Date());
        }
    }


