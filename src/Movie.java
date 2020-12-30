public class Movie extends Production {

  // the runtime is in minutes
  private int runtime;
  private String releaseDate;
  private String director;

  public Movie(String theTitle, int theStars, String theRating, int theRuntime, String theReleaseDate, String theDirector) {

    super(theTitle, theStars, theRating);
    this.runtime = theRuntime;
    this.releaseDate = theReleaseDate;
    this.director = theDirector;

  }

}