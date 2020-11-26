package fileprocessors;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StockFileReader {
	
	String filePath = null;
	
	public StockFileReader(String filePath){
		this.filePath = filePath;
	}
	
	public List<String> getHeaders() throws IOException{
		String line = readFirstLine(filePath); //read firstline of file and put in variable line of type String
		String [] header = line.split(","); // variable header of type String array splits the first line with "," 
		List<String> values = new ArrayList<String>(); // create array list 'values' 
		values = Arrays.asList(header); // Take each element separated by "," into list values
		return values; // return array list of values (headers)
	}
	
	static String readFirstLine(String path) throws IOException {
	    try (BufferedReader br =
	                   new BufferedReader(new FileReader(path))) {
	        return br.readLine();
	    }
	}
	/**
	 * Complete the body of this method.
	 * @return List
	 * @throws IOException
	 */
	public List<String> readFileData() throws IOException{
		List<String> lines = new ArrayList<String>(); // create array list 'lines'
		// Insert your code here..
		
		try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
			br.readLine();
			String line = null;
			while ((line = br.readLine()) != null) {
				lines.add(line);
			}
		}
	    return lines;
	}
}
