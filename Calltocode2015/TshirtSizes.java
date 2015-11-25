import java.io.*;
import java.util.*;

public class TshirtSizes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line1 = in.nextLine();
        int num = Integer.parseInt(line1);
        int i = 1;
        List<String> answer = new ArrayList<String>();
        String currentline = "";
        while(i <= num) {
            currentline = (String)in.nextLine();
            answer.add(""+currentline);
            i++;
        }
        java.util.Collections.sort(answer, Collections.reverseOrder());
        for (i=0;i<answer.size();i++) {
            System.out.println(answer.get(i));
        }
    }
}
