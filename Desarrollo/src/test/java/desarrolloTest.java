import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class desarrolloTest {

    @Test
    void generarArreglo(){


    }

    @Test
    void mayorProductoParesAdyacentes(){

        //Prueba 1
        int[] uno = {1};
        assertEquals(Desarrollo.mayorProductoParesAdyacentes(uno),0);
        //Prueba 4
        int[] prueba = {3, 6, -2, -5, 7, 3};
        assertEquals(Desarrollo.mayorProductoParesAdyacentes(prueba),21);
        //Prueba 5
        int[] arrnegativo = {-1,-2};
        assertEquals(Desarrollo.mayorProductoParesAdyacentes(arrnegativo),2);
        //Prueba 6
        int[] arr = {1, 0, 1, 0, 1000};
        assertEquals(Desarrollo.mayorProductoParesAdyacentes(arr),0);

    }

}