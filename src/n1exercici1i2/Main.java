/*** S1.7 Nivell 1 exercici 1 i 2 ***/
package n1exercici1i2;
@SuppressWarnings("deprecation")
public class Main {

    public static void main(String[] args) {
        Treballador treballadorPresencial1=new TreballadorPresencial("Dani","Vergès",18.90);
        TreballadorPresencial treballadorPresencial2=new TreballadorPresencial("Toni","Llombart",25.70);
        Treballador treballadorOnline1=new TreballadorOnline("Jordi","Mateu",22.10);
        TreballadorOnline treballadorOnline2=new TreballadorOnline("Laura","Àger",23.55);
        Treballador treballador=new Treballador("Aquest","No esxisteix",100);

        treballadorPresencial1.calcularSouNouMetode(35);
        treballadorPresencial2.calcularSouNouMetode(41);
        treballadorOnline1.calcularSouNouMetode(36);
        treballadorOnline2.calcularSouNouMetode(39);
        treballador.calcularSouNouMetode(100);
        treballadorPresencial2.calcularSou(35);

    }
}