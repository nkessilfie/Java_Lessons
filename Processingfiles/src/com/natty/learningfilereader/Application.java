package com.natty.learningfilereader;

//importing all java.io packages
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {
		File file = new File("myfile.txt");
		
		//try with resources block can initialize classes that implement autocloaseable interfaces 
		//it auto closes the classes
		try(FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader);) {
			
			String line = bufferedReader.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Problem Reading File" + file.getName());
		}
	
	}

}
