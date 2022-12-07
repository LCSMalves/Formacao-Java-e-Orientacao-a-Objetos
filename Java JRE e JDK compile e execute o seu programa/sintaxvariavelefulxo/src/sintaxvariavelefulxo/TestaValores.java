package sintaxvariavelefulxo;

public class TestaValores {
	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		System.out.println("Primeiro " + primeiro);
		System.out.println("Segundo " + segundo);
		segundo = primeiro;
		primeiro = 10;
		System.out.println("Primeiro " + primeiro);
		System.out.println("Segundo " + segundo);
	}
}
