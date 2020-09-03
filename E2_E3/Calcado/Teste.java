import java.util.*;

public class Teste {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calcado[] calcados = new Calcado[5];

        for(int i=0; i<5; i++) {
            System.out.println("Informe: (modelo/marca/cor/tamanho)");
            String[] dados = sc.nextLine().split("/");

            calcados[i] = new Calcado(
                                        dados[0],
                                        dados[1],
                                        dados[2],
                                        Integer.valueOf(dados[3])
                                    );
        }

        System.out.println("Informe um modelo: ");
        String ans = sc.nextLine();
        for(int i=0; i<5; i++) {
            if(ans.equals(calcados[i].getModelo())) {
                System.out.println("Modelo: " + calcados[i].getModelo());
                System.out.println("Marca: " + calcados[i].getMarca());
                System.out.println("Cor: " + calcados[i].getCor());
                System.out.println("Tamanho: " + calcados[i].getTamanho());
                
                calcados[i].calcar();
                calcados[i].tingir(calcados[i], "verde neon");
                calcados[i].remendar("prego");
            }
        }
    }
}