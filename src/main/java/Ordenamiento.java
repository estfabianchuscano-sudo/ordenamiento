
import java.util.*;

public class Ordenamiento {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);  
    Random rand = new Random();
     
        System.out.println("ingrese el tamaño del arreglo");
        int n;
        n = sc.nextInt();
        
        int v[] = new int[n];       
        
   
         for (int i = 0; i < n; i++) {
            v[i] = rand.nextInt(501) - 200; //dependera del rango que tu eligas
        }

         
    System.out.println("seleccione el metodo de ordenamiento:");
    System.out.println("1. burbuja");
    System.out.println("2. insercion");

    int opcion = sc.nextInt();
    
    switch(opcion){
    case 1:
        burbuja(v);
        break;
    case 2:
        insercion(v);
        break;
    default:
        System.out.println("Opcion invalida");
}
       
        System.out.println(java.util.Arrays.toString(v));
    
        
    }
    
    
    private static void burbuja(int v[]) {
        for (int i = 0; i < v.length -1; i++) {
            for (int j = i+1; j < v.length ; j++) {
                if (v[i] > v[j]) {
                    int w = v[j];
                    v[j] = v[i];
                    v[i] = w;
                }
                
  
                
            }
        }
    }
}

