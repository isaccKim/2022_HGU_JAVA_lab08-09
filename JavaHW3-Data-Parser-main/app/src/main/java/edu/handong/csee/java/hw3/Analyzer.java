package edu.handong.csee.java.hw3;

public class Analyzer {
	private String [][] data; 
	private int numOfCountries;
	private int numOfPatients;
	
	public Analyzer(String[] data) {
		dataSetter();
		String t[] = data[0].split(",");  
		this.data = new String [data.length][t.length];
		for(int i=0; i<data.length; i++) {
			
			if(data[i].contains(",\"")) {
				String temp[] = data[i].split("\"");
				String temp2[] = temp[2].split(",");
				this.data[i][0] = null;
				this.data[i][1] = temp[1];
				
				for(int j=0; j<temp2.length-1; j++) {
					this.data[i][j+2] = temp2[j+1];
				}
			}
			
			else if(data[i].contains("\"")) {
				String temp[] = data[i].split("\"");
				String temp2[] = temp[2].split(",");
				this.data[i][0] = temp[1];
				
				for(int j=0; j<temp2.length-1; j++) {
					this.data[i][j+1] = temp2[j+1];
				}
			}
			else {
				this.data[i] = data[i].split(",");
			}
		}
	}
	
	private void dataSetter() {
		numOfCountries = 0;
		numOfPatients = 0;	
	}
	
	public int getNumberOfCountries(){
		int flag = 0;
				for(int i=1; i<data.length; i++) {
					flag = 0;
					for(int j=1; j<i; j++) {
						if(i==j)continue;
						if(data[i][1].equals(data[j][1]))flag=1;
					}
					if(flag==0)numOfCountries++;
				}
		return numOfCountries;
	}
	
	public int getNumberOfAllPatients(){
		numOfPatients = 0;
			for(int i=1; i<data.length; i++) {
				numOfPatients+=Util.integer(data[i][data[i].length-1]);
			}
				return numOfPatients;
			}
			
	public int getNumberOfPatientsOfACountry(String country){
		int sum = 0;
			for(int i=1; i<data.length; i++) {
				if(data[i][1].equals(country)) 
					sum+=Util.integer(data[i][data[i].length-1]);
				}
			return sum;
			}
			
	public int getNumberOfPatientsFromASpecifiedDate(String date){
		int index = 0;
		int sum = 0;		
		
		for(int i=0; i<data[0].length; i++) {
			if(data[0][i].equals(date)) {
				index = i;
				break;
				}
			}
			if(index == 4) {
				for(int i=1; i<data.length; i++) {
					sum += Util.integer(data[i][data[i].length-1]) ;
				}
					return sum;
				}
				
			for(int i=1; i<data.length; i++) {
				sum += Util.integer(data[i][data[i].length-1]) - Util.integer(data[i][index-1]);
			}
				return sum;
			}
			
	public int getNumberOfPatientsBeforeASpecifiedDate(String date) {
		int index = 0;
		int sum = 0;
		
		for(int i=0; i<data[0].length; i++) {
			if(data[0][i].equals(date)) {
				index = i;
				break;
			}
		}
		if(index == 4) {
			return 0;
		}
		
		for(int i=1; i<data.length; i++) {
			sum += Util.integer(data[i][index-1]);
		}
		
		return sum;
	}
			
	public int getNumberOfPatientsBetweenTwoDates(String d1, String d2) {
		int a = 0;
		int b = 0;
		int index = 0;
		int sum = 0;
		
		for(int i=0; i<data[0].length; i++) {
			if(data[0][i].equals(d1)) {
				index = i;
				break;
				}
			}
				
			for(int i=1; i<data.length; i++) {
				a += Util.integer(data[i][index-1]);
			}
			
			for(int i=0; i<data[0].length; i++) {
				if(data[0][i].equals(d2)) {
					index = i;
					break;
					}
				}
					
				for(int i=1; i<data.length; i++) {
					b += Util.integer(data[i][index]);
				}
			
			
		
		if(a>b)return (a-b);
		else return( b-a);
	}
		
}
