import java.util.Scanner;
public class Cumplen{
	public static void main(String arg []){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el número de personas: ");
		int sizeGrupo = (entrada.nextInt());
		System.out.println(cumple(sizeGrupo));
		for (int i = 23; i <= 60 ; i++) {
			System.out.println("| n = " + i + " | " + cumple(i) + " | ");
		}
	} 
	public static double cumple(int num) {
		double p = 1.0;
		for (int i = 1; i <= num; i++) {
			p = p * (366 - i) / 365;
		}
		return (100 * ((1 - p)));
	}
}