package RevisaoExercicio3;

//import java.util.Scanner;

public class PortaTeste {
    public static void main(String[] args) {
        Porta porta1 = new Porta();
        //Scanner leitor = new Scanner(System.in);

        porta1.setAberta("Sim");
        porta1.setCor("Marrom");
        porta1.setDimensaoX((float) 2.10);
        porta1.setDimensaoY((float) 0.75);
        porta1.setDimensaoZ((float) 0.03);

        System.out.println(porta1.toString());

        System.out.println(porta1.estaAberta());
        porta1.abre();

        System.out.println(porta1.toString());

        porta1.fecha();

        System.out.println(porta1.toString());

        porta1.pinta("Branca");

        System.out.println(porta1.toString());

        porta1.setDimensaoX((float) 1.80);
        porta1.setDimensaoY((float) 1.00);
        porta1.setDimensaoZ((float) 0.05);

        System.out.println(porta1.toString());

        System.out.println(porta1.estaAberta());


    }
}
