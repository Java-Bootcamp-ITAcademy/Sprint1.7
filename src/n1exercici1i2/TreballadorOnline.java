/*** S1.7 Nivell 1 exercici 1 i 2 ***/
package n1exercici1i2;

import n1exercici1i2.Treballador;

public class TreballadorOnline extends Treballador {
    public static final double tarifaPlana=40;

    /* Constructor */
    public TreballadorOnline(String nom, String cognom, double preuHora) {
        super(nom,cognom,preuHora);
    }
    @Override
    public double calcularSouNouMetode(int horesTreballades) {  //New methods DOES take into account taxes
        System.out.println("Al treballador ONLINE "+this.getNom()+" "+this.getCognom()+" li correspon un sou de "+horesTreballades*this.getPreuHora()*(1-taxes/100)+tarifaPlana);
        return horesTreballades*this.getPreuHora()+tarifaPlana;
    }

    @Deprecated(since="February 2023")
    public double calcularSou(int horesTreballades) {  //Old method DOES NOT take into account taxes
        System.out.println("Al treballador ONLINE "+this.getNom()+" "+this.getCognom()+" li correspon un sou de "+horesTreballades*this.getPreuHora()+tarifaPlana);
        return horesTreballades*this.getPreuHora()+tarifaPlana;
    }
}
