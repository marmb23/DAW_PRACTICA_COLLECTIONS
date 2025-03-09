package vista;

public class Vista {
    public static void menuPrincipal() {
        System.out.println("BENVINGUT/DA AL SAPAMERCAT");
        System.out.println("--------------------------");
        System.out.println("-----------INICI----------");
        System.out.println("--------------------------");
        System.out.println("1. Gestió Magatzem i Compres.");
        System.out.println("2. Introduir producte.");
        System.out.println("3. Passar per caixa.");
        System.out.println("4. Mostrar carro de la compra.");
        System.out.println("0. Sortir.");
        System.out.println("Entra una opció: ");
    }

    public static void menuGestio() {
        System.out.println("1. Mostrar la caducitat dels productes.");
        System.out.println("2. Mostrar els tiquets de compra.");
        System.out.println("3. Mostrar la composició tèxtil dels productes.");
        System.out.println("0. Tornar enrere.");
    }

    public static void menuIntroduirProducte() {
        System.out.println("-----------------------------");
        System.out.println("-----------PRODUCTE----------");
        System.out.println("-----------------------------");
        System.out.println("1. Introduir producte d'alimentació.");
        System.out.println("2. Introduir producte d'electrònica.");
        System.out.println("3. Introduir producte tèxtil.");
        System.out.println("0. Tornar enrere.");
    }


}