public class X {

public static class persona {

    String nombre;
    String apellido;
    int edad;

    public persona(){                            //este es un constructor sin parametros.
      }

      public persona(int edad, String nombre, String apellido){   //este es un cosntructor con parametros.

        this.apellido = apellido;// sirve para asignar variables de la clase con las del constrcutor,con la palabra "this"
        this.edad = edad;
        this.nombre = nombre;
      }

      //getter and setter 
      public int getEdad() {
          return edad;
      }
      public void setEdad(int edad) {
          this.edad = edad;
      }

      public String getNombre() {
          return nombre;
      }
      public void setNombre(String nombre) {
          this.nombre = nombre;
      }

      public String getApellido() {
          return apellido;
      }
      public void setApellido(String apellido) {
          this.apellido = apellido;
      }


public void mostarNombre(){     // estos son metodos (acciones a realizar por un objeto)
    System.out.println("me llamo franklin");
}

public void saberAprobar(double calficacion){
    if (calficacion>=5){
        System.out.println("aprobaste");
        
    }else{
        System.out.println("desaprobado");
    }
}



    
}

    public static void main(String[] args) { 

    persona persona1 = new persona();

    persona persona2 = new persona(24, "franklin", "Ramirez");

     System.out.println("la edad de la persona2 es: " + persona2.getEdad()); //pedir valor por get
    System.out.println("la el nombre de la persona2 es: " + persona2.getNombre());
    System.out.println("el apellido de la persona2 es: " + persona2.getApellido());


    System.out.println("--------------------");

    persona1.setEdad(20);   // agregar valor con set
    persona1.setNombre("jhon");
    persona1.setApellido("ramirez");

    System.out.println("la edad de la persona1 es: " + persona1.getEdad());
    System.out.println("el nombre de la persona1 es: " + persona1.getNombre());
    System.out.println("el apellido de la persona1 es: " + persona1.getApellido());

    System.out.println("----------------");

    persona2.setEdad(25);   //cambio de valor
    persona2.setApellido("ramirez chacon");
    System.out.println("la edad de la persona2 es: " + persona2.getEdad());
    System.out.println("la el nombre de la persona2 es: " + persona2.getNombre());
    System.out.println("el apellido de la persona2 es: " + persona2.getApellido());

    }
    
}
