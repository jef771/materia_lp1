
public class AlunoFatecSJC {
    private String nome;
    private String matricula;
    private String curso;
    private int trabalhos;

    public AlunoFatecSJC(String nome, String matricula, String curso, int trabalhos) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.trabalhos = trabalhos;
    } 
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setTrabalhos(int trabalhos) {
        this.trabalhos = trabalhos;
    }

    public String getNome() {
        return this.nome; 
    }

    public String getMatricula() {
        return this.matricula;
    }

    public String getCurso() {
        return this.curso;
    }

    public int getTrabalhos() {
        return this.trabalhos;
    }

}