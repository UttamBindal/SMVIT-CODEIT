import java.io.*;
public class Pr3
{
    public static void main (String agrs[]) throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your Name :- ");
        String Name=in.readLine();
        System.out.print("Enter your age :- ");
        int age=Integer.parseInt(in.readLine());
        while(age<0)
        {
            System.out.print("Invalid Age Entered.Please Reenter:-");
            age=Integer.parseInt(in.readLine());
        }
        System.out.println("Specify Gender");
        System.out.print("Enter 1 for male 2 for female and 3 for others :- ");
        int sex=Integer.parseInt(in.readLine());
        while(sex!=1&&sex!=2&&sex!=3)
        {
            System.out.print("Invalid Input.Please Reenter:-");
            sex=Integer.parseInt(in.readLine());
        }
        System.out.println("Name:-"+Name);
        System.out.println("Age:-"+age);
        if(sex==1)
        System.out.println("Male");
        else if(sex==2)
        System.out.println("Female");
        else
        System.out.println("Other");
    }
}

     
        
