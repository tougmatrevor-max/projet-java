// Document.java
public abstract class Document {
    private int numero;
    private String titre;
    private String auteurPrincipal;
    private boolean disponible;

    public Document(int numero, String titre, String auteurPrincipal) {
        if (numero <= 0) throw new IllegalArgumentException("Numéro invalide.");
        if (titre == null || titre.isBlank()) throw new IllegalArgumentException("Titre invalide.");
        if (auteurPrincipal == null || auteurPrincipal.isBlank()) throw new IllegalArgumentException("Auteur invalide.");

        this.numero = numero;
        this.titre = titre;
        this.auteurPrincipal = auteurPrincipal;
        this.disponible = true;
    }

    public int getNumero() { return numero; }
    public String getTitre() { return titre; }
    public String getAuteurPrincipal() { return auteurPrincipal; }
    public boolean isDisponible() { return disponible; }

    public void emprunter() { this.disponible = false; }
    public void retourner() { this.disponible = true; }

    public abstract int dureeMaxPret();

    @Override
    public String toString() {
        return "N°" + numero + " - " + titre + " (" + auteurPrincipal + ") [Disponible: " + disponible + "]";
    }
}
