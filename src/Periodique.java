public class Periodique extends Document {
    private int numeroParution;

    public Periodique(int numero, String titre, Auteur auteurPrincipal, int numeroParution) {
        super(numero, titre, auteurPrincipal);
        this.numeroParution = numeroParution;
    }

    public int getNumeroParution() {
        return numeroParution;
    }

    @Override
    public int dureeMaxPret() {
        return 7; // Duree de pret pour un periodique (ex: 7 jours)
    }

    @Override
    public String toString() {
        return super.toString() + " | N° parution : " + numeroParution;
    }
}
