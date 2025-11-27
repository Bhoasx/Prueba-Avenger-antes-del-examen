public class Avengers implements Comparable<Avengers>{
    private static int numerosAvenger;
    private int IdAvenger;
    private String nombre;
    private int NivelPoder;
    private String Mision;

    public Avengers (String nombre, int NivelPoder, String Mision) {
        this.IdAvenger = ++numerosAvenger;
        this.nombre = nombre;
        this.NivelPoder = NivelPoder;
        this.Mision = Mision;
    }

    public static int getNumerosAvenger() {
        return numerosAvenger;
    }

    public int getIdAvenger() {
        return IdAvenger;
    }
    public void setIdAvenger(int idAvenger) {
        IdAvenger = idAvenger;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivelPoder() {
        return NivelPoder;
    }
    public void setNivelPoder(int nivelPoder) {
        NivelPoder = nivelPoder;
    }

    public String getMision() {
        return Mision;
    }
    public void setMision(String mision) {
        Mision = mision;
    }

    @Override
    public String toString() {
        return "Avengers{" +
                "IdAvenger=" + IdAvenger +
                ", nombre='" + nombre + '\'' +
                ", NivelPoder=" + NivelPoder +
                ", Mision='" + Mision + '\'' +
                '}';
    }

    @Override
    public int compareTo(Avengers a){
        return Integer.compare(this.IdAvenger , a.IdAvenger);
    }
}
