
public class Gato extends Animal {
	private String cor;

    public Gato(String nome, int idade, double peso, String habitat, String cor) {
        super(nome, idade, peso, habitat);
        this.cor = cor;
    }
    public void emitirSom() {
        System.out.println("Miau");
    }
    public void alimentar() {
    System.out.println("Ração de gato");
    }

}
