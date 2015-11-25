import java.io.*;
import java.util.*;
//                     -----Instructions-----
//compile and execute
// type in the length and with of first rectangle seperated by space.
// hit enter
// then type in the length and with of seciond rectangle seperated by space.
public class ServerReboot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time1 = in.nextLine();
        String time2 = in.nextLine();
        String[] t1 = time1.split("\\s+");
        String[] t2 = time2.split("\\s+");
        int hour1 = Integer.parseInt(t1[0]);
        int hour2 = Integer.parseInt(t2[0]);        
        int minute1 = Integer.parseInt(t1[1]);
        int minute2 = Integer.parseInt(t2[1]);
        int aswer1 = hour2-hour1;
        int aswer2 = 0;
        if (minute1!=0||minute2!=0){
            aswer2 = minute2-minute1;
            if (aswer2<0){
                aswer1 = aswer1-1;
                aswer2 = 60+aswer2;
            }
            
        }
        System.out.println(aswer1+" "+aswer2);
    }
}