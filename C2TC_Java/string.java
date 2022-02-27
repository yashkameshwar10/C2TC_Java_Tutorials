import java.io.*;
import java.util.*;
public class string {


    public static void main(String[] args) {

        Scanner sc = Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int C1 = A.length();
        int c2 = B.length();
        int c3 = c1 + c2 ;
        System.out.println("addition of both the length :"+ c3);
        int i = A.compareTo(B);
        if(i>0){
            System.out.println("Yes");
        }
        else 
        {
            System.out.println("No");
        }
        String atemp = A.substring(0,1).toUpperCase()+A.substring(1);
        string btemp = B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.println(atemp+""+btemp);

    


    }
    
}
