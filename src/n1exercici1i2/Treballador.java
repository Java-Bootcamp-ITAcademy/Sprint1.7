/*** S1.7 Nivell 1 exercici 1 i 2 ***/
package n1exercici1i2;

public class Treballador {
    private String nom;
    private String cognom;
    private double preuHora;

    public static final double taxes=20;

    /* Constructor */
    public Treballador(String nom, String cognom, double preuHora) {
        this.nom=nom;
        this.cognom=cognom;
        this.preuHora=preuHora;
    }

    /* Getters and Setters */

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public double getPreuHora() {
        return preuHora;
    }

    public void setPreuHora(double preuHora) {
        this.preuHora = preuHora;
    }

    /* Instance method */
    public double calcularSouNouMetode(int horesTeballades) {
        System.out.println("Mètode de la classe Treballador. Li correspon 0€ si no el sobreescrivim.");
        return 0.0;
    }
}
