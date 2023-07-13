import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int partCode1 = sc.nextInt();
		int partQuantity1 = sc.nextInt();
		double partUnitaryPrice1 = sc.nextDouble();
		
		int partCode2 = sc.nextInt();
		int partQuantity2 = sc.nextInt();
		double partUnitaryPrice2 = sc.nextDouble();
		
		double priceToPay = (double) partQuantity1 * partUnitaryPrice1 + partQuantity2 * partUnitaryPrice2;
		
		System.out.printf("Price to pay: $ %.2f", priceToPay);
		
		sc.close();
	}

}
