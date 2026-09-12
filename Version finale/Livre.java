public class Livre extends Document{
  private int nombrePages;

public Livre(int numero, String titre, String auteurPrincipal,int nombrePages){
  super(numero,titre,auteurPrincipal);
  if (nombrePages<=0)throw new IllegalArgumentException("Nombres de pages invalide.");
  this.nombrePages=nombrePages;
}
  public int getNombrePages(){return nombrePages;}
  @Override
  public int dureeMaxPret(){
    return 21;
      }
  @Override
  public String toString(){
    return super.toString()+" Livre( "+ nombrePages +" pages) ";
  }
}
