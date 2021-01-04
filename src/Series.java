public class Series extends Production {

  private int seasons;
  private String startDate;
  private String endDate;
  private String creator;

  public Series(String theTitle, double theStars, String theRating, boolean animated, int theSeasons, String theStartDate, String theEndDate, String theCreator) {

    super(theTitle, theStars, theRating, animated);
    this.seasons = theSeasons;
    this.startDate = theStartDate;
    this.endDate = theEndDate;
    this.creator = theCreator;

  }

  public int getSeasons() {

    return this.seasons;

  }

  public String getStartDate() {

    return this.startDate;

  }

  public String getEndDate() {

    return this.endDate;

  }

  public String getCreator() {

    return this.creator;

  }

  public void play(String title) {

    System.out.println("you watched " + title);

  }

}