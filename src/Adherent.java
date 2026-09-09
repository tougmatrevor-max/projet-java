public class Adherent {
    private String nom;
    private int identifiant; 
    private String mail;

    public Adherent(int identifiant, String nom, String mail) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.mail = mail;
    }

    // Getters et Setters
    public int getIdentifiant() {
        return identifiant;
    }

    public String getNom() {
        return nom;
    }

    public String getMail() {
        return mail;
    }

    public void afficherInformations() {
        System.out.println("Adhérent n°" + identifiant + " | Nom: " + nom + " | Mail: " + mail);
    }
}
