import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

public class Pila <T>{

    ArrayList<T> pila;


    //Constructor, Getter and setter
    public Pila(){
        this.pila = new ArrayList<>();
    }

    public ArrayList<T> getPila() {
        return pila;
    }

    public void setPila(ArrayList<T> pila) {
        this.pila = pila;
    }

    //Metodos
    public void agregar(T obj){
        pila.add(obj);
    }

    public void eliminar(){
        this.pila.remove(pila.size()-1);
    }

    public int tamanio(){
        return pila.size();
    }

    public boolean estaVacia(){
        return pila.isEmpty();
    }

    public void mostrar(){
        System.out.println("Inicio-------------------------Final");

        for(T p : this.pila){
            System.out.println(p);
        }
    }

}
