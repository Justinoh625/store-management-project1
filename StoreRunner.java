import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object - feel free to delete if not using!
    Scanner input = new Scanner(System.in);

    /*
    *Instantiates a regular restaurant item as well as 3 fast food restaurants and 3 sit down restaurants to be printed depending
    on what the user selects. Also assigns them their values. 
    */
    Restaurant cooper = new Restaurant("Unknown", 75.0, 40);
    FastFood chickfila = new FastFood("Chickfila", 85.0, 50, true);
    FastFood mcdonalds = new FastFood("McDonalds", 70.0, 145, true);
    FastFood chipotle = new FastFood("Chipotle", 77.3, 5, false);
    
    SitDownRestaurant cheesecakeFactory = new SitDownRestaurant("Cheesecake Factory", 85.0, 250, true);
    SitDownRestaurant islands = new SitDownRestaurant("Islands", 82.5, 85, false);
    SitDownRestaurant oliveGarden = new SitDownRestaurant("Olive Garden", 80.0, 125, true);

    //Prints out a default restaurant that was instantiated above
    System.out.println("An ideal restaurant would look like this:");
    System.out.println(cooper);

    //Starts the program by asking what the user's name is
    System.out.println("-------------------------------------------------------");
    System.out.println("Hey! Welcome to our restaurant program.");
    System.out.println("-------------------------------------------------------");
    System.out.println("What is your name?");

    //the user enters their name as a string
    String userName = input.nextLine();
  
   /*
    *Asks the user if they want to go to a restaurant with a boolean. If the user selects false, the program will end 
    with a message.
    */
    System.out.println("-------------------------------------------------------");
    System.out.println("Do you want to go to a restaurant? (True or False)");
    System.out.println("-------------------------------------------------------");
    

    boolean trueOrFalse = input.nextBoolean();

    if (trueOrFalse == true) {
      System.out.println("\nWhat restaurant do you want to go to?");
      System.out.println("-------------------------------------------------------");
      System.out.println("Fast Food? (True or False)");
      System.out.println("-------------------------------------------------------");
    }
    else if (trueOrFalse == false) {
      System.out.println("-------------------------------------------------------");
      System.out.println("Goodbye! Thanks for using our program!");
    }
     boolean fastFoodSelection = input.nextBoolean();

    //The program prints fast food restaurants if the user selects fast food
    if (fastFoodSelection == true) {
      System.out.println("\nHere are some recommendations:");
      System.out.println("\nHey " + userName + "," + " here are some recommendations: ");
      System.out.println("-------------------------------------------------------");
      System.out.println(chickfila + "\n Drive Thru: " + chickfila.getHasDriveThru());
      System.out.println("-------------------------------------------------------");
      System.out.println(mcdonalds + "\n Drive Thru: " + mcdonalds.getHasDriveThru());
      System.out.println("-------------------------------------------------------");
      System.out.println(chipotle + "\n Drive Thru: " + chipotle.getHasDriveThru());
      System.out.println("-------------------------------------------------------");
    }
    /*
    *If the user doesn't select fast food, it presents an option for a sit down restaurant.
    If the user selects true to the sit down restaurant, it will print a list of sit down restaurants and their info.
    If the user selects false to the sit down restaurant, thus selecting false for both options, it will stop the program,
    ending with a message.
    */
    else if (fastFoodSelection == false) {
      System.out.println("\nSit Down Restaurant? (True or False)");
      System.out.println("-------------------------------------------------------");
    }

    boolean sitDownRestaurantSelection = input.nextBoolean();

    if (sitDownRestaurantSelection == true) {
      System.out.println("\nHey " + userName + "," + " here are some recommendations: ");
      System.out.println("-------------------------------------------------------");
      System.out.println(cheesecakeFactory + "\n Serves Bread: " + cheesecakeFactory.getServesBread());
      System.out.println("-------------------------------------------------------");
      System.out.println(islands + "\n Serves Bread: " + islands.getServesBread());
      System.out.println("-------------------------------------------------------");
      System.out.println(oliveGarden + "\n Serves Bread: " + oliveGarden.getServesBread());
      System.out.println("-------------------------------------------------------"); 
    }
    else if (sitDownRestaurantSelection == false) {
      System.out.println("\nGoodbye! Thanks for using our program!");
    }

    

    // Closes the Scanner object
    input.close();

    
    
  }
}