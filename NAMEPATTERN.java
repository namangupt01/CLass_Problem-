import java.util.*;
public class NAMEPATTERN.JAVA
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // String str= "naman";

        for(int i=0;i<str.length();i++)
        {
            for(int j=0;j<str.length();j++)
            {
                if(i==2)
                {
                    System.out.print(str.charAt(j)+" ");
                }
                else if(j==(str.length()/2))
                    {
                        System.out.print(str.charAt(i));
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                
            }
            System.out.println();
        }
    }
}
