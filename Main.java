package vehicle;

import java.util.Scanner;
public class Main
{
               public int noOfSeats;
               public int noOfWheels;
               Main(int s,int w)
                {
                    noOfSeats=s;
                    noOfWheels=w;  
                 }
                public void showCar()
               {
                     System.out.print("Car NoOfSeats "+ noOfSeats);
                     System.out.println(" NoOfwheels "+ noOfWheels);
                }
                public void showBike()
               {
                     System.out.print("Bike NoOfSeats "+noOfSeats);
                     System.out.println(" NoOfwheelsts "+noOfWheels);
                }
                public static void main(String[] args)
                    {
                       System.out.println("you can take any hardcoded values for objects\n");
                       int cs,cw,bs,bw;
                       Scanner sc=new Scanner(System.in);
                       cs=sc.nextInt();
                       cw=sc.nextInt();
                       bs=sc.nextInt();
                       bw=sc.nextInt();

                      
                       Main bike=new Main(bs,bw);
                       bike.showBike();
                        Main car=new Main(cs,cw);
                       car.showCar();
                      }
}