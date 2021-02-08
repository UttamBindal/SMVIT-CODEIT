import java.io.*;
public class Pr2
{
    public static void main (String agrs[]) throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a integer number:-");
        int n=Integer.parseInt(in.readLine());
        if(n%2==0)
        System.out.println("The Number entered is even");
        else
        System.out.println("The Number entered is odd");
    }
}
