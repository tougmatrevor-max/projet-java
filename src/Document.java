public class Document {
    private int numero;
    private String titre;
    private String auteur;
    private boolean disponibilite;

    public Document(int numero, String titre, String auteur) {
        this.numero = numero;
        this.titre = titre;
        this.auteur = auteur;
        this.disponibilite = true; 
    }


    public int getNumero() {
        return numero;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public boolean isDisponible() {
        return disponibilite;
    }

    public void setDisponibilite(boolean disponibilite) {
        this.disponibilite = disponibilite;
    }

    public void afficherInformations() {
        System.out.println("Document n°" + numero + " | Titre: \"" + titre + "\" | Auteur: " + auteur + " | Statut: " + (disponibilite ? "Disponible" : "Emprunté"));
    }
}
