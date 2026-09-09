import java.util.ArrayList; import java.util.List;
public class Bibliotheque { private List<Document> listeDocuments; private List<Adherent> listeAdherents;
public Bibliotheque() {
    this.listeDocuments = new ArrayList<>();
    this.listeAdherents = new ArrayList<>();
}

//Enregistrement des documents et adhérents

public void ajouterDocument(Document doc) {
    listeDocuments.add(doc);
    System.out.println("Document ajouté au catalogue : " + doc.getTitre());
}

public void ajouterAdherent(Adherent adherent) {
    listeAdherents.add(adherent);
    System.out.println("Adhérent enregistré : " + adherent.getNom());
}

// Recherche

public Document chercherDocument(int numero) {
    for (Document d : listeDocuments) {
        if (d.getNumero() == numero) {
            return d;
        }
    }
    return null;
}

public Adherent chercherAdherent(int identifiant) {
    for (Adherent a : listeAdherents) {
        if (a.getIdentifiant() == identifiant) {
            return a;
        }
    }
    return null;
}

// Gestion du Prêt et du Retour

public boolean emprunterDocument(int numDocument, int idAdherent) {
    Document doc = chercherDocument(numDocument);
    Adherent adh = chercherAdherent(idAdherent);

    if (doc == null) {
        System.out.println("Erreur : Document introuvable.");
        return false;
    }
    if (adh == null) {
        System.out.println("Erreur : Adhérent non enregistré.");
        return false;
    }

    if (doc.isDisponible()) {
        doc.setDisponibilite(false);
        System.out.println("Succès : " + adh.getNom() + " a emprunté le document \"" + doc.getTitre() + "\".");
        return true;
    } else {
        System.out.println("Échec : Le document \"" + doc.getTitre() + "\" est déjà emprunté.");
        return false;
    }
}

public boolean retournerDocument(int numDocument) {
    Document doc = chercherDocument(numDocument);

    if (doc == null) {
        System.out.println("Erreur : Document introuvable.");
        return false;
    }

    if (!doc.isDisponible()) {
        doc.setDisponibilite(true);
        System.out.println("Succès : Le document \"" + doc.getTitre() + "\" a été retourné à la bibliothèque.");
        return true;
    } else {
        System.out.println("Information : Le document \"" + doc.getTitre() + "\" n'était pas emprunté.");
        return false;
    }
}

// Affichage

public void afficherCatalogue() {
    System.out.println("\n--- CATALOGUE DE LA BIBLIOTHÈQUE ---");
    for (Document d : listeDocuments) {
        d.afficherInformations();
    }
}

public void afficherAdherents() {
    System.out.println("\n--- LISTE DES ADHÉRENTS ---");
    for (Adherent a : listeAdherents) {
        a.afficherInformations();
    }
}
}
