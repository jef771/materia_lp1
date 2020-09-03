import java.util.*;

public class Teste {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AlunoFatecSJC[] alunos = new AlunoFatecSJC[5];

        for(int i=0; i<5; i++) {
            System.out.println("Informe: (nome/matrícula/curso/semestre)");
            String[] dados = sc.nextLine().split("/");

            alunos[i] = new AlunoFatecSJC(dados[0],
                                    (dados[1]),
                                    (dados[2]),
                                    Integer.valueOf(dados[3])
                                    );
        }

        System.out.println("Informe um nome: ");
        String ans = sc.nextLine();
        for(int i=0; i<5; i++) {
            if(ans.equals(alunos[i].getNome())) {
                System.out.println("Nome: " + alunos[i].getNome());
                System.out.println("Matricula: " + alunos[i].getMatricula());
                System.out.println("Curso: " + alunos[i].getCurso());
                System.out.println("Semestre: " + alunos[i].getSemestre());
                System.out.print("Estou formado? ");
                alunos[i].formado();
                alunos[i].estudar("Linguagem de Programação 1");
                alunos[i].passeiDireto();
                System.out.println("Estudei e agora estou no semestre " + alunos[i].getSemestre());
                alunos[i].dp();
                System.out.println("Não estudei e voltei para o semestre " + alunos[i].getSemestre());
            }
        }
    }
}