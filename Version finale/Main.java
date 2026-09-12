import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Document> documents = new ArrayList<>();
        documents.add(new Livre(101, "Introduction à Java", "Auteur A", 320));
        documents.add(new Periodique(202, "Science et Technique", "Rédaction", 12));

        System.out.println("--- ESSAI 1 : Sous-type Livre ---");
        Document docLivre = documents.get(0);
        System.out.println("Description : " + docLivre.toString());
        System.out.println("Durée max de prêt : " + docLivre.dureeMaxPret() + " jours");

        System.out.println("\n--- ESSAI 2 : Sous-type Périodique ---");
        Document docPeriodique = documents.get(1);
        System.out.println("Description : " + docPeriodique.toString());
        System.out.println("Durée max de prêt : " + docPeriodique.dureeMaxPret() + " jours");

        System.out.println("\n--- ESSAI 3 : Parcours polymorphe de la liste ---");
        for (Document doc : documents) {
            // L'appel déclenche le comportement propre à chaque objet réel à la volée
            System.out.println(doc.getTitre() + " -> Durée max: " + doc.dureeMaxPret() + " jours");
            doc.emprunter();
            System.out.println("Statut après emprunt : " + (doc.isDisponible() ? "Libre" : "Emprunté"));
        }
    }
}
