package herencia;

public class Herencia {
    
    public static void main(String[] args) {
         
        Empleado emp1 = new Empleado();

         emp1.setNombre("rodrigo");
         System.out.println("nombre de empleado: " + emp1.getNombre());

         emp1.setNum_legajo(01);
         System.out.println("numero de legajo: " + emp1.getNum_legajo());
       


        Consultor consul1 = new Consultor();
        
        consul1.getNombre_consultor();
        consul1.getNumnero_consultor();



        emp1.mostarNombre();

        Persona per1 = new Persona();

        per1.setNombre("gigio");

        per1.mostarNombre();

 

    }
}
