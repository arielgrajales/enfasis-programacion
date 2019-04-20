import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
Scanner teclado=new Scanner(System.in);
        System.out.print("Ingrese el tamaño del primer vector: ");
        int tamano=teclado.nextInt();
        System.out.print("Ingrese el tamaño del segundo vector: ");
        int tamano1=teclado.nextInt();

        int vector []= new int[tamano];
        int vector1 []= new int[tamano1];
 
        for (int i=0;i<vector.length;i++){

            int valor= (int)(Math.random()*(10+1));
            vector[i] = valor;
            System.out.println("El primer vector es: "+vector[i]);
        }
        for (int i=0;i<vector1.length;i++){

            int valor1= (int) (Math.random()*(10+1));
            vector1[i] = valor1;
            System.out.println("El segundo vector es: "+vector1[i]); 
         }


        
        int a=vector[0]+vector1[0];
        int b=vector[1]+vector1[1];
        int c=vector[2]+vector1[2];
        int d=vector[3]+vector1[3];
        int e=vector[4]+vector1[4];
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
}

}
