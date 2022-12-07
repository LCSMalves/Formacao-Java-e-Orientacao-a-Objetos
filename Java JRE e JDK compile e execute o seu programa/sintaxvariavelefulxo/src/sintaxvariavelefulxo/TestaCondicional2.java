package sintaxvariavelefulxo;

public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 16;
		int quantidadedePessoas = 3;

		if (idade >= 18 || quantidadedePessoas >= 2) {
			System.out.println("seja bem vindo");
		} else {
			System.out.println("vc não pode entrar");
		}
		
		if (idade >= 18 && quantidadedePessoas >= 2) {
			System.out.println("seja bem vindo");
		} else {
			System.out.println("vc não pode entrar");
		}
		
		boolean acompanhado =  quantidadedePessoas >= 2;
		
		if (idade >= 18 || acompanhado) {
			System.out.println("seja bem vindo");
		} else {
			System.out.println("vc não pode entrar");
		}		
		if (idade >= 18 && acompanhado) {
			System.out.println("seja bem vindo");
		} else {
			System.out.println("vc não pode entrar");
		}
	}
}
