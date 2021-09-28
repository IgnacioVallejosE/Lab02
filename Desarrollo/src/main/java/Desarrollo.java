import java.util.Random;
import java.util.Scanner;

public class Desarrollo {


   public static void mostrarMenu(){
        System.out.println();
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
        int[]x=generarArreglo();
        int a= -1;
        do{
            a=validar(3);
            switch (a){
                case 1:
                    System.out.println("Los pares adyacentes son:");
                    mostrarParesAdyacentes(x);
                    mostrarMenu();

                    break;
                case 2:
                    System.out.println("El mayor producto de adyacente es:");
                    mayorProductoParesAdyacentes(x);
                    mostrarMenu();
                    break;
                case 3:
                    System.out.println("adiós");
                    break;
                default:
                    System.out.println("elige una opción válida");
                    break;
            }

        }while(a!=3);
    }

    public static int[] generarArreglo(){
        int[] arr;
        Random rnum= new Random();
        int n= rnum.nextInt(8)+2;
        arr=new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i]=rnum.nextInt(2000)-1000;
        }
        return arr;
    }

    public static void mostrarParesAdyacentes(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            System.out.println("(" + arr[i-1] +","+arr[i]+")");

        }
    }


    public static int mayorProductoParesAdyacentes(int[] arr){
        int calcularProducto;
        int temp=0;
        int productoMayor=0;
        for(int i = 1; i < arr.length; i++) {
            calcularProducto=(arr[i-1])*(arr[i]);
            temp = calcularProducto;
            if(temp>productoMayor){
                productoMayor=temp;
            }
        }
        System.out.println("producto mayor: "+productoMayor);
        return productoMayor;
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

