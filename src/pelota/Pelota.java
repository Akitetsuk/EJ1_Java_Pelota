package pelota;

public class Pelota {
    public String nomPropietat;
    public int presion;
    public boolean operativa;

    public Pelota(String nomP) {
        this.nomPropietat = nomP;
        this.presion = 10;
        this.operativa = true;
    }

    public void inflar(int quantitatMes) {
        presion = presion + quantitatMes;
        if (presion >=30 ) {
            operativa = false;
            presion = 0;
        }
    }

    public void desinflar(int quantitatMenys) {
        if (presion <= quantitatMenys) {
            presion = 0;
        } else {
            presion = presion - quantitatMenys;
        }
    }

    public String botar() {
        String resultado = "la pelota de " + this.nomPropietat;
        if (this.operativa == false){
            resultado = resultado + " ha reventado la pelota no esta operativa";
        }
        else if (presion > 5) {
            resultado = resultado + " la pelota bota poca";
        } else {
            resultado = resultado + " la pelota bota mucho";
        }
        return (resultado);
    }
}



