import java.io.*;
public class Pr1
{
    public static void main (String agrs[]) throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your age:-");
        int age=Integer.parseInt(in.readLine());
        if(age>=18)
        System.out.println("You are eligible to vote");
        else if(age<0)
        System.out.println("Invalid Age Entered");
        else
        System.out.println("You are not eligible to vote .You can vote after "+(18-age)+" years");
    }
}
        