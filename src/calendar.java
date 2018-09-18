import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

class calendar{
    public String getFirstDayOfWeek(){
        Calendar c = Calendar.getInstance();

        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        System.out.println();
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        System.out.println(df.format(c.getTime()));
        String firstDay=df.format(c.getTime());
        return firstDay;
    }
    public String getLastDayOfWeek(){
        Calendar c = Calendar.getInstance();

        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        System.out.println();
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        System.out.println(df.format(c.getTime()));
        for (int i = 0; i <6; i++) {
            c.add(Calendar.DATE, 1);
        }
        String lastDay=df.format(c.getTime());
        System.out.println(df.format(c.getTime()));
        System.out.println();
        return lastDay;
    }

}