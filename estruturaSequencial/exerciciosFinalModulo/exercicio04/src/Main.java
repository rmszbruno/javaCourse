import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int employeeNumber = sc.nextInt();
		int workedHours = sc.nextInt();
		double hourSalary = sc.nextDouble();
		
		double salary = (double) workedHours * hourSalary;
		
		System.out.printf("Number = %d%nSalary = %.2f", employeeNumber, salary);
		
	}

}
