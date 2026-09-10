public class Main {
    public static void main(String[] args) {
      
        Livre livre = new Livre(101, "Introduction à Java", "Auteur Inconnu", 320);
        Periodique periodique = new Periodique(202, "Science et technique", "Rédaction", 12);

        // 1.4. Vérification des durées de prêt (21 et 7)
        System.out.println("Durée max prêt livre : " + livre.dureeMaxPret() + " jours");
        System.out.println("Durée max prêt périodique : " + periodique.dureeMaxPret() + " jours");

        // 1.4. Vérification de la disponibilité du livre
        System.out.println("Disponibilité initiale : " + livre.isDisponible()); 

        livre.emprunter();
        System.out.println("Après emprunter() : " + livre.isDisponible()); 

        livre.retourner();
        System.out.println("Après retourner() : " + livre.isDisponible());
    }
}
