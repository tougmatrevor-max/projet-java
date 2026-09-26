L'héritage est pertinent ici car il respecte la relation « est un » :
Un Livre est un Document.
Un Periodique est un Document.
Ils partagent tous des caractéristiques communes (numero, titre, auteurPrincipal, disponible, emprunter(), retourner()).

Le comportement qui varie selon l'objet réel est la méthode dureeMaxPret() :
Un Livre s'emprunte pour 21 jours.
Un Periodique s'emprunte pour 7 jours.
Grâce au polymorphisme, le programme peut traiter une liste de Document uniformément tout en exécutant automatiquement le bon calcul de durée sans tester le type de l'objet avec instanceof.

Décision et justification pour ⁠Document:⁠
⁠ Document⁠ doit être une classe abstraite pour deux raisons principales :

  1)Modélisation du domaine : Un « document » est un concept abstrait dans une bibliothèque. On n'instancie jamais un document générique, mais toujours un objet concret précis (⁠Livre⁠ ou ⁠Periodique⁠).
  
  2)Méthode incomplète : La méthode ⁠dureeMaxPret()⁠ n'a pas d'implémentation par défaut logique dans la classe mère, car chaque type de document impose sa propre règle. Elle doit donc être déclarée ⁠abstraite.

Répartition du travail et rôles

 Membre , Rôle principal , Tâches effectuées sur GitHub:

 KABORE Christian Lionel : Nettoyage et Structure , Restructuration du dépôt, archivage des anciennes versions dans `/archive`, nettoyage du dossier `src/`. 
 KABRE Marius Edson : Modélisation et Interfaces , Création de l'interface `Empruntable`, création de la classe `Adherent` et association dans `Document`. 
 TOUGMA Trevor : Scénarios de test et Doc , Écriture des tests dans `Main.java` (double emprunt, retours), validation du polymorphisme, rédaction du `README.md`.

  Règles métier implémentées
1. Unité d'emprunt : Un document ne peut être emprunté que s'il est disponible.
2. Gestion du double emprunt : Une tentative d'emprunt sur un document indisponible affiche un message d'erreur explicite sans faire planter l'application.
3. Association Adhérent : Chaque emprunt conserve la référence de l'adhérent emprunteur jusqu'au retour du document.
