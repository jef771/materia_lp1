import java.util.*;

public class Teste {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Profissional[] profissionais = new Profissional[5];

        for(int i=0; i<5; i++) {
            System.out.println("Informe: (nome/profissão/salário/tempo de experiência em anos[mínimo 1 ano]");
            String[] dados = sc.nextLine().split("/");

            profissionais[i] = new Profissional(dados[0],
                                                dados[1],
                                                Double.valueOf(dados[2]),
                                                Integer.valueOf(dados[3])
                                                );
        }

        System.out.println("Informe um nome: ");
        String ans = sc.nextLine();
        for(int i=0; i<5; i++) {
            if(ans.equals(profissionais[i].getNome())) {
                System.out.println("Nome: " + profissionais[i].getNome());
                System.out.println("Profissao: " + profissionais[i].getProfissao());
                System.out.println("Salario: " + profissionais[i].getSalario());
                System.out.println("Tempo de experiência: " + profissionais[i].getTempoExperiencia());
                
                profissionais[i].trabalhar();
                System.out.println(profissionais[i].getTrabalhando());
                profissionais[i].passarAnoEmpresa();
                System.out.println("Profissional " + profissionais[i].getNome() + " trabalhou durante um ano");
                System.out.println("Novo tempo de experiência: " + profissionais[i].getTempoExperiencia());
                System.out.println("Recebeu um aumento!");
                profissionais[i].aumento(profissionais[i], 1001.0);
                profissionais[i].ouvirChefeReclamar(1);
                profissionais[i].ouvirChefeReclamar(2);
                profissionais[i].irParaCasa();
                System.out.println("Está trabalhando? " + profissionais[i].getTrabalhando()); 

            }
        }
    }
}