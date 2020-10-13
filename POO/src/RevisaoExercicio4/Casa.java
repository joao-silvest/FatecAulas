package RevisaoExercicio4;

import RevisaoExercicio3.Porta;

public class Casa extends Porta{

    public String cor;

    Porta porta1 = new Porta();
    Porta porta2 = new Porta();
    Porta porta3 = new Porta();

    @Override
    public String getCor() {
        return cor;
    }

    @Override
    public void setCor(String cor) {
        this.cor = cor;
    }

    public int quantasPortasEstaoAbertas(){
        int count = 0;

        if(this.porta1.estaAberta() == true){
            count++;
        }
        if(this.porta2.estaAberta() == true){
            count++;
        }
        if(this.porta3.estaAberta() == true){
            count++;
        }

        return count;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "cor='" + cor + '\'' +
                ", porta1=" + porta1 +
                ", porta2=" + porta2 +
                ", porta3=" + porta3 +
                '}';
    }
}
