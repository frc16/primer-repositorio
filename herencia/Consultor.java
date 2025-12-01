package herencia;

public class Consultor extends Persona {
    
    String nombre_consultor;
    int numnero_consultor;

    public Consultor(){

    }

    public Consultor(String nombre_consultor, int numnero_consultor, int id,
         String nombre, String apellido, int edad, String domicilio, String telefono){

            super(id, nombre, apellido, edad, domicilio, telefono);
            this.nombre_consultor = nombre_consultor;
            this.numnero_consultor = numnero_consultor;
    }

    public String getNombre_consultor() {
        return nombre_consultor;
    }
    public void setNombre_consultor(String nombre_consultor) {
        this.nombre_consultor = nombre_consultor;
    }

    public int getNumnero_consultor() {
        return numnero_consultor;
    }
    public void setNumnero_consultor(int numnero_consultor) {
        this.numnero_consultor = numnero_consultor;
    }

    
}
