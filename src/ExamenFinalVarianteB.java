import java.util.Scanner;

public class ExamenFinalVarianteB {

        private final String nombre;

        public ExamenFinalVarianteB(String nombre) {
            this.nombre = nombre;
        }


        public int Mayor ( int num1, int num2, int num3){
            if (num1 > num2 && num1 > num3) {
                System.out.println(num1 + " Es el numero mayor");
            } else if (num2 > num1 && num2 > num3) {
                System.out.println(num2 + " Es el numero mayor");
            } else {
                System.out.println(num3 + " Es el numero mayor");
            }
            return 0;
        }
        public int multiplicar ( int num1){
            int i =1;
            int num;
            while(i<=10){

                num = num1*i;
                System.out.println(num);
                i+=1;
            }
            return 0;
        }
        public int operaciones ( int num1, int num2, int num3){
            if (num3 == 1){int num4 = num1+num2;
            System.out.println(num4);}
            else if (num3 == 2){int num4 = num1-num2;
                System.out.println(num4);}
                else if (num3 == 3){int num4 = num1*num2;
                System.out.println(num4);}
                else if (num3 == 4){double num4 = num1/num2;
                System.out.println(num4);}
            return 0;
            }

            public int primo ( int num1){
            if (num1 % 2 == 0 || num1 % 3 == 0 || num1 % 5 == 0 || num1 % 7 == 0 | num1 % 11 == 0){System.out.println("El numero no es pirmo");}
            else System.out.println("El numero es primo");
            return 0;
            }
        }



