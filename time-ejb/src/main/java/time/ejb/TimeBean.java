package time.ejb;

import javax.ejb.Stateless;
import java.text.SimpleDateFormat;
import java.util.Date;

@Stateless
public class TimeBean implements Time {

    @Override
    public String getCurrentTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
         dateFormat.format(new Date());
        return dateFormat.format(new Date());
    }
}
