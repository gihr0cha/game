/**
 * 
 * @author Heitor Barros
 * 
 * Jogo desenvolvido para o Estudo de Caso da disciplina de Programa��o Orientada a Objetos.
 *
 */
public class Descansar extends Acao{
	
	public Descansar() {
		System.out.println("ZZZ \n Hora do soninho! \n ZZZ \n");
		super.saude = 1;
		super.forca = -1;
		super.energia = 3;
		super.felicidade = 0;
	}
	

}
