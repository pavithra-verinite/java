package vehicle;

import java.util.Scanner;
public class Main1
{
              
                public static void main(String[] args)
                    {
                       Scanner sc=new Scanner(System.in);
                       int y=sc.nextInt();
                       if(y%4==0 && y%100!=0)
                       {
                           System.out.println(y +" is leap year");
                       }
                       else if(y%400==0)
                       {
                           
                            System.out.println(y+" is leap year");
                       }
                       else
                       {
                           System.out.println(y+" not a leap year");
                       }
                       
                      }
}