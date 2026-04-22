import java.util.Scanner;
import java.util.LinkedList;
import java.time.LocalTime;

public class metodos {


    public LinkedList<pagina> llenardatos (LinkedList<pagina> l ,  Scanner sc){
        boolean pedir =true;
        while ((pedir)) {
            pagina o = new pagina();
            System.out.println("ingrese el URL de la pagina web");
            o.setUrl(sc.next());
            System.out.println("ingrese el Titulo de la pagina ");
            o.setTitulo(sc.next());
            o.setHora(LocalTime.now());
            l.addFirst(o);
            System.out.println("se agrego correctamente esta pagina");
            System.out.println("------------------------------------------------");
            System.out.println("desea continuar ingresando datos 1) si  2) no ");
            int opt = sc.nextInt();
            if (opt==2){
                pedir=false;
            }
        }
        return l;
    }


    public void mostrar(LinkedList<pagina>l){

    if (l.isEmpty()) {
            System.out.println("No hay historial");
            return;
        }

        System.out.println("\n--- HISTORIAL ---");

        for (pagina o : l) {
            System.out.println("URL: " + o.getUrl());
            System.out.println("Titulo: " + o.getTitulo());
            System.out.println("Hora: " + o.getHora());
            System.out.println("--------------------------------------");
            System.out.println();
        }
    }

    public LinkedList<pagina> eliminar (LinkedList<pagina>l){
        if(!l.isEmpty()){
            l.removeFirst();

            if(!l.isEmpty()){
                System.out.println("estas en la pagina web "+ l.getFirst().getTitulo());
            }
        }

        else {
            System.out.println("No hay painas guardadas");
        }

        return l;
    }
}
