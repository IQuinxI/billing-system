package ma.emsi.other;

import java.text.SimpleDateFormat;
import java.util.Date;

public class IdGenerator {
    public static String generateId() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HHmmssYY");
        return dateFormat.format(new Date());
    }
}
