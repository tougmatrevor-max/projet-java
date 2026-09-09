public class Main {
    public static void main(String[] args) {
        
        Bibliotheque biblio = new Bibliotheque();

     
        Document doc1 = new Document(101, "Le Petit Prince", "Antoine de Saint-Exupéry");
        Document doc2 = new Document(102, "L'Étranger", "Albert Camus");

        biblio.ajouterDocument(doc1);
        biblio.ajouterDocument(doc2);

       
        Adherent adh1 = new Adherent(1, "Jean Dupont", "jean.dupont@email.com");
        Adherent adh2 = new Adherent(2, "Alice Martin", "alice.martin@email.com");

        biblio.ajouterAdherent(adh1);
        biblio.ajouterAdherent(adh2);

      
        biblio.afficherCatalogue();

       
        System.out.println("\n--- OPÉRATIONS ---");
        biblio.emprunterDocument(101, 1); // Jean emprunte Le Petit Prince
        biblio.emprunterDocument(101, 2); // Alice tente d'emprunter le même document (doit échouer)

        
        biblio.afficherCatalogue();

      
        biblio.retournerDocument(101); // Retour du livre

        biblio.afficherCatalogue();
    }
}
