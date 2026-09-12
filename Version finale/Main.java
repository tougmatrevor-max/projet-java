import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        System.out.println(" PARTIE 1 : TESTS SUR RÉFÉRENCES DIRECTES \n");
        
        Document doc1 = new Livre(101, "Introduction à Java", "Lionel", 320);
        Document doc2 = new Periodique(202, "Science et Technique", "Rédaction", 12);

        System.out.println(" PRÉSENTATION ET DURÉES DE PRÊT ");
        System.out.println(doc1.toString() + " -> Durée max: " + doc1.dureeMaxPret() + " jours");
        System.out.println(doc2.toString() + " -> Durée max: " + doc2.dureeMaxPret() + " jours");

        System.out.println("\n VÉRIFICATION DES RÈGLES D'EMPRUNT ");
        System.out.println("Disponibilité initiale doc1 : " + doc1.isDisponible()); 

        doc1.emprunter();
        System.out.println("Statut après emprunt doc1 : " + doc1.isDisponible()); 

        doc1.retourner();
        System.out.println("Statut après retour doc1  : " + doc1.isDisponible()); 


        System.out.println("\n\n PARTIE 2 : TESTS SUR COLLECTION \n");

        List<Document> documents = new ArrayList<>();
        documents.add(new Livre(101, "Introduction à Java", "Lionel", 320));
        documents.add(new Periodique(202, "Science et Technique", "Rédaction", 12));

        System.out.println(" ESSAI 1 : Sous-type Livre ");
        Document docLivre = documents.get(0);
        System.out.println("Description : " + docLivre.toString());
        System.out.println("Durée max de prêt : " + docLivre.dureeMaxPret() + " jours");

        System.out.println("\n ESSAI 2 : Sous-type Périodique ");
        Document docPeriodique = documents.get(1);
        System.out.println("Description : " + docPeriodique.toString());
        System.out.println("Durée max de prêt : " + docPeriodique.dureeMaxPret() + " jours");

        System.out.println("\n ESSAI 3 : Parcours polymorphe de la liste ");
        for (Document doc : documents) {
            
            System.out.println(doc.getTitre() + " -> Durée max: " + doc.dureeMaxPret() + " jours");
            doc.emprunter();
            System.out.println("Statut après emprunt : " + (doc.isDisponible() ? "Libre" : "Emprunté"));
        }
    }
}
