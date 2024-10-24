import java.util.Scanner;

public class XD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear personajes
        SuperHero heroe = new SuperHero("Goku", 10, 7, 100);
        Villano villano = new Villano("Zemasu", 8, 5, 80);

        // Bucle de juego
        String accion = "";
        while (!accion.equals("salir")) {
            System.out.println("Ingrese una acción (atacar, defender, aumentar, recuperarse, info, trampa, salir):");
            accion = scanner.nextLine();
            switch (accion) {
                case "atacar":
                    heroe.atacar(villano);
                    break;
                case "defender":
                    heroe.defender();
                    break;
                case "aumentar":
                    heroe.aumentarPoderes();
                    break;
                case "recuperarse":
                    heroe.recuperarse();
                    break;
                case "info":
                    heroe.mostrarEstadisticas();
                    villano.mostrarEstadisticas();
                    break;
                case "trampa":
                    villano.hacerTrampa();
                    break;
            }
            if (villano.vida_hp<=0){
                System.out.println("haz derrotado al jefe ");
                accion="salir";
            }
        }

        scanner.close();
        System.out.println("Juego terminado.");
    }
}
