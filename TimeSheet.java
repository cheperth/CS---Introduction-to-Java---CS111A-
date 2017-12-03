class workWeek 
{
 String name; 
 int hourlyWage;
 int hoursWorked;
}

public class TimeSheet
{
 public static void main(String[] args) 
 {
 workWeek thisWeek = new workWeek();
 thisWeek.hourlyWage = 15;
 thisWeek.hoursWorked = 30;
 thisWeek.name = "Che Perth";
 System.out.println(thisWeek.name + " Earnings: $" + thisWeek.hourlyWage * thisWeek.hoursWorked);
 }
}

