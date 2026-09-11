L'héritage est pertinent ici car il respecte la relation « est un » :
Un Livre est un Document.
Un Periodique est un Document.
Ils partagent tous des caractéristiques communes (numero, titre, auteurPrincipal, disponible, emprunter(), retourner()).

Le comportement qui varie selon l'objet réel est la méthode dureeMaxPret() :
Un Livre s'emprunte pour 21 jours.
Un Periodique s'emprunte pour 7 jours.
Grâce au polymorphisme, le programme peut traiter une liste de Document uniformément tout en exécutant automatiquement le bon calcul de durée sans tester le type de l'objet avec instanceof.
