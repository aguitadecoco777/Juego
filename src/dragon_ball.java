import java.util.Scanner;

public class dragon_ball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear personajes
        SuperHero heroe1 = new SuperHero("Goku", 10, 15, 60);
        SuperHero heroe2 = new SuperHero("Vegeta", 8, 10, 50);
        SuperHero heroe3 = new SuperHero("Pikoro", 6, 5, 40);

        Villano villano1 = new Villano("Jirem", 10, 18, 70);
        Villano villano2 = new Villano("zamasu", 7, 5, 50);
        Villano villano3 = new Villano("Freezer", 5, 7, 40);
        System.out.println("INICIA EL JUEGO");
        System.out.println("---------------------------------------------");
        System.out.println("Para comenzar escoje tus personajes favoritos tanto de heroes como de villanos");
        System.out.println("----------------------------------------------");
        System.out.println("Selecciona tu heroe");
        System.out.println("-----------------------------------");
        System.out.println("1      Goku");
        System.out.println("2      Vegeta");
        System.out.println("3      Pikoro");
        System.out.println("-----------------------------------");
        int heroeSeleccionado=scanner.nextInt();
        SuperHero heroe;
        switch(heroeSeleccionado){
            case 1:
            heroe=heroe1;
            break;
            case 2:
            heroe = heroe2;
            break;
            case 3:
            heroe = heroe3;
            break;
            default:
            heroe=heroe1;
            break;
        }
                // Seleccionar villano
        System.out.println("Seleccione un Villano:");
        System.out.println("1. Jirem");
        System.out.println("2. Zamasu");
        System.out.println("3. Freezer");
        int villanoSeleccionado = scanner.nextInt();
        
        Villano villano;
        switch (villanoSeleccionado) {
        case 1:
        villano = villano1;
        break;
        case 2:
        villano = villano2;
        break;
        case 3:
        villano = villano3;
        break;
        default:
        villano = villano1; // Default a Joker si la elección no es válida
        break;
        }
        System.out.println("Héroe seleccionado:");
        heroe.mostrarEstadisticas();
        System.out.println("Villano seleccionado:");
        villano.mostrarEstadisticas();
        // Bucle de juego
        String accion = "";
        while (!accion.equals("salir")) {
            System.out.println("------------------------------------------");
            System.out.println("Accion a realizar con el heroe ");
            System.out.println("1         atacar");
            System.out.println("2         defender");
            System.out.println("3         aumentar daño");
            System.out.println("4         recuperar vida");
            System.out.println("5         informacion general tanto del heroe como del villano");
            System.out.println("Accion a realizar villano");
            System.out.println("6          bufeo de vida del villano");
            System.out.println("7          atacar");
            System.out.println("--------------------------------------------");
            System.out.println("Ingrese la accion a realizar ");
            int nuevaAccion=scanner.nextInt();
            switch (nuevaAccion) {
                case 1:
                    heroe.atacar(villano);
                    break;
                case 2:
                    heroe.defender();
                    break;
                case 3:
                    heroe.aumentarPoderes();
                    break;
                case 4:
                    heroe.recuperarse();
                    break;
                case 5:
                    heroe.mostrarEstadisticas();
                    villano.mostrarEstadisticas();
                    break;
                case 6:
                    villano.buf();
                    break;
                case 7:
                villano.atacar(heroe);
            }
            if (villano.vida_hp<=0){
                System.out.println("haz derrotado al jefe ");
                accion="salir";
            }else if(heroe.vida_hp<=0){
                System.out.println("Te han derrotado bot");
                accion="salir";
            }
        }

        scanner.close();
        System.out.println("Juego terminado.");
    }
}
