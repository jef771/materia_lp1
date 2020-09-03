import java.util.*;

public class Teste {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InstrumentoMusical[] instrumentos = new InstrumentoMusical[5];

        for(int i=0; i<5; i++) {
            System.out.println("Informe: (modelo/marca/cor)");
            String[] dados = sc.nextLine().split("/");

            instrumentos[i] = new InstrumentoMusical(dados[0],dados[1],dados[2]);
        }

        System.out.println("Informe um tipo de instrumento: ");
        String ans = sc.nextLine();
        for(int i=0; i<5; i++) {
            if(ans.equals(instrumentos[i].getTipo())) {
                System.out.println("Tipo: " + instrumentos[i].getTipo());
                System.out.println("Marca: " + instrumentos[i].getMarca());
                System.out.println("Cor: " + instrumentos[i].getCor());
                instrumentos[i].treinar(2);
                instrumentos[i].apresentar();
                instrumentos[i].pintar(instrumentos[i], "Amarelo");
                System.out.println("Nova cor: " + instrumentos[i].getCor());

            }
        }
    }
}