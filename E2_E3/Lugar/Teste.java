import java.util.*;

public class Teste {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Lugar[] lugares = new Lugar[5];

        for(int i=0; i<5; i++) {
            System.out.println("Nome do lugar:");
            String nome = sc.nextLine();

            System.out.println("Clima:");
            String clima = sc.nextLine();

            System.out.println("Possui ponto turístico?");
            String ans = sc.nextLine().toLowerCase();
            boolean pontoTuristico = false;
            if(ans.equals("sim")) {
                pontoTuristico = true;
            }

            System.out.println("Qual o país?");
            String pais = sc.nextLine();

            Lugar local = new Lugar(nome, clima, pontoTuristico, pais);
            lugares[i] = local;
        }

        System.out.println("\nInforme país que deseja visitar: ");
        String ans = sc.nextLine();
        for(int i=0; i<5; i++) {
            if(lugares[i].getNome().equals(ans)) {
                System.out.println("Lugar: " + lugares[i].getNome());
                System.out.println("Clima: " + lugares[i].getClima());
                System.out.println("Localização: " + lugares[i].getPais());
                System.out.println("É ponto turístico? " + lugares[i].getPontoTuristico());                
                lugares[i].arrumarMalas();
                lugares[i].viajar();
                lugares[i].visitarPontoTuristico();
            }
        }
    }
}