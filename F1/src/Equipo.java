public class Equipo {

    private String nombre;
    private Monoplaza [] monoplazas;

    //Contructor por defecto de la clase
    public Equipo() {
        nombre=" ";
        monoplazas = new Monoplaza[2];
    }

    //Contructor parametrizado de la clase 
    public Equipo(String nombre, Monoplaza[] monoplazas) {
        this.nombre = nombre;
        this.monoplazas = monoplazas;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monoplaza[] getMonoplazas() {
        return monoplazas;
    }

    public void setMonoplazas(Monoplaza[] monoplazas) {
        this.monoplazas = monoplazas;
    }

    //Metodo para enseñar el objeto de la clase equipo

    public void mostrarEquipo(){
        System.out.println(nombre);
        for(int i=0 ; i<monoplazas.length ; i++){
            System.out.println("    " + monoplazas[i].toString());
        }
    }
}
