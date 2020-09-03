import java.util.*;

public class Teste {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa[] pessoas = new Pessoa[5];

        for(int i=0; i<5; i++) {
            System.out.println("Informe: (nome/idade/peso[60.5]/altura[1.60]");
            String[] dados = sc.nextLine().split("/");

            pessoas[i] = new Pessoa(dados[0],
                                    Integer.valueOf(dados[1]),
                                    Double.valueOf(dados[2]),
                                    Double.valueOf(dados[3])
                                    );
        }

        System.out.println("Informe um nome: ");
        String ans = sc.nextLine();
        for(int i=0; i<5; i++) {
            if(ans.equals(pessoas[i].getNome())) {
                System.out.println("Nome: " + pessoas[i].getNome());
                System.out.println("Idade: " + pessoas[i].getIdade());
                System.out.println("Peso: " + pessoas[i].getPeso());
                System.out.println("Altura: " + pessoas[i].getAltura());
                pessoas[i].imc();
                pessoas[i].aniversario();
                System.out.println("\nIdade após aniverśario: " + pessoas[i].getIdade());
                pessoas[i].comer();
                System.out.println("Peso após comer: " + pessoas[i].getPeso());
                pessoas[i].imc();
                pessoas[i].treinar();
                System.out.println("Peso após treinar: " + pessoas[i].getPeso());
                pessoas[i].imc();
            }
        }
    }
}