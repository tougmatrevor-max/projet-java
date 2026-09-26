public abstract class Document implements Empruntable {
    private int numero;
    private String titre;
    private Auteur auteurPrincipal;
    private boolean disponible;
    private Adherent emprunteur;

    public Document(int numero, String titre, Auteur auteurPrincipal) {
        if (numero <= 0) {
            throw new IllegalArgumentException("Le numero doit etre positif.");
        }
        if (titre == null || titre.isBlank()) {
            throw new IllegalArgumentException("Le titre ne peut pas etre vide.");
        }
        if (auteurPrincipal == null) {
            throw new IllegalArgumentException("L'auteur principal est obligatoire.");
        }

        this.numero = numero;
        this.titre = titre;
        this.auteurPrincipal = auteurPrincipal;
        this.disponible = true;
        this.emprunteur = null;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitre() {
        return titre;
    }

    public Auteur getAuteurPrincipal() {
        return auteurPrincipal;
    }

    public Adherent getEmprunteur() {
        return emprunteur;
    }

    @Override
    public boolean isDisponible() {
        return disponible;
    }

    @Override
    public boolean emprunter(Adherent adherent) {
        if (adherent == null) {
            throw new IllegalArgumentException("L'adherent ne peut pas etre null.");
        }

        if (!disponible) {
            System.out.println("ECHEC : Le document '" + titre + "' est deja emprunte par " + emprunteur.getNomComplet() + ".");
            return false;
        }

        this.disponible = false;
        this.emprunteur = adherent;
        System.out.println("SUCCES : Le document '" + titre + "' a ete emprunte par " + adherent.getNomComplet() + ".");
        return true;
    }

    @Override
    public void retourner() {
        if (!disponible) {
            System.out.println("RETOUR : Le document '" + titre + "' a ete rendu par " + emprunteur.getNomComplet() + ".");
            this.disponible = true;
            this.emprunteur = null;
        } else {
            System.out.println("INFORMATION : Le document '" + titre + "' est deja disponible en bibliotheque.");
        }
    }

    public abstract int dureeMaxPret();

    @Override
    public String toString() {
        String statut = disponible ? "Disponible" : "Emprunte par " + emprunteur.getNomComplet();
        return "N°" + numero + " - " + titre + " (" + auteurPrincipal.toString() + ") [" + statut + "]";
    }
}
