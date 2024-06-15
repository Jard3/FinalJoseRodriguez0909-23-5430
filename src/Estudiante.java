import java.util.Scanner;

public class Estudiante {
    private final String nombre;
    private final int calificacion;
    private Object Get;

java.util.Scanner
        Scanner = new Scanner(System.in);


    public Estudiante(int calificación, String nombre, int calificacion) {
            this.nombre = nombre;
        this.calificacion = calificacion;
    }
        public void getNombre (){
        System.out.println("Ingrese el nombre del estudiante");
        String nombre = Scanner.next();

        }
        public void setNombre() {
        System.out.println("El nombre del estudiante es: "+nombre);
        }

    public void getCalificacion(){
        System.out.println("Ingrese la calificación del estudiante");
        int calificacion = Scanner.nextInt();
    }
    public void setCalificacion(){
        System.out.println("La calificacion del estudiante es: "+calificacion);}
    public Estudiante (String nombre, int calificacion){
        this.nombre = nombre;
        this.calificacion = calificacion;
    }
}
