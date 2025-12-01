package herencia;

public class Herencia {
    
    public static void main(String[] args) {
         
        Empleado emp1 = new Empleado();

        emp1.getNum_legajo();
        emp1.getNombre();

        Consultor consul1 = new Consultor();
        
        consul1.getNombre_consultor();
        consul1.getNumnero_consultor();


    }
}
