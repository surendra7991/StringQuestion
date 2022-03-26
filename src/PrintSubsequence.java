//->it will print the all subsequence
import java.util.Scanner;
public class PrintSubsequence {
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        String str=readme.nextLine();
        printSS(str,"");
    }
    public static void printSS(String str,String ans)
    {
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }
       char ch=str.charAt(0);
       String roq=str.substring(1);
       printSS(roq,ans+ch);
       printSS(roq,ans+"");

    }
}
