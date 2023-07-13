import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextDouble();
		double resultado = 3.14159 * Math.pow(raio, 2);
		
		System.out.printf("O valor da área é: %.4f", resultado);
		
		sc.close();
		
	}

}
