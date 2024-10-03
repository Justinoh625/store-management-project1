public class FastFood extends Restaurant {

  //Instance variable
  private boolean hasDriveThru;

  //No-Argument Constructor
  public FastFood() {
    hasDriveThru = false;
  }

  //Parameterized Constructor
  public FastFood(String name, double avgRating, int numMenuItems, boolean hasDriveThru) {
    super(name, avgRating, numMenuItems);
    this.hasDriveThru = hasDriveThru;
  }

  //Constructor Methods

  /*
  *accessor method to return if the fast food restaurant has a drive thru or no
  */
  public boolean getHasDriveThru() {
    return hasDriveThru;
  }

  //mutator method
  public void setHasDriveThru(boolean newHasDriveThru) {
    hasDriveThru = newHasDriveThru;
  } 
}