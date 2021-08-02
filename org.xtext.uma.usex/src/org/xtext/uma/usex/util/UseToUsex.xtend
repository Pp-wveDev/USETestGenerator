package org.xtext.uma.usex.util

import java.io.File
import java.util.Scanner
import java.io.FileNotFoundException
import java.io.FileWriter
import java.io.IOException

class UseToUsex {
	def static useToUsex(String filepath) throws FileNotFoundException, IOException{
			// Reader configuration
			var File originFile = new File(filepath);
			var Scanner reader = new Scanner(originFile);
			
			// Writer configuration
			var destinyPath = filepath.substring(0, filepath.length-3) + "usex";
			var File destinyFile = new File(destinyPath);
			destinyFile.createNewFile;
			var FileWriter writer = new FileWriter(destinyFile);
			
			while(reader.hasNextLine) {
				var line = reader.nextLine;
				
				if(line.contains("begin")) {
					writer.write(line+"\"\n");
					line = processBody(reader);
				}
				
				writer.write(line+"\n");
			}
			
			reader.close;
			writer.close;
			
			return destinyPath;
	}
	
	def private static processBody(Scanner reader) {
		var StringBuilder sB = new StringBuilder();
		var beginCounter = 0;
		
		while(reader.hasNext && beginCounter >= 0) {
			var line = reader.nextLine();
			
			if(line.equals("begin") || line.contains("then") || line.contains("do")) {
				beginCounter++;
			} 
			else if(line.contains("end")) {
				beginCounter--;
				if(beginCounter == -1) {
					var decLine = line.split("e");
					line = decLine.get(0) + "\"e" + decLine.get(1);
				}
			}
			
			sB.append(line+"\n");
		}
		
		return sB.toString();
	}
	
	def static deleteTmp(String filepath) {
		var File file = new File(filepath);
		if (!file.delete()) {
			println("Error deleting tmp file");
		}
	}
	
}
