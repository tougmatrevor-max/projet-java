public abstract class Document{
  private int numero;
  private String titre;
  private String auteurPrincipal;
  private boolean disponible;
  public Document(int numero, String titre, String auteurPrincipal) {
     if (numero <= 0) {
         throw new IllegalArgumentException("Le numéro doit être strictement positif.");
     }
     if (titre == null || titre.trim().isEmpty()) {
         throw new IllegalArgumentException("Le titre ne doit pas être vide.");
     }
     if (auteurPrincipal == null || auteurPrincipal.trim().isEmpty()) {
         throw new IllegalArgumentException("L'auteur principal ne doit pas être vide.");
     }
     this.numero = numero;
     this.titre = titre;
     this.auteurPrincipal = auteurPrincipal;
     this.disponible = true; // Un document est disponible à sa création
  }

  public int getNumero() {
     return numero;
  }

  public String getTitre() {
     return titre;
  }

  public String getAuteurPrincipal() {
     return auteurPrincipal;
  }

  public boolean isDisponible() {
     return disponible;
  }

  public void emprunter() {
     this.disponible = false;
  }

  public void retourner() {
     this.disponible = true;
  }

  public abstract int dureeMaxPret();

  @Override
  public String toString() {
     return "N°" + numero + " - " + titre + " (" + auteurPrincipal + ") [Disponible : " + disponible + "]";
  }
}
