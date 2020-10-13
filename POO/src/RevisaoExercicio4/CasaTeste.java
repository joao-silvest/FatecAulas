package RevisaoExercicio4;

public class CasaTeste {
    public static void main(String[] args) {
        Casa casa1 = new Casa();

        casa1.setCor("Bege");

        casa1.porta1.setCor("Vermelha");
        casa1.porta1.setAberta("Sim");
        casa1.porta1.setDimensaoX((float) 1.80);
        casa1.porta1.setDimensaoY((float) 0.80);
        casa1.porta1.setDimensaoZ((float) 0.03);

        casa1.porta2.setCor("Branca");
        casa1.porta2.setAberta("Não");
        casa1.porta2.setDimensaoX((float) 2.10);
        casa1.porta2.setDimensaoY((float) 0.70);
        casa1.porta2.setDimensaoZ((float) 0.04);

        casa1.porta3.setCor("Vermelha");
        casa1.porta3.setAberta("Sim");
        casa1.porta3.setDimensaoX((float) 2.00);
        casa1.porta3.setDimensaoY((float) 0.90);
        casa1.porta3.setDimensaoZ((float) 0.05);

        System.out.println(casa1.toString());

        System.out.println(casa1.quantasPortasEstaoAbertas() + " portas estão abertas!");

        casa1.porta2.setAberta("Sim");

        System.out.println(casa1.quantasPortasEstaoAbertas() + " portas estão abertas!");


    }
}
