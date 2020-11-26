package aggregators;

import java.io.IOException;
import java.util.List;

import fileprocessors.StockFileReader;

public class AggregatorProcessor <t1 extends Aggregator>{
	
	t1 aggType;
	String fileName;
	
	public AggregatorProcessor(t1 aggType, String fileName) {
		super();
		this.aggType = aggType;
		this.fileName = fileName;		
	}
	
//	
//
//	public t1 getAggType() {
//		return aggType;
//	}
//
//	public void setAggType(t1 aggType) {
//		this.aggType = aggType;
//	}
//
//	public String getFileName() {
//		return fileName;
//	}
//
//	public void setFileName(String fileName) {
//		this.fileName = fileName;
//	}
//	
	
	public double runAggregator(int columnNumber) throws IOException{
		StockFileReader fr = new StockFileReader(fileName);
		List<String> lines = fr.readFileData();
		columnNumber--;
		for(String line : lines) {
			String [] numbers = line.split(",");
			double value = Double.parseDouble(numbers[columnNumber]);
			aggType.add(value);
		}
		
		double number = aggType.calculate();
		return number;
	}


	
	
	
	
}
