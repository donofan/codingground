import java.io.*;
import java.util.*;
//                     -----Instructions-----
//compile and execute
// type in the length and with of first rectangle seperated by space.
// hit enter
// then type in the length and with of seciond rectangle seperated by space.
public class Square {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String shape1 = in.nextLine();
        String shape2 = in.nextLine();
        String[] rect1 = shape1.split("\\s+");
        String[] rect2 = shape2.split("\\s+");
        int width1 = Integer.parseInt(rect1[0]);
        int width2 = Integer.parseInt(rect2[0]);
        int height1 = Integer.parseInt(rect1[1]);
        int height2 = Integer.parseInt(rect2[1]);
        int totalheight = height1+height2;//or height1+width2
        int totalwidth = width1+width2;//or width1+height2
        int totalheight1 = width1+height2;//or height1+width2
        int totalwidth1 = width2+height1;//or width1+height2
        //System.out.println("HERE"+totalheight+totalwidth+totalheight1+totalwidth1);
        boolean oldvers = false;
        if (width1<=0||width2<=0||height1<=0||height2<=0||width1>100||width2>100||height1>100||height2>100) {System.out.println("NO");}
        else if (width1-width2!=0){
            if(width1+width2==height1){
                System.out.println("YES");
            }else{oldvers = true;}
        } else if(height1-height2!=0) {
            if(height1+height2==width1){
                System.out.println("YES");
            }else{oldvers = true;}
        } else{
           oldvers = true; 
        }
        if(oldvers){
            if((Integer.parseInt(rect1[0])!=Integer.parseInt(rect1[1]))||(Integer.parseInt(rect2[0])!=Integer.parseInt(rect2[1]))){
                if (width1-height2==0) {//this is diag
                    if((height1+width2==width1) || (width1+height2 == height1)){
                        System.out.println("YES");
                    }else{System.out.println("NO");}
                } else if (width2-height1==0) {
                    if(height2+width1==width2){
                        System.out.println("YES");
                    }else{System.out.println("NO");}
                }
                else if ((totalheight==totalwidth) || (totalheight1==totalwidth1)) {
                    System.out.println("YES");
                } else{
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        }
    }
}
  

