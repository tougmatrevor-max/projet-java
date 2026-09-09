//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));qsxffggh

    for (int i = 1; i <= 5; i++) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        IO.println("i = " + i);
    }
}
public class Main {
    public static void main(String[] args) {
        // création des livres on a crere 4 livres
        Livre livre1 = new Livre();
        livre1.titre = "Le Bout de boit de Dieu";
        livre1.auteur = "Sembene Ousmane";
        livre1.disponible = true;
        Livre livre2 = new Livre();
        livre2.titre = "L'enfant noir";
        livre2.auteur = "Camara Laye";
        livre2.disponible = false;
        Livre livre3 = new Livre();
        livre3.titre = "L'Étranger";
        livre3.auteur = "Albert Camus";
        livre3.disponible = true;
        Livre livre4 = new Livre();
        livre4.titre = "Candide";
        livre4.auteur = "Voltaire";
        livre4.disponible = false;
        // ici nous avons l'affichage des titre plus l'état de disponibilité des livres
        System.out.println(livre1.titre + " - " + livre1.disponible);
        System.out.println(livre2.titre + " - " + livre2.disponible);
        System.out.println(livre3.titre + " - " + livre3.disponible);
        System.out.println(livre4.titre + " - " + livre4.disponible);
    }
}
