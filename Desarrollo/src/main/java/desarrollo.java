import java.util.Random;
import java.util.Scanner;

public class desarrollo {

    public static void mostrarMenu(){
        System.out.println("indique que desea hacer");
        System.out.println("*****************************************************");
        System.out.println("*                                                   *");
        System.out.println("* [1] Mostrar pares adyacentes                      *");
        System.out.println("* [2] Mostrar el mayor valor de producto            *");
        System.out.println("* [3] Salir                                         *");
        System.out.println("*                                                   *");
        System.out.println("*****************************************************");
    }

    public static void menuAccion(){
        int a= -1;
        do{
            a=validar(3);
            switch (a){
                case 1:
                    System.out.println("los sismos recientes son: ");

                    break;
                case 2:
                    System.out.println("El sismo de mayor magnitud es:");

                    break;
                case 3:
                    System.out.println("adiós");
                    break;
            }
            if(a!= 3){
                System.out.println("¿desea hacer otra cosa? presione 3 para salir");
            }
        }while(a!=3);
    }

    public static void generarArreglo(int arr[]){
        Random rnum= new Random();
        int n= rnum.nextInt(8)+2;
        arr=new int[n];
        for (int i = 0; i < arr.length; i++){
                arr[i]=rnum.nextInt(2000)-1000;
                System.out.print("[" +arr[i]+ "]");
                System.out.println(" ");
        }
    }

    public static void mostrarParesAdyacentes(int[] arreglo) {
        System.out.println("Los pares adyacentes son: ");
        for (int i = 1; i < arreglo.length; i++) {
            System.out.println("(" + arreglo[i-1] +","+arreglo[i]+")");
        }
    }

    public static void mayorProductoParesAdyacentes(int [] arr){
        int numeroMayor= 1;
        for (int i = 0; i < 10; i++) {
                if (arr[i] > numeroMayor){
                    numeroMayor= arr[i];
                }
        }
        System.out.println("["+numeroMayor+"]");
    }

    public static int validar(int x) {
        int n = -1;
        do {
            //Scanner ponerlo dentro del DO, y dentro de una funcion
            Scanner teclado = new Scanner(System.in);
            //System.out.println("ingrese otro numero");
            try {
                n = teclado.nextInt();
            } catch (Exception e) {
                System.out.println("Error");
            }
            if (n < 0 || n == 0|| n > x) {
                System.out.println("ingrese un numero valido");
            }
        } while (n < 0|| n==0 ||n > x);
        return n;
    }
}

