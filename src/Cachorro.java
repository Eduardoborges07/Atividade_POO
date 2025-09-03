
public class Cachorro extends Animal {
	private String raca;

    public Cachorro(String nome, int idade, double peso, String habitat, String raca) {
        super(nome, idade, peso, habitat);
        this.raca = raca;
    public void emitirSom() {
	        System.out.println("Latido");
 }
 public void alimentar() {
        System.out.println("Ração");
 }
}
