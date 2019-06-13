package com.github.wangsongyan;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Generator {

	public static void main(String[] args) throws IOException {
		
		String folder = "ch2";
		for(int i = 1;i <= 16; i++){
			File file = new File(String.format("src/com/github/wangsongyan/%s/Exercise%02d.java", folder, i));
			if(!file.exists()){
				file.createNewFile();
				FileWriter fileWriter = new FileWriter(file);
				fileWriter.write("package com.github.wangsongyan." + folder + ";\r\n");
				fileWriter.write("\r\n");
				fileWriter.write(String.format("public class Exercise%02d {\r\n", i));
				fileWriter.write("\r\n");
				fileWriter.write("}");
				fileWriter.close();
			}
		}
		
	}

}
