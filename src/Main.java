public class Main {
    public static void main(String[] args) {
        
        Bibliotheque biblio = new Bibliotheque();

     
        Document doc1 = new Document(101, "Germinal", "Émile Zola");
        Document doc2 = new Document(102, "Les bouts de bois de Dieu", "Sembène Ousmane");

        biblio.ajouterDocument(doc1);
        biblio.ajouterDocument(doc2);

       
        Adherent adh1 = new Adherent(1, "Trevor TOUGMA", "trevor.tougma@gmail.com");
        Adherent adh2 = new Adherent(2, "Lionel KABORE", "lionel.kabore@gmail.com");

        biblio.ajouterAdherent(adh1);
        biblio.ajouterAdherent(adh2);

      
        biblio.afficherCatalogue();

       
        System.out.println("\n--- OPÉRATIONS ---");
        biblio.emprunterDocument(101, 1); 
        biblio.emprunterDocument(101, 2); 
        
        biblio.afficherCatalogue();

      
        biblio.retournerDocument(101); 

        biblio.afficherCatalogue();
    }
}
