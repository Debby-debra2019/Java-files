import java.util.Scanner;

public class IsLeapYear
{
 public boolean IsLeapYear(int year){
     return ((year % 4 == 0) || (year % 400 == 0 ) && (year % 100 != 0));
}
 public static void main(String[] args) {
    IsLeapYear year = new IsLeapYear();

    System.out.println("Is a leap year: " + year.IsLeapYear(1987));
    System.out.println("Is a leap year: " + year.IsLeapYear(2000));
    System.out.println("Is a leap year: " + year.IsLeapYear(1977));

    
 }

}