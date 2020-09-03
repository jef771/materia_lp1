
public class AlunoFatecSJC {
    private String nome;
    private String matricula;
    private String curso;
    private int semestre;

    public AlunoFatecSJC(String nome, String matricula, String curso, int semestre) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.semestre = semestre;
    } 

    public void setMatricular(String matricula) {
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
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

    public int getSemestre() {
        return this.semestre;
    }

    public void estudar(String materia) {
        System.out.println("Estudando para: " + materia);
    }

    public void mudarCurso(String novoCurso) {
        System.out.println("Mudando do curso " + this.curso + " para " + novoCurso);
        this.curso = novoCurso;
    }

    public void dp() {
        this.semestre--;
    }

    public void passeiDireto() {
        this.semestre++;
    }

    public void formado() {
        if(this.semestre >= 6) {
            System.out.println("Era pra estar...");
        } else {
            System.out.println("Falta muito...");
        }
    }

}