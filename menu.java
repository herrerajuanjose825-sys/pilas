import java.util.Scanner;
import java.util.LinkedList;

public class menu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList<pagina> l = new LinkedList<>();
        metodos m = new metodos();

        int opt = 0;

        while (opt != 4) {
            System.out.println("\n--- MENU ---");
            System.out.println("1) Visitar nueva pagina");
            System.out.println("2) Retroceder ");
            System.out.println("3) Ver historial");
            System.out.println("4) Salir");

            opt = sc.nextInt();

            switch (opt) {
                case 1:
                    m.llenardatos(l, sc);
                    break;

                case 2:
                    m.eliminar(l);
                    break;

                case 3:
                    m.mostrar(l);
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    
                    break;

                default:
                    System.out.println("Opcion invalida.");
                    break;
            }
        }
    }
}
