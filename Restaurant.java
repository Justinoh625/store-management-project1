public class Restaurant {

  //Instance Variables
  private String name;
  private double avgRating;
  private int numMenuItems;
  
  //No-Argument Constructor
  public Restaurant() {
    this("Unknown", 50.0, 10);
  }
  
//Parameterized Constructor
  public Restaurant(String name, double avgRating, int numMenuItems) {
    this.name = name;
    this.avgRating = avgRating;
    this.numMenuItems = numMenuItems;
  }

  //Constructor methods

  //Getter methods (accessor methods)
  public String getName() {
    return name;
  }

  public double getAvgRating() {
    return avgRating;
  }

  public int getNumMenuItems() {
    return numMenuItems;
  }

  //Setter methods (mutator methods)
  public void setName(String newName) {
    name = newName;
  }

  public void setAvgRating(double newAvgRating) {
    if (newAvgRating < 0) {
      avgRating = 0.0;
    }
    else {
      avgRating = newAvgRating;
    }   
  }

  public void setNumMenuItems(int newNumMenuItems) {
    if (newNumMenuItems < 0) {
      numMenuItems = 0;
    }
    else {
      numMenuItems = newNumMenuItems;
    }
  }

  /*
  *toString method that allows to print objects info by calling their name
  */ 
  public String toString() {
    return " Name of Restaurant: " + name + "\n Average Rating: " + avgRating + "\n Number of Items on Menu: " + numMenuItems;
  }
}