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
    public Avengers Busquedabinaria(int id) {
        Avengers r = null;
        int izq = 0;
        int der = this.lista.size() - 1;
        if (this.lista.isEmpty()) {
            return null;
        } else {
            while(izq <= der) {
                int medio = (izq + der) / 2;
                Avengers a = (Avengers)this.lista.get(medio);
                if (a.getIdAvenger() == id) {
                    r = a;
                }

                if (a.getIdAvenger() < id) {
                    izq = medio + 1;
                } else {
                    der = medio - 1;
                }
            }

            if (r == null) {
                return null;
            } else {
                return r;
            }
        }
    }

    //otro triste intento de busqueda
    public Avengers BusquedaSecuencial(int idAvenger){
        Avengers var = null;

        for (Avengers a : this.lista){
            if (a.getIdAvenger() == idAvenger){
                var = a;
            }
        }
        return var;
    }

    /*public Avengers BusquedaSecuencial(int idAvenger) {
        Avengers r = null;

        for(Avengers a : this.lista) {
            if (a.getIdAvenger() == idAvenger) {
                r = a;
            }
        }

        return r;
    }*/
}
