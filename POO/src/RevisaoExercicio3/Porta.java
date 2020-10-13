package RevisaoExercicio3;

public class Porta {
    public String aberta;
    public String cor;
    public float dimensaoX;
    public float dimensaoY;
    public float dimensaoZ;

    public String getAberta() {
        return aberta;
    }

    public void setAberta(String aberta) {
        this.aberta = aberta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getDimensaoX() {
        return dimensaoX;
    }

    public void setDimensaoX(float dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    public float getDimensaoY() {
        return dimensaoY;
    }

    public void setDimensaoY(float dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    public float getDimensaoZ() {
        return dimensaoZ;
    }

    public void setDimensaoZ(float dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }

    public void abre() {
        if(this.aberta == "Não"){
            this.aberta = "Sim";
        }else{
            System.out.println("Porta já esta aberta!");
        }
    }

    public void fecha() {
        if(this.aberta == "Sim"){
            this.aberta = "Não";
        }else{
            System.out.println("Porta já esta fechada!");
        }
    }

    public void pinta(String s) {
        this.cor = s;

    }

    public boolean estaAberta() {
        if(this.aberta == "Sim"){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Porta{" +
                "aberta='" + aberta + '\'' +
                ", cor='" + cor + '\'' +
                ", dimensaoX=" + dimensaoX +
                ", dimensaoY=" + dimensaoY +
                ", dimensaoZ=" + dimensaoZ +
                '}';
    }
}
