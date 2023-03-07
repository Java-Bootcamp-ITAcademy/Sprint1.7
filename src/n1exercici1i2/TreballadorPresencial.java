/*** S1.7 Nivell 1 exercici 1 i 2 ***/
package n1exercici1i2;

import n1exercici1i2.Treballador;

public class TreballadorPresencial extends Treballador {
    public static double benzina=80.0;
    public TreballadorPresencial(String nom, String cognom, double preuHora) {
        super(nom, cognom, preuHora);
    }

    @Override
    public double calcularSouNouMetode(int horesTreballades) { //New methods DOES take into account taxes
        System.out.println("Al treballador PRESENCIAL "+this.getNom()+" "+this.getCognom()+" li correspon un sou de "+horesTreballades*this.getPreuHora()*(1-taxes/100)+benzina);
        return horesTreballades*this.getPreuHora()+benzina;
    }
    @Deprecated(since="February 2023")
    public double calcularSou(int horesTreballades) {  //Old method didn't take into account taxes
        System.out.println("Al treballador PRESENCIAL "+this.getNom()+" "+this.getCognom()+" li correspon un sou de "+horesTreballades*this.getPreuHora()+benzina);
        return horesTreballades*this.getPreuHora()+benzina;
    }

}
