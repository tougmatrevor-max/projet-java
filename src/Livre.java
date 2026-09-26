public class Livre extends Document {
    private int nombrePages;

    // Le constructeur doit accepter un objet Auteur (et non un String)
    public Livre(int numero, String titre, Auteur auteurPrincipal, int nombrePages) {
        super(numero, titre, auteurPrincipal);
        
        if (nombrePages <= 0) {
            throw new IllegalArgumentException("Le nombre de pages doit etre superieur a 0.");
        }
        this.nombrePages = nombrePages;
    }

    public int getNombrePages() {
        return nombrePages;
    }

    @Override
    public int dureeMaxPret() {
        return 21; // Duree de pret pour un livre (ex: 21 jours)
    }

    @Override
    public String toString() {
        return super.toString() + " | Nb pages : " + nombrePages;
    }
}
