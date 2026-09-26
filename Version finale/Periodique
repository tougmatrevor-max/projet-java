public class Periodique extends Document {
    
    private int numeroParution;

    public Periodique(int numero, String titre, String auteurPrincipal, int numeroParution) {
        super(numero, titre, auteurPrincipal);
        this.numeroParution = numeroParution;
    }

    public int getNumeroParution() { return numeroParution; }

    
    @Override
    public int dureeMaxPret() {
        return 7;
    }

    @Override
    public String toString() {
        return super.toString() + " - Périodique (N°" + numeroParution + ")";
    }
}
