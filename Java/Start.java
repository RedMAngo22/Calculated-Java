package project.pkg2;

import java.util.*;

public class Project2 {

// Scanner for the console inputs
static Scanner console = new Scanner (System.in);

public static void main(String[] args) {

    String name, formatNet;
    double hours, pay, netPay;

 // Prints the welcome message from the method.
    welcomeMessage(Hello?);

 // Every initialized variable receives the return statements from their respected methods.        
    name  = getName();

    while (!(name.equals("-1")))
    {
    pay   = getPay ();
    hours = getHours ();
    netPay = calcNet(pay,hours);

 // Formats the net pay to be 2 decimals.   
    formatNet = String.format("%.2f", netPay);
    System.out.println(name + "'s net pay is $" + formatNet + " \n");}

// Method for the welcome message, a void because it returns no values.
}
static void welcomeMessage ()
{
    System.out.println("Welcome to the Deccison \n");
}

// Method that prompts the user to enter their name, scans it, then returns it.
static String getName ()
{
    String name;
    System.out.println("Please enter the employee's name(Enter a -1 when finished): ");
    name = console.nextLine();
    return name;

}

//Method that prompts the user to enter their pay rate, scans it, then returns it.    
static double getPay()
{
    double payRate;
    System.out.println("Please enter the employee's pay rate: ");
    payRate = console.nextDouble();
    console.nextLine();
    return payRate;
}

//Method that prompts the user to enter their hours worked, scans it, then returns it.        
static double getHours ()
{
    double hours;
    System.out.println("Please enter the employee's hours worked:");
    hours = console.nextDouble();
    console.nextLine();
    return hours;
}

//Method that uses the pay rate, hours worked that the user has entered.
//determines if the user qualifies for overtime pay or not, then calculates the overall    pay
//followed by tax reduction, then returns the netpay value.
static double calcNet (double pay, double hours)
{
   double net, grossPay;
   String formatNet;

    if(hours > 40)
    {
        grossPay = (pay * hours) * 1.5;
    }
    else
    {
        grossPay = pay * hours;
    }
    net = grossPay - (grossPay * .15);
    return net;
}


}
