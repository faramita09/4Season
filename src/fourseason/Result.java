package fourseason;

public class Result {
	
	private String Choice;
	private String preLine1;
    private String preLine2;
    private String preLine3;
    private String preLine4;
    private String preLine5;
    private String preLine6;
    
    public Result(String achoice, String apreLine1, String apreLine2, String apreLine3, String apreLine4, String apreLine5, String apreLine6) {
    	Choice = achoice;
    	preLine1 = apreLine1;
    	preLine2 = apreLine2;
    	preLine3 = apreLine3;
    	preLine4 = apreLine4;
    	preLine5 = apreLine5;
    	preLine6 = apreLine6;
    }
    
    public String getChoice() {
		return Choice;
	}
	public void setChoice(String choice) {
		this.Choice = choice;
	}
	
	public String getpreLine1() {
		return preLine1;
	}
	public void setResultL1(String resultL1) {
		this.preLine1 = resultL1;
	}
	
	public String getpreLine2() {
		return preLine2;
	}
	public void setpreLine(String resultL2) {
		this.preLine2 = resultL2;
	}
	
	public String getpreLine3() {
		return preLine3;
	}
	public void setpreLine3(String resultL3) {
		this.preLine3 = resultL3;
	}
	
	public String getpreLine4() {
		return preLine4;
	}
	public void setpreLine4(String resultL4) {
		this.preLine4 = resultL4;
	}
	
	public String getpreLine5() {
		return preLine5;
	}
	public void setpreLine5(String resultL5) {
		this.preLine5 = resultL5;
	}
	public String getpreLine6() {
		return preLine6;
	}
	public void setpreLine6(String resultL6) {
		this.preLine6 = resultL6;
	}
	
	
	public String toString(){
		String result = "Choice :"+Choice;
        result +="\nResult Line 1 :"+preLine1;
        result +="\nResult Line 2 :"+preLine2;
        result +="\nResult Line 3 :"+preLine3;
        result +="\nResult Line 4 :"+preLine4;
        result +="\nResult Line 5 :"+preLine5;
        result +="\nResult Line 6 :"+preLine6;
     
        return result;
    }
}
