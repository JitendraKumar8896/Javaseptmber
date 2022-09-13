package inheritance22;

public class SwiftDezire extends Maruti {
	String engine,modelno;
	
    public void setSwiftEngine(String engine ) {
    	this.engine = engine;
    }
    
    public void setSwiftModelNo(String modelno)
    {
    	this.modelno = modelno;
    }
    
    public String getSwiftEngine()
    {
    	return engine;
    }
    public String getSwiftModelNo()
    {
    	return modelno;
    }
}
