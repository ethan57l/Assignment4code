package Assignment;
//importing File writer to write to file
//importing ioexception to throw a error if file cannot be reached.
import java.io.FileWriter;
import java.io.IOException;


public class FoodUpdate {
	//private classes
	private String foodID;
	private String foodName;
	private String foodDescription;
	private double foodPrice;
	private int foodCalorie;
	private String foodType;
		
	//constructors 
	public FoodUpdate(){
		this.foodID = "N/A";
		this.foodName = "N/A";
		this.foodDescription = "N/A";
		this.foodPrice = 0.0;
		this.foodCalorie = 0;
		this.foodType = "N/A";
	}
	//end of constructors

	//getters
	public String getfoodID() {
        return foodID;
    }
	public String getfoodName() {
        return foodName;
    }
	public String getfoodDescription() {
        return foodDescription;
    }
	public double getfoodPrice() {
        return foodPrice;
    }
	public int getfoodCalorie() {
        return foodCalorie;
    }
	public String getfoodType() {
        return foodType;
    }
	//end of getters
	
	//setters
    public void setfoodID(String ID) {
        this.foodID = ID;
    }
    public void setfoodName(String name) {
        this.foodName = name;
    }
    public void setfoodDescription(String Description) {
        this.foodDescription = Description;
    }
    public void setfoodPrice(double price) {
        this.foodPrice = price;
    }
    public void setfoodCalorie(int Calorie) {
        this.foodCalorie = Calorie;
    }
    public void setfoodType(String Type) {
        this.foodType = Type;
    }
    //end of setters

    public boolean addFood(){
    	//try to access the file
		try {
			//calls the writer to be used
			FileWriter input = new FileWriter("Food.txt", true);
			
			//uses the getters to get the information from the user 
			//and displays them in the folder
			input.write(getfoodID() + " " + getfoodName() + " " + getfoodDescription() + " $" + getfoodPrice() + " " + getfoodCalorie() + " " + getfoodType());
			
			//appending a line separator
			input.append("\n");
			
			//closes the write
			input.close();
			//needed for a boolean public class
			return true;
			
		//if cannot access file return false
		} catch (IOException e) {
			e.printStackTrace();
			//needed for a boolean public class
			return false;
		}
  
    }
}
