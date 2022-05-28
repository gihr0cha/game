/**
 * 
 * @author Heitor Barros
 * 
 * Jogo desenvolvido para o Estudo de Caso da disciplina de Programa��o Orientada a Objetos.
 *
 */
public class Monstrinho {

	int saude;
	int energia;
	int forca;
	int felicidade;
	
	//Construtor da classe Monstrinho
	//Os atributos do Monstrinho iniciam com valor 5
	public Monstrinho() {
		this.saude = 10;
		this.energia = 10;
		this.forca = 10;
		this.felicidade = 10;
	}
	
	public void passarTurno() {
		//A classe GeradorDeNumeros � utilizada para gerar um n�mero aleat�rio
		//entre 0 e 2 para ser reduzido dos atributos do Monstrinho
		this.saude -= GeradorDeNumeros.gerar();
		this.energia -= GeradorDeNumeros.gerar();
		this.forca -= GeradorDeNumeros.gerar();
		this.felicidade -= GeradorDeNumeros.gerar();
		
	}
	
	public void aplicarAcao(Acao acao) {
		//Ao aplicar uma A��o no monstrinho, seus atributos aumentam
		//de acordo com os atributos da a��o empregada
		this.saude += acao.getSaude();
		this.forca += acao.getForca();
		this.energia += acao.getEnergia();
		this.felicidade += acao.getFelicidade();

	}
	
	public boolean estaVivo() {
		//Este m�todo retorna verdadeiro quando todos os atributos do
		//Monstrinho forem maiores que zero. Caso um dos atributos seja
		//menor ou igual a zero este m�todo retorna falso.
		return (this.saude > 0 && this.energia > 0 && this.forca> 0 && this.felicidade>0);
	}

	
	public void status() {
		//Este m�todo imprime os valores dos atributos do Monstrinho
		if (this.saude <= 3 && this.energia <= 3 && this.forca <= 3 && this.felicidade<= 3) {
			System.out.println("!!!");
		}
		System.out.println("Dados do monstrinho:");
		System.out.println("Sa�de: " + this.saude);
		if(this.saude <= 3){System.out.println("Seu mostrinho est� doente...");}
		System.out.println("Energia: " + this.energia);
		if(this.energia <= 3){System.out.println("Seu mostrinho est� cansado...");}
		System.out.println("For�a: " + this.forca);
		if(this.forca <= 3){System.out.println("Seu mostrinho est� fraco...");}
		System.out.println("Felicidade: " + this.felicidade);
		if(this.felicidade <= 3){System.out.println("Seu mostrinho est� triste...");}


	}
	
}
