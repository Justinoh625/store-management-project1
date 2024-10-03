public class SitDownRestaurant extends Restaurant {

  //Instance Variable
  private boolean servesBread;

  //No-Argument Constructor
  public SitDownRestaurant() {
    servesBread = false;
  }

 /*
  * Parameterized constructor
  */
  public SitDownRestaurant(String name, double avgRating, int numMenuItems, boolean servesBread) {
    super(name, avgRating, numMenuItems);
    this.servesBread = servesBread;
  }

  /*
  *accessor method to return if the sit down restaurant serves bread or not
  */
  public boolean getServesBread() {
    return servesBread;
  }

  //mutator method
  public void setServesBread(boolean newServesBread) {
    servesBread = newServesBread;
  }
}