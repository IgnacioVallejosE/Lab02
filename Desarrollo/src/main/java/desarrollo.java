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

    public static void menuAccion(double[][] arreglo){
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

    public static void llenarArreglo(double arr[]){
        for (int i = 0; i < 10; i++){
                arr[i]= (Math.random()*9.9);
                System.out.print("[" +arr[i]+ "]");
                System.out.println(" ");

        }
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

