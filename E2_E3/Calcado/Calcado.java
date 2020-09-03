
public class Calcado {
    private String modelo;
    private String marca;
    private String cor;
    private int tamanho;

    public Calcado(String modelo, String marca, String cor, int tamanho) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public void setModelo(String novoModelo) {
        this.modelo = novoModelo;
    }

    public void setMarca(String novaMarca) {
        this.marca = novaMarca;
    }

    public void setTamanho (int novoTamanho) {
        this.tamanho = novoTamanho;
    }

    public void setCor(String novaCor) {
        this.cor = novaCor;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public int getTamanho () {
        return this.tamanho;
    }

    public String getCor() {
        return this.cor;
    }

    public void calcar() {
        System.out.println("Calçado do modelo " + this.modelo + " e marca " + this.marca + " calçado!");
    }

    public void tingir(Calcado obj, String novaCor) {
        System.out.println("Usuário cometeu o erro de tingir o calçado modelo " + this.modelo + " para " + novaCor);
        System.out.println("Cor antiga: " + this.cor);
        obj.setCor(novaCor);
        System.out.println("Nova cor: " + this.cor);
    }

    public void remendar(String remendo) {
        System.out.println("Usuário remendou o calçado modelo " + this.modelo + " com " + remendo);
    }


}