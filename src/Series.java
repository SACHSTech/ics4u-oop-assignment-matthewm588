public class Series extends Production {

  private int seasons;
  private String startDate;
  private String endDate;
  private String creator;

  public Series(String theTitle, double theStars, String theRating, int theSeasons, String theStartDate, String theEndDate, String theCreator) {

    super(theTitle, theStars, theRating);
    this.seasons = theSeasons;
    this.startDate = theStartDate;
    this.endDate = theEndDate;
    this.creator = theCreator;

  }

}