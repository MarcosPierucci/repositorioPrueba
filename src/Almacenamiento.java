import java.util.ArrayList;

public class Almacenamiento<T>{
        ArrayList<T> lista;


        //Constructor, Getters and Setters
    public Almacenamiento() {
        this.lista = new ArrayList<>();
    }

    public ArrayList<T> getLista() {
        return lista;
    }

    public void setLista(ArrayList<T> lista) {
        this.lista = lista;
    }

    //Metodos
    public void agregar(T obj)
    {
        lista.add(obj);
    }

    public void eliminar(T obj)
    {
        lista.remove(obj);
    }

    public boolean buscarObjeto(T obj)
    {
        boolean encontrado = false;

        for (T obj2 : lista)
        {
            if (obj2 instanceof Integer)
            {
                if(obj == obj2)//Ver tambien si conviene el equals
                {
                    encontrado = true;
                    break;
                }
            } else if (obj2 instanceof String)
            {
                if (obj.equals(obj2))
                {
                    encontrado = true;
                    break;
                }
            }

        }
        return encontrado;
    }

}


