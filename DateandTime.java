
package dateandtime;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class DateandTime {

    public static void main(String[] args) throws InterruptedException {
     /*   LocalDate date  = LocalDate.now();
        System.out.println("date = "+date);
        
        LocalTime time = LocalTime.now();
        System.out.println("time = "+time);
        
        LocalDateTime dt = LocalDateTime.now();
        System.out.println("dt = "+dt);
        System.out.println("dt-day = "+dt.getDayOfWeek());
        System.out.println("dt-day = "+dt.getDayOfMonth());
        System.out.println("dt-day = "+dt.getDayOfYear());
        System.out.println("dt-month = "+dt.getMonth());
        System.out.println("dt-month = "+dt.getMonthValue());
        System.out.println("dt-year = "+dt.getYear());
        System.out.println("dt-hour = "+dt.getHour());
        System.out.println("dt-minute = "+dt.getMinute());
        System.out.println("dt-second = "+dt.getSecond());
        
        LocalDate birthday = LocalDate.of(2000, Month.AUGUST, 21);
        
        Period p = Period.between(birthday, date);
        System.out.println("Period = "+p.getYears());
        
        ZoneId zid = ZoneId.systemDefault();
        System.out.println("Zone = "+zid);
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the date(dd/MM/yyyy)");
        String d=sc.nextLine();
        System.out.println("Enter how many month to add");
        int m=sc.nextInt();
        String dat[] = d.split("/");
        try{
            LocalDate dte=LocalDate.of(Integer.valueOf(dat[2]),Integer.valueOf(dat[1]),Integer.valueOf(dat[0]));
            System.out.println(d+" is a valid date");
            String res =  dte.plusMonths(m).toString();
            String ans[] = res.split("-");
            System.out.println(ans[2]+"/"+ans[1]+"/"+ans[0]);
        }
        catch(Exception e){
            System.out.println(d+" is not a valid date");
        } 
        
        Date de = new Date();
        System.out.println(" d= "+de);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");//M denotes Month, m denotes minute
        String str = formatter.format(de);
        System.out.println(" str = "+str);
               
        */
        LocalTime start =LocalTime.now();
                Thread.sleep(61000);
        LocalTime end = LocalTime.now();
        Duration diff = Duration.between(start, end);
        System.out.println("Diff = "+ diff.toHours()+" : "+diff.toMinutes()+" : "+diff.getSeconds());
    }
    
}
