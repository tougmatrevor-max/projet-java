Évolution du Système de Bibliothèque - Jalon 2 (Héritage & Polymorphisme)


1. Description du Projet
Cette version fait évoluer le système de la bibliothèque vers une vraie architecture Orientée Objet. Elle introduit la hiérarchie des documents ainsi qu'une gestion complète des règles d'emprunt associées aux adhérents.


2. Architecture & Choix de Conception

A. Héritage et Abstraction (Document, Livre, Periodique)
Classe mère Document : Déclarée abstract, elle regroupe l'ensemble des attributs et méthodes communs (numero, titre, auteurPrincipal, disponible, emprunteur). Elle ne peut pas être instanciée directement car un document générique n'a pas de réalité métier.
Classes filles Livre et Periodique :
Un Livre est un Document (avec un nombre de pages)  Durée max de prêt : 21 jours.
Un Periodique est un Document (avec un numéro de parution)  Durée max de prêt : 7 jours.
Polymorphisme : La méthode dureeMaxPret() est déclarée abstraite dans Document et redéfinie (@Override) dans chaque classe fille. Le catalogue traite une collection du type parent Document et déclenche le bon comportement à l'exécution sans utiliser instanceof.

B. Interface et Composition
Composition avec Adherent : Conforme au principe « Un adhérent n'est pas un document », nous conservons une relation de composition/association (Document possède une référence vers Adherent).
Interface Empruntable : La gestion du cycle de vie des emprunts (emprunter, retourner, isDisponible) est isolée dans l'interface Empruntable, implémentée par Document.


3. Scénarios de Test et Validations (Main.java)
Les tests implémentés dans la classe Main démontrent :
L'emprunt nominal : Association réussie d'un document disponible à un adhérent.
La gestion du double emprunt : Une seconde tentative d'emprunt sur un document déjà emprunté est bloquée avec l'affichage d'un message d'erreur clair.
Le retour de document : Remise en disponibilité du document et dissociation de l'adhérent.
Le parcours polymorphe : Iteration sur une liste Document avec affichage des durées spécifiques sans aucun test de type.


4. Organisation du Dépôt & Répartition des Rôles
Le dossier src/ contient uniquement la version nettoyée et active du projet. Les versions antérieures ont été archivées dans le dossier /archive.
Membre Rôle principal Contributions GitHub
KABORE Christian Lionel Nettoyage & Structure Nettoyage du dossier src/, création du dossier d'archivage /archive et réorganisation de la structure.
KABRE Marius Edson Modélisation & Interfaces Création de l'interface Empruntable, de la classe Adherent et intégration dans la classe Document.
TOUGMA Trevor Scénarios & Documentation Implémentation des scénarios dans Main (double emprunt, parcours polymorphe), rédaction du README.md.
