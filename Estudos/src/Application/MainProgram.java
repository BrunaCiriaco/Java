package Application;

import java.io.File;

import Data.AllData;

public class MainProgram {
	String mainPath = System.getProperty("user.home") + "\\data\\in\\";
	String newPath = System.getProperty("user.home") + "\\data\\in\\out\\";

	public static void main(String[] args) {
		MainProgram system = new MainProgram();
		system.capturingInfo();
	}
	
	public void capturingInfo() {
		File inputMainPath = new File(mainPath);
		File[] files = inputMainPath.listFiles((dir, name) -> name.endsWith(".dat"));
		AllData allData = new AllData();
		
		if(files != null) {
			for(File file : files) {
				String createNewPath =  newPath  + "done.dat";
				allData.processFile(file , createNewPath);
			}
		}
		
	}

}
