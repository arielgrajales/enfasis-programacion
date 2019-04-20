import java.io.*;

public class Ejercicio3 {
	public static void main(String[] args) {
		String total = "";
		File documento = new File("E:\\Documents\\archivoejercicio3.csv");
		try{
			FileReader fr = new FileReader(documento);
			BufferedReader br = new BufferedReader(fr);
			String[] secuencia=br.readLine().split(";");
			String[] secuencia1=br.readLine().split(";");
			for(int i=0;i<secuencia.length-1;i++){
				total=total+(Integer.parseInt(secuencia[i])+Integer.parseInt(secuencia1[i]))+";";
			}
			total=total;
			System.out.println(total);
			br.close();
			fr.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		try{
			FileWriter fw = new FileWriter(documento,true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.newLine();
			bw.write(total);
			bw.close();
			fw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
