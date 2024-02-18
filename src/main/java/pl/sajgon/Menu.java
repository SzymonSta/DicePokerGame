package pl.sajgon;

public class Menu {

    void welcomeMenuPrinter(){
        System.out.println("Welcome in DICE POKER GAME");
        System.out.println("Your first dices are:");
    }

    void reRollMenu() {
        System.out.println("""
    If You wont to kee the dice rol please press Enter;
    If You wont ro re-roll all of the dices please type "All";
    If You wont to re-roll some of the dice, please type the value of the dice to re-roll:""");
        System.out.print("--->");
    }
}
