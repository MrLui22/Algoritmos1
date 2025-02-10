package TAREAS;

// Nombre: Lui Mireles Barrera
// Matrícula: 22201137
// Materia: Estructura de Datos

import java.util.ArrayList;
import java.util.Arrays;

public class recursividad {

   
    public static void moverArchivos(int n, String origen, String auxiliar, String destino) {
        if (n == 1) {
            System.out.println("Mover archivo 1 de " + origen + " a " + destino);
            return;
        }
        moverArchivos(n - 1, origen, destino, auxiliar);
        System.out.println("Mover archivo " + n + " de " + origen + " a " + destino);
        moverArchivos(n - 1, auxiliar, origen, destino);
    }

   
    public static int crecimientoInversion(int meses) {
        if (meses <= 1) {
            return meses;
        }
        return crecimientoInversion(meses - 1) + crecimientoInversion(meses - 2);
    }

  
    public static ArrayList<String> invertirLista(ArrayList<String> lista) {
        if (lista.isEmpty()) {
            return lista;
        }
        String primero = lista.remove(0);
        ArrayList<String> invertida = invertirLista(lista);
        invertida.add(primero);
        return invertida;
    }

    public static void main(String[] args) {
       
        System.out.println("Simulación de mover 3 archivos entre carpetas:");
        moverArchivos(3, "Carpeta_A", "Carpeta_B", "Carpeta_C");

        System.out.println("\nCrecimiento de inversión en 6 meses:");
        System.out.println(crecimientoInversion(6));
 
        ArrayList<String> listaCompras = new ArrayList<>(Arrays.asList("Leche", "Pan", "Huevos", "Queso"));
        System.out.println("\nLista de compras original: " + listaCompras);
        System.out.println("Lista de compras invertida: " + invertirLista(listaCompras));
    }
}
