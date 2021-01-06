/**
* A program Series.java that creates a Series object with a title, a star rating, a maturity rating,
* whether it's animated or not, the number of seasons, the start date, the end date, and the creator.
* @author Matthew Morelli
*
*/
public class Series extends Production {

  private int seasons;
  private String startDate;
  private String endDate;
  private String creator;

  /**
  * Creates a new show
  *
  * @param theTitle  The title of the show
  * @param theStars  The number of stars the show was rated, out of ten
  * @param theRating  The maturity rating of the show
  * @param animated  Whether the show is animated or not
  * @param theSeasons  The number of seasons the show has
  * @param theStartDate  The release date of the first episode of the show
  * @param theEndDate  The release date of the final episode of the show
  * @param theCreator  The name of the creator of the show
  */
  public Series(String theTitle, double theStars, String theRating, boolean animated, int theSeasons, String theStartDate, String theEndDate, String theCreator) {

    super(theTitle, theStars, theRating, animated);
    this.seasons = theSeasons;
    this.startDate = theStartDate;
    this.endDate = theEndDate;
    this.creator = theCreator;

  }

  /**
  * Gets the number of seaons for the selected show
  *
  * @return The amount of seaons the selected show has
  */
  public int getSeasons() {
    return this.seasons;
  }

  /**
  * Gets the date of the first episode of the selected show
  *
  * @return The first episode date of the selected show
  */
  public String getStartDate() {
    return this.startDate;
  }

  /**
  * Gets the date of the last episode of the selected show
  *
  * @return The final episode date of the selected show
  */
  public String getEndDate() {
    return this.endDate;
  }

  /**
  * Gets the creator of the selected show
  *
  * @return The creator the selected show
  */
  public String getCreator() {
    return this.creator;
  }

  /**
  * Prints that the user has watched the show they inputted
  *
  * @param title  The title of the show that the user has chosen
  */
  public void play(String title) {
    System.out.println("you watched " + title);
  }

}