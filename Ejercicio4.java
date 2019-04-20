import java.util.Scanner;


public static void main(String[] args) {
		Scanner palabra=new Scanner(System.in);
		System.out.println("Ingrese el tamaño del pentagono a dibujar: ");
		System.out.println("Opción 1-Pequeño           Opción 2-Mediano            Opción3-Grande");
		int menu = palabra.nextInt();
		int bandera=menu+2;
		String secuencia;
		for(int i=0;i<bandera;i++){
			secuencia="";
			for(int j=0;j<(bandera-i-1);j++)
		        secuencia=secuencia+" ";
		    for(int j=0;j<(2*i)+1;j++)
		        secuencia = secuencia + "*";
		    System.out.println(secuencia);
		}
		secuencia=" ";
		for(int j=0;j<(2*(bandera-1))-1;j++){
		    secuencia = secuencia + "*";
		}
		System.out.println(secuencia);
	}		
}
