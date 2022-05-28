import java.util.Scanner;

/**
 * 
 * @author Heitor Barros
 * 
 * Jogo desenvolvido para o Estudo de Caso da disciplina de Programa��o Orientada a Objetos.
 *
 */

public class Jogo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Monstrinho monstrinho = new Monstrinho();
		int opcao, turno = 1;
		
		System.out.println("Seu Monstrinho nasceu! \nCuide dele com carinho!\nN�o deixe seus status chegarem a zero");
		//Mostra o status do seu monstrinho
		monstrinho.status();
		//executa a repeti��o do jogo enquanto seu monstrinho est� vivo
		while(monstrinho.estaVivo()) {
			//Mostra as op��es e espera o jogador digitar sua escolha
			System.out.println("\n\n### TURNO "+turno+" ###");
			System.out.println("Escolha uma a��o: ");
			System.out.println("1- Comer: \n  Energia+ \n  Força+ \n  Sa�de+ \n \n" );
			System.out.println("2- Malhar: \n  Energia- \n  Força++ \n  Sa�de+ \n \n");
			System.out.println("3- Dormir: \n  Energia+++ \n  Força- \n  Sa�de+ \n \n");
			System.out.println("4- Brincar: \n  Energia-- \n  Sa�de++ \n  Felicidade+++ \n \n");


			opcao = teclado.nextInt();
			
			//Caso o usu�rio digite 1 a op��o � dar Comida ao Monstrinho
			if(opcao == 1) {
				monstrinho.aplicarAcao(new Comida());
			}
			//Caso o usu�rio digite 2 a op��o � fazer o Monstrinho Malhar
			if (opcao == 2) {
				monstrinho.aplicarAcao(new Malhacao());
			}
			//Caso o usu�rio digite 3 a op��o � fazer o Monstrinho descansar
			if (opcao == 3) {
				monstrinho.aplicarAcao(new Descansar());
			}
			if (opcao == 4) {
				monstrinho.aplicarAcao(new Brincar());
			}
			
	
			//Executa a a��o de passar turno onde o Monstrinho envelhece
			monstrinho.passarTurno();
			//Revela o status do Monstrinho ap�s passar turno
			monstrinho.status();
			turno++;
		}		
		
		//Os status do Monstrinho chegaram a zero
		System.out.println("### VOCE PERDEU ###");
		System.out.println("Seu mostrinho sobreviveu "+ turno + " turnos");
		
		
		teclado.close();
	}
	
	
}
