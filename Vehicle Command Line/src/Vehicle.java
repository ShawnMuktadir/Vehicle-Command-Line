
public class Vehicle 
{
	private String model;
	private String engineType;
	private String powerEngine;
	private String tyreSize;
	private String type;
    
	public Vehicle(String model, String engineType, String powerEngine, String tyreSize,String type) 
	{
		this.model = model;
		this.engineType = engineType;
		this.powerEngine = powerEngine;
		this.tyreSize = tyreSize;
		this.type=type;
	
	}

	public String getModel() {
		return model;
	}

	public String getEngineType() {
		return engineType;
	}

	public String getPowerEngine() {
		return powerEngine;
	}

	public String getTyreSize() {
		return tyreSize;
	}

	public String getType() {
		return type;
	}

}
