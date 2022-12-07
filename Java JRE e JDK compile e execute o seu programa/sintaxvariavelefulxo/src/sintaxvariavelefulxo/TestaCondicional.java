package sintaxvariavelefulxo;

public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 16;
		int quantidadedePessoas = 3;
		if (idade >= 18) {
			System.out.println("vc tem mais de 18 anos");
			System.out.println("seja bem vindo");
		} else {
			if (quantidadedePessoas >= 2) {
				System.out.println("vc não tem 18, mas pode entrar, pq está acompanhado");
			} else {
				System.out.println("vc não pode entrar");
			}
		} 
	}
}
