// Document.java
public abstract class Document {
    // Attributs communs centralisés (pas de duplication dans les classes filles)
    private int numero;
    private String titre;
    private String auteurPrincipal;
    private boolean disponible;

    public Document(int numero, String titre, String auteurPrincipal) {
        this.numero = numero;
        this.titre = titre;
        this.auteurPrincipal = auteurPrincipal;
        this.disponible = true; // Disponible à la création
    }

    public int getNumero() { return numero; }
    public String getTitre() { return titre; }
    public String getAuteurPrincipal() { return auteurPrincipal; }
    public boolean isDisponible() { return disponible; }

    public void emprunter() {
        this.disponible = false;
    }

    public void retourner() {
        this.disponible = true;
    }

    // A3. Méthode abstraite déclarée dans le type parent
    public abstract int dureeMaxPret();

    // A3. Méthode toString commune
    @Override
    public String toString() {
        return "N°" + numero + " - " + titre + " par " + auteurPrincipal + " [Disponible: " + disponible + "]";
    }
}
