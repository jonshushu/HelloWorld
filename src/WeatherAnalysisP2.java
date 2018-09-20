//This program takes user inputted temperature and calculates the average temperature for x days.
//finally, this programs compares the average temperature to each day prints how many days are above the average.


import java.util.Scanner;

public class WeatherAnalysisP2 {
    public static void main (String args []){
//intro
        Scanner console = new Scanner (System.in);
        System.out.println("How many days?");
        int days = console.nextInt();
        int sum;
        int [] data= new int[days];
//creates the array
        sum = 0;
        for(int i = 0; i < days; i++){
            System.out.println("Day " + (i+1) + "'s high temp: ");
            data[i]= console.nextInt();
            sum = sum + data[i];
        }
double average = sum/days;
System.out.println("Average temp" + "= 44.6");
int aboveAverage = 0;

    }
}
//  1.ask for user input
//  2.used input as length of array
//  3. find average temperature
//  3.compare average temp to each temperature
//  4.keep track of count
//  5.print
//   int x;
//   int[] data= new int[5];
//   x=5;
//   System.out.println(Arrays.toString(data));
//   for (int i=0;i <5; i++){
//      data[i]=i+1;
//   }
//   System.out.println(Arrays.toString(data));
//
//   int y=5;
//   int[] numbers2={1,2,3,4,5};
//   System.out.println(Arrays.toString(numbers2));