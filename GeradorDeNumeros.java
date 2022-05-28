import java.util.Random;

/**
 * 
 * @author Heitor Barros
 * 
 * Jogo desenvolvido para o Estudo de Caso da disciplina de Programação Orientada a Objetos.
 *
 */

public class GeradorDeNumeros {

	public static int gerar() {
		Random r = new Random();
		return r.nextInt(5)/2;
	}
	
	public static void main(String[] args) {
		System.out.println(GeradorDeNumeros.gerar());
	}
	
}
