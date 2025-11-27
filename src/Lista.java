import java.util.*;

public class Lista /*extends Exception*/ {
    private List<Avengers> lista;

    //constructor
    public Lista (){
        this.lista = new ArrayList<>();
    }

    public List<Avengers> getLista() {
        return lista;
    }

    //metodo para agregar avengers
    public void addAvenger(String nombre, int NivelPoder, String Mision){
        lista.add(new Avengers(nombre, NivelPoder, Mision));
    }

    //metodo para mostrar avengers
    public String mostrarAvengers() {
        StringBuilder sb = new StringBuilder();
        for (Avengers a : lista) {
            sb.append(a.toString());
        }
        return sb.toString();
    }

    //mi triste intento de busqueda binaria
    public Avengers Busquedabinaria (int id){
        Avengers r = null;
        int izq = 0;
        int der = lista.size() -1;

        while (izq <= der){
            int medio = (izq + der) / 2;
            Avengers a = lista.get(medio);
            if (a.getIdAvenger() == id){
                r = a;
            } else if (a.getIdAvenger() < id){
                izq = medio + 1;
            } else {
                der = medio - 1;
            }
        }
        return r;
    }

    //otro triste intento de busqueda
    public Avengers BusquedaSecuencial(int idAvenger){
        List<Avengers> r = new ArrayList<>();
        for (Avengers a : lista){
            if (a.getIdAvenger() == lista.size()){
                r.add(a);
            }
        }
        return (Avengers) r;
    }
}
