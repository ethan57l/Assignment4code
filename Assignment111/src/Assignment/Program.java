package Assignment;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Program {
	public static void main(String[] args) {
		//declaring filename
		String filename = "Food.txt";
		//calling upon second class
		 FoodUpdate objfood = new FoodUpdate();
		 //calling scanner
		 Scanner scanner = new Scanner(System.in);
		 
		 //asking user question
		 System.out.println("Enter the ID of the food");
		 //UserID is a string so the response will be used for setfoodID
	        String UserID = scanner.next();
	        objfood.setfoodID(UserID);
	        
	        //Ask user question
			System.out.println("Enter the Name of the food");
		    String UserName = scanner.next();
		    //if the amount of characters is greater then 5 or less then 50
		    
		    if(UserName.length() >= 5 && UserName.length() <= 50){
		    	//change setfood to the input
		    	objfood.setfoodName(UserName);
		    	//if not
		    } else{
		    	//print the issue and exit program
		    	System.out.println("Please make sure the name is between 5 and 50 Characters");
		    	System.exit(0);
		    	
		    }
		    
		    //asking user question
			System.out.println("Enter the Description of the food");
		    String spacer = scanner.nextLine();
		    String UserDescription = scanner.nextLine();
		    //using the tokens to find the work count
		    //calling the stringtokenizer
		    StringTokenizer WordCount = new StringTokenizer(UserDescription);
		    
		    //if counttokens is less then 50 and greater then 5 upload to file
		    if(WordCount.countTokens()<=50 && WordCount.countTokens()>=5){
		    	objfood.setfoodDescription(UserDescription);
		    	//if not 
		    }else {
		    	//print error and exit the program
		    	System.out.println("Please make sure the Description is between 5 and 50 words");
		    	System.exit(0);
		    }
		        
		    //asking user for type of food
			System.out.println("Enter the type of the food");
		    String UserType= scanner.nextLine();
		    objfood.setfoodType(UserType);
		    
		    //asking user for calories
			System.out.println("Enter the Calories of the food");
		    int UserCalorie = scanner.nextInt();
		    //calories must be less then 1500
		    if (UserCalorie <= 1500) {
			    objfood.setfoodCalorie(UserCalorie);
			    //if the Usertype is kid food then it must be lower then 800 calories
		    } else if(UserType.equalsIgnoreCase("Kid Food") && UserCalorie <=800) {
		    		objfood.setfoodCalorie(UserCalorie);
		    } else {
		    	//print errors and exit program
		    	System.out.println("Please make sure the Calories is less then 1500 calories");
		    	System.out.println("If Food type is Kid Food then it needs to be less then 800");
		    	System.exit(0);
		    }
		    
		    //asking user question
			System.out.println("Enter the Price of the food");
		    double UserPrice= scanner.nextDouble();
		    //if its between 5 and 50 then add it to the file
		    if (UserPrice >= 5 && UserPrice <= 150) {
		    	objfood.setfoodPrice(UserPrice);
		    	//if the calorie is 1000 then it must be $100
		    } else if(UserCalorie <= 1000) {
		    	if(UserPrice <= 100) {
		    		//add it to file
		    		objfood.setfoodPrice(UserPrice);
		    	}
		    } else {
		    	//print error and exit
		    	System.out.println("Please make sure the Price is between $5 and $150");
		    	System.exit(0);
		    }

	        
	        //calling the addfood fuction which puts it all into the file
	        
			System.out.println(objfood.addFood());

	

	}

}
