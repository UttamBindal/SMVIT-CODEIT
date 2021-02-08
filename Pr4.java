import java.io.*;
public class Pr4
{
    public static void main (String agrs[]) throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 3 Numbers");
        System.out.print("a=");
        int a=Integer.parseInt(in.readLine());
        System.out.print("b=");
        int b=Integer.parseInt(in.readLine());
        System.out.print("c=");
        int c=Integer.parseInt(in.readLine());
        int re=(a+b)*c;
        if(re<=100)
        System.out.println("Less than 100");
        else
        System.out.println("Greater than 100");
    }
}

