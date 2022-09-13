package inheritance22;

public class Boleno extends Maruti{
     String engine,modelno;
     
    public void setEngine(String engine) {
    	this.engine = engine;
    }
    
    public void setModelNo(String modelno)
    {
    	this.modelno = modelno;
    }
    
    public String getEngine()
    {
    	return engine;
    	
    }
    public String getModelNo()
    {
    	return modelno;
    }
}
