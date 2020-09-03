
public class Profissional {
    private String nome;
    private String profissao;
    private double salario;
    private int tempoExperiencia;
    private boolean trabalhando;

    public Profissional(String nome, String profissao, double salario, int tempoExperiencia) {
        this.nome = nome;
        this.profissao = profissao;
        this.salario = salario;
        this.tempoExperiencia = tempoExperiencia;
        this.trabalhando = false;
    }

    public void setProfissao(String novaProfissao) {
        this.profissao = novaProfissao;
    }

    public void setSalario(double novoSalario) {
        this.salario = novoSalario;
    }

    public void setExperiencia(int tempoExperiencia) {
        this.tempoExperiencia = tempoExperiencia;
    }

    public String getNome() {
        return this.nome;
    }

    public String getProfissao() {
        return this.profissao;
    }

    public double getSalario() {
        return this.salario;
    }

    public int getTempoExperiencia() {
        return this.tempoExperiencia;
    }

    public boolean getTrabalhando() {
        return this.trabalhando;
    }

    public void passarAnoEmpresa() {
        this.tempoExperiencia++;
    }

    public void aumento(Profissional obj, double novoSalario) {
        System.out.println("Profissional de nome " + this.nome + " recebeu um aumento");
        System.out.println("Salário antigo: " + this.salario);
        setSalario(novoSalario);
        System.out.println("Novo salário: " + this.salario);
    }

    public void trabalhar() {
        this.trabalhando = true;
    }

    public void irParaCasa() {
        this.trabalhando = false;
    }

    public void ouvirChefeReclamar(int horas) {
        if(horas > 1) {
            System.out.println("Profissional " + this.nome + " ouviu chefe reclamar por " + horas + " horas");
        } else {
            System.out.println("Impossível um chefe recalamar por menos de 1 hora");
        }
    }
}