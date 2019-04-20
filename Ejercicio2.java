import java.io.*;


public class Ejercicio2 {
	public static void main(String[] args) {
		String total="";
		File documento = new File("E:\\Documents\\texto2.txt");
		try {
			FileReader fr=new FileReader(documento);
			BufferedReader br = new BufferedReader(fr);
			String salto=br.readLine();
			String[]secuencia = salto.split(";");
			String[] secuencias=secuencia[0].split(",");
			
			salto=br.readLine();
			String[]secuencia1 = salto.split(";");
			String[] secuencia2=secuencia1[0].split(",");
			
			br.close();
			fr.close();
			
			int uno=secuencias.length;
			int[] dos=new int[uno];
			total="";
			for(int i=0;i<uno;i++){
				dos[i]=Integer.parseInt(secuencias[i])+Integer.parseInt(secuencia2[i]);
				total=total+dos[i]+" , ";
			}
			total=total.substring(0,total.length()-2);
			System.out.print(total);
		} catch (Exception primera) {
			primera.printStackTrace();
		}
		
		try{
			FileWriter fw = new FileWriter(documento,true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.newLine();			
			bw.newLine();
			bw.write(total);
			bw.close();
			fw.close();
			
		}catch(Exception segunda){
			segunda.printStackTrace();
		}
		
		
		
	}  
 
}
