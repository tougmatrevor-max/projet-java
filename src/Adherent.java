public class Adherent {
    private int id;
    private String nom;
    private String prenom;

    public Adherent(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNomComplet() {
        return prenom + " " + nom;
    }
}
