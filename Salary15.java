import java.util.Scanner;

public class Salary15 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int salary, salaryDeduction, numAttendance, numbAbsence, totalSalary;
        System.out.println("Input salary: ");
        salary = input.nextInt();
        System.out.println("Input salary deduction: ");
        salaryDeduction = input.nextInt();
        System.out.println("Input attendance number: ");
        numAttendance = input.nextInt();
        System.out.println("Input absence number: ");
        numbAbsence = input.nextInt();
        totalSalary=(numAttendance*salary)-(numbAbsence*salaryDeduction);
        System.out.println("Total salary: "+totalSalary);
    }
}
