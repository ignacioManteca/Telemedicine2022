package operations;

import java.io.FileWriter;
import java.io.IOException;
import Objects.Test;

public class StoreInfo {
	

	public void salida(Test test, String ruta){
		   FileWriter fw = null;
		   try {
		     fw = new FileWriter(ruta+".txt");
		     fw.write(test.toString());
		   } catch (IOException e) {
		      e.printStackTrace();
		   }
		   finally{
		      if (fw!=null){
		         try {
		            fw.close();
		         } catch (IOException e) {
		             e.printStackTrace();
		         }
		         fw = null;
		      }
		   }	
	}
}
