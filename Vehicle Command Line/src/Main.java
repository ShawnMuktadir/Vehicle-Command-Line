import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		List<Vehicle> vehicleList=new ArrayList();
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Do you want to add a vehicle?");
		//System.out.println();

		while(!sc.nextLine().equals("no")) 
		{
			System.out.println("Enter model number");
			//System.out.println();
			
			String model=sc.nextLine();
			
			System.out.println("Enter engine type");
			//System.out.println();
			String engineType=sc.nextLine();
			
			System.out.println("Enter engine power");
			//System.out.println();
			String enginePower=sc.nextLine();
			
			System.out.println("Enter tyre size?");
			//System.out.println();
			String tyreSize=sc.nextLine();
		 
			System.out.println("Select the type of your vehicle");
			//System.out.println();
			Type types=new Type();
			
			String [] typex=types.getType();
			
			for(int i=0;i<typex.length;i++) {
				
				System.out.println(i+1+"."+typex[i]);
			}
			
			Scanner input=new Scanner(System.in);
		
			int typeInt=input.nextInt();
			String type=null;
			
			if(typeInt==1) {
			  type="normal";
			}
			
			if(typeInt==2) {
			   type="sports";
			}
			
			if(typeInt==3) {
				type="heavy";
			}
		  
			Vehicle vehicle=new Vehicle(model,engineType,enginePower,tyreSize,type);
			
			vehicleList.add(vehicle);
			
			System.out.println("Do you want to add another vehicle?");
			//System.out.println();
			
		}
		
		System.out.println("Listing all the vehicles");
		
		int expectedVisitor = 30;
		
		for(Vehicle ve:vehicleList) {
			System.out.println("model:"+ve.getModel());
			System.out.println("engine type:"+ve.getType());
			System.out.println("engine power:"+ve.getPowerEngine());
			System.out.println("tire size:"+ve.getTyreSize());
			
			if(ve.getType().equals("sports")) {
				Sports sports=new Sports();
				expectedVisitor+=20;
				System.out.println("Expected visitor : "+expectedVisitor);
				
				String[] sportx=sports.getSportsType();
				
				for(int i=0;i<sportx.length;i++) {
					System.out.println("Sport type has properties: " + sportx[i]);
				}
			}
			
			if(ve.getType().equals("heavy")) {
				Heavy heavy=new Heavy();
				expectedVisitor-=20;
				System.out.println("Expected visitor : "+expectedVisitor);
				String[] heavyx=heavy.getHeavyType();
				
				for(int i=0;i<heavyx.length;i++) {
					System.out.println("Heavy type has properties: " + heavyx[i]);
				}
			}
			
			if((ve.getType().equals("normal"))) {
				expectedVisitor-=20;
				System.out.println("Expected visitor : "+ expectedVisitor);
				System.out.println("Normal type has no extra property: " );
			}
		}
		
		System.out.println("Do you want to remove a vehicle?");
		
		@SuppressWarnings("resource")
		Scanner scannerRemove= new Scanner(System.in);
//		scannerRemove.next();
		while(!scannerRemove.nextLine().equals("no")) {
			
			System.out.println("Enter the model name you want to remove?");
			
			for(int i=0;i<vehicleList.size();i++) {
				
				System.out.println(i+1+"."+vehicleList.get(i).getModel());
			}
			
		//	System.out.println("Enter the model name you want to remove?");
			Scanner input= new Scanner(System.in);
			
			String modelNumber=input.nextLine();
			
			System.out.println(modelNumber);
			
			boolean status=false;
			for(int i=0;i<vehicleList.size();i++) {
				if(vehicleList.get(i).getModel().equals(modelNumber)) {
					
				   vehicleList.remove(i);
				   status=true;
				}
			}
			
			//boolean status=vehicleList.remove(modelNumber);
			
			if(status) {
				System.out.println("Vehicle removed");
			}else {
				System.out.println("operation failed");
			}
			
			System.out.println("Remaining vehicle");
			for(Vehicle ve:vehicleList) {
				System.out.println("Model: "+ve.getModel());
				System.out.println("------------------");
			}
		}
		
		
		
		
	}
}
