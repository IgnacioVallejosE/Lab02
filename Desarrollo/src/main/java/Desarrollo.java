import java.util.Random;

public class Desarrollo {

    public static void generarArreglo(int [] arr){
        Random rnum= new Random();
        int n= rnum.nextInt(8)+2;
        arr=new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i]=rnum.nextInt(2000)-1000;
            System.out.print("[" +arr[i]+ "]");
            System.out.println(" ");
        }
    }
    public static int ContadorParesAdyacentes(int contador, int[] arr){
        for (int i = 1; i < arr.length; i++) {
            contador++;
        }
        return contador;
    }

    public static void mostrarParesAdyacentes(int[] arreglo) {
        System.out.println("Los pares adyacentes son: ");
        for (int i = 1; i < arreglo.length; i++) {
            System.out.println("(" + arreglo[i-1] +","+arreglo[i]+")");
        }
    }
    public static void mayorProductoParesAdyacentes(int[] arr){
        int numeroMayor= -1000000;
        int calcularProducto;
        int temp;
        for(int i = 1; i < arr.length; i++) {
            calcularProducto=(arr[i-1])*(arr[i]);
            temp= calcularProducto;
            if(temp>numeroMayor){
                numeroMayor=temp;
            }
        }
        System.out.println("["+numeroMayor+"]");
    }
}

