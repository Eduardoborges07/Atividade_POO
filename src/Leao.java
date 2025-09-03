
public class Leao extends Animal {
	private double tamanhoJuba;

    public Leao(String nome, int idade, double peso, String habitat, double tamanhoJuba) {
        super(nome, idade, peso, habitat);
        this.tamanhoJuba = tamanhoJuba;
    }
    public void emitirSom() {
        System.out.println("Rugido");
    }
    public void alimentar() {
    System.out.println("Carne");
    }

}
