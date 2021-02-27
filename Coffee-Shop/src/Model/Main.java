package Model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {

	public static void main(String[] args)throws IOException {
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
	  BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	  int testCases = Integer.parseInt(br.readLine());
	  
	  for (int i = 0; i < testCases; i++) {
		  bw.write(bubble(ages(br.readLine()))+"\n");
	  }
	  
	  bw.flush();
	  br.close();
	  bw.close();
	  

	}
	public static double[] ages(String txtIn) {
		String[] txt= txtIn.split(" ");
		double[] ageList = new double[txt.length];
		for(int i=0; i < ageList.length; i++) {
			ageList[i]= Double.parseDouble(txt[i]);
		}
		return ageList;
	}
	public static String bubble(double[] ageList) {
		int changes = 0;
		
		for (int i = 0; i < ageList.length; i++){
		      for (int j = 0; j < ageList.length-(1+i); j++){
		        if (ageList[j]>ageList[j+1]){
		          double aux = ageList[j];
		          ageList[j] = ageList[j+1];
		          ageList[j+1] = aux;
		          changes ++;
		        }
		        
		      }
		
	}
		String aux = Arrays.toString(ageList);
		aux = aux.replace(",", " ");
		aux = aux.replace("[", "");
		aux = aux.replace("]","");
		
		
		
		double result = (double)changes/(double)(ageList.length-1);
		
		DecimalFormat df = new DecimalFormat("#.##");
		df.setRoundingMode(RoundingMode.DOWN);
		
		String out = df.format(result)+"-"+aux;
		
		return out;
}
}
