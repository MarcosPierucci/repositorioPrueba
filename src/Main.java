
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //PUNTO 1
//        Almacenamiento<Integer> almacenamiento = new Almacenamiento();
//        Almacenamiento<String> almacenamiento1 = new Almacenamiento();
//        Scanner scanner = new Scanner(System.in);
        System.out.println("Tuco salamanca was right");
//
//
//
//        int i=1;
//        Integer dato, datoBorrar;
//        String dato2, datoBuscar2, datoBorrar2;
//        int datoBuscar;
//        boolean datoExiste;
//
//        while (i==1)
//        {
//            System.out.println("Ingrese el dato a cargar (String): ");
//            dato2 = scanner.nextLine();
//            almacenamiento1.agregar(dato2);
//
//            System.out.println("Ingrese el dato a cargar: ");
//            dato = scanner.nextInt();
//            almacenamiento.agregar(dato);
//
//            System.out.println("Desea cargar mas datos? (1 si, 0 no)");
//            i = scanner.nextInt();
//            scanner.nextLine();
//        }
//
//        System.out.println("Ingrese el dato a borrar (String)");
//        datoBorrar2 = scanner.nextLine();
//        almacenamiento1.eliminar(datoBorrar2);
//
//        System.out.println("Ingrese el dato a borrar");
//        datoBorrar = scanner.nextInt();
//        almacenamiento.eliminar(datoBorrar);
//
//        System.out.println("Ingrese el dato que desea buscar");
//        datoBuscar = scanner.nextInt();
//        scanner.nextLine();
//        datoExiste = almacenamiento.buscarObjeto(datoBuscar);
//
//        if (datoExiste==true)
//        {
//            System.out.println("El objeto "+datoBuscar+" ya existe.");
//        } else
//        {
//            System.out.println("El objeto "+datoBuscar+" no existe.");
//        }
//
//
//        System.out.println("Ingrese el dato que desea buscar(String)");
//        datoBuscar2 = scanner.nextLine();
//        datoExiste = almacenamiento1.buscarObjeto(datoBuscar2);
//
//        if (datoExiste==true)
//        {
//            System.out.println("El objeto "+datoBuscar2+" ya existe.");
//        } else
//        {
//            System.out.println("El objeto "+datoBuscar2+" no existe.");
//        }



        //PUNTO 2
        Pila<Integer> pila = new Pila<>();
        Scanner scanner = new Scanner(System.in);
        int i=1;
        int datoCargar;
        boolean estaVacia;


        estaVacia = pila.estaVacia();
        System.out.println("La pila esta vacia? " + estaVacia);

        while (i==1)
        {
            System.out.println("Ingrese el numero a cargar a la pila: ");
            datoCargar = scanner.nextInt();
            pila.agregar(datoCargar);

            System.out.println("Desea cargar mas datos? (1 si, 0 no): ");
            i = scanner.nextInt();
            scanner.nextLine();
        }

        estaVacia = pila.estaVacia();
        System.out.println("La pila esta vacia? " + estaVacia);

        pila.mostrar();
        pila.eliminar();
        pila.mostrar();

        estaVacia = pila.estaVacia();
        System.out.println("La pila esta vacia? " + estaVacia);

        pila.tamanio();
        pila.mostrar();





    }
}
