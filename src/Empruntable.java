public interface Empruntable {
    boolean emprunter(Adherent adherent);
    void retourner();
    boolean isDisponible();
}
