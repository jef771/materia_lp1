
public class InstrumentoMusical {
    private String tipo;
    private String marca;
    private String cor;

    public InstrumentoMusical(String tipo, String marca, String cor) {
        this.tipo = tipo;
        this.marca = marca;
        this.cor = cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return this.tipo;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getCor() {
        return this.cor;
    }

    public void treinar(int tempo) {
        if(tempo == 1) {
            System.out.println("Treinando " + this.tipo + " por " + tempo + " hora");
        } else {
            System.out.println("Treinando " + this.tipo + " por " + tempo + " horas");
        }
    }

    public void apresentar() {
        System.out.println("Tocando " + this.tipo);
    }

    public void pintar(InstrumentoMusical obj, String cor) {
        System.out.println("Pintando o instrumento do tipo " + this.tipo + " da marca " + this.marca + " com a cor " + cor);
        obj.setCor(cor);
    }

}