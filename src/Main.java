public class Main {
    public static void main(String[] args) {
        Auteur auteur = new Auteur("Kabre", "Marius");
        Document livre = new Livre(101, "Effective Java", auteur, 416);

        Adherent adh1 = new Adherent(1, "Ouédraogo", "Alice");
        Adherent adh2 = new Adherent(2, "Sawadogo", "Bob");

        System.out.println("TEST 1 : PREMIER EMPRUNT");
        livre.emprunter(adh1);

        System.out.println("\nTEST 2 : TENTATIVE DE DOUBLE EMPRUNT");
        livre.emprunter(adh2); 

        System.out.println("\nTEST 3 : RETOUR DU DOCUMENT");
        livre.retourner();

        System.out.println("\nTEST 4 : EMPRUNT APRÈS RETOUR");
        livre.emprunter(adh2);
    }
}
