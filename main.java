import java.util.*;
import java.lang.*;
class converter {
    int convert_to_seconds(int a, int b, int c){
        int hrins = a*60*60;
        int mins = b*60;
        return hrins + mins + c;
    }
}

class time extends Thread{
    void timer(int a){
        while (a != 0){
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
            System.out.println("Time left: " + a + 's');
            a--;
            if (a == 0){
                System.out.println("beep Beep......");

            }

       }
    }
}
class double_digit{
    String double_digit_sec(int a){
        String double_digit_sec ;
        if (a < 10){
            double_digit_sec  = '0' + String.valueOf(a);
        }
        else {
            double_digit_sec = String.valueOf(a);
        }
        return double_digit_sec;
    }
    String double_digit_min(int a){
        String double_digit_min ;
        if (a < 10){
            double_digit_min  = '0' + String.valueOf(a);
        }
        else {
            double_digit_min = String.valueOf(a);
        }
        return double_digit_min;
    }
    String double_digit_hr(int a){
        String double_digit_hr ;
        if (a < 10){
            double_digit_hr  = '0' + String.valueOf(a);
        }
        else {
            double_digit_hr = String.valueOf(a);
        }
        return double_digit_hr;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Clock app by InfinityNakkulNarwal");
        Scanner nub = new Scanner(System.in);
        System.out.println("hours: ");
        int hr = nub.nextInt();
        System.out.println("minutes: ");
        int mi = nub.nextInt();
        System.out.println("seconds: ");
        int sec = nub.nextInt();
        double_digit dd = new double_digit();
        String double_digit_s = dd.double_digit_sec(sec);
        String double_digit_m = dd.double_digit_min(mi);
        String double_digit_h = dd.double_digit_hr(hr);
        System.out.println("Timer set for: " + double_digit_h+":"+double_digit_m+":"+double_digit_s);
        converter c = new converter();
        int total_time_in_seconds = c.convert_to_seconds(hr, mi, sec);
        time t = new time();
        t.timer(total_time_in_seconds);
    }
}
