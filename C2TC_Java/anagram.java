import java.util.Arrays;
import java.util.Scanner;
public class anagram {
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("type any sentence:");
        String x = sc.nextLine();
        System.out.println("type any sentence:");
        String y = sc.nextLine();

        x = x.replace(" "," ");
        y = y.replace(" "," ");

        x = x.toLowerCase();
        y = y.toLowerCase();

        char a[] = x.toCharArray();
        char b[] = y.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        Boolean result = Arrays.equals(a,b);

        if(result == true)
        {
            System.out.println("It is an anagram");
        }
        else
        {
            System.out.println("It is not an anagram");
        }



        
    }
}
