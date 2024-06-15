import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
System.out.println("Ingrese 1 si desea ejecutar el primer ejercicio");
System.out.println("Ingrese 2 si desea ejecutar el segundo ejercicio");
int opcion = Scanner.nextInt();
if (opcion == 1) {
    System.out.println("Ingrese 3 numero para saber cual es el mayor");
    int numero1 = Scanner.nextInt();
    System.out.println("Ingrese el segundo numero");
    int numero2 = Scanner.nextInt();
    System.out.println("Ingrese el tercer numero");
    int numero3 = Scanner.nextInt();
    ExamenFinalVarianteB Mayor = new ExamenFinalVarianteB("Numero mayor");
    int mayor = Mayor.Mayor (numero1,numero2,numero3);
System.out.println(mayor);

    System.out.println("Ingrese un numero para obtener su tabla de multiplicar");
    int multi = Scanner.nextInt();
    ExamenFinalVarianteB tabla = new ExamenFinalVarianteB("Numero multiplicar");
    int multi2 = tabla.multiplicar(multi);
    System.out.println(multi2);

    System.out.println("Ingrese dos numeros");
    int numer1 = Scanner.nextInt();
    System.out.println("Ingrese el segundo numero");
    int numer2 = Scanner.nextInt();
    System.out.println("Seleccione el operador 1:+ 2:- 3:* 4:/");
    int operador = Scanner.nextInt();
    ExamenFinalVarianteB operadores = new ExamenFinalVarianteB("usando operadores");
    int resultado = operadores.operaciones(numer1,numer2,operador);
    System.out.println(resultado);

    System.out.println("Ingrese un numero para determinar si es primo o no");
    int num_primo = Scanner.nextInt();
    ExamenFinalVarianteB primo = new ExamenFinalVarianteB("Numero primo o no");
    int valor = primo.primo(num_primo);

}
else if (opcion == 2) {

}
else {System.out.println("Ingrese una opción válida");}
        }
    }
