
public class Lugar {
    private String nome;
    private String clima;
    private boolean pontoTuristico;
    private String pais;

    public Lugar(String nome, String clima, boolean pontoTuristico, String pais) {
        this.nome = nome;
        this.clima = clima.toLowerCase();
        this.pontoTuristico = pontoTuristico;
        this.pais = pais;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public void setPontoTuristico(boolean pontoTuristico) {
        this.pontoTuristico = pontoTuristico;
    }

    public String getNome() {
        return this.nome;
    }

    public String getClima() {
        return this.clima;
    }

    public String getPontoTuristico() {
        if(this.pontoTuristico) {
            return "Sim";
        } else {
            return "Não";
        }
    }

    public String getPais() {
        return this.pais;
    }

    public void viajar() {
        System.out.println("Viajando para: " + this.nome + " \nLocalização: " + this.pais);
    }

    public void visitarPontoTuristico() {
        if(this.pontoTuristico) {
            System.out.println("Visitando ponto turístico de " + this.nome);
        } else {
            System.out.println("Nada para visitar...");
        }
    }

    public void arrumarMalas() {
        if(this.clima.equals("quente")) {
            System.out.println("Levar roupas leves");
        } else if(this.clima.equals("frio")) {
            System.out.println("Levar roupas pesadas");
        } else {
            System.out.println("Levar roupas leves e pesadas");
        }
    }
}