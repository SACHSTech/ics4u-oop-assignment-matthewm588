public class Movie extends Production {

  // the runtime is in minutes
  private int runtime;
  private String releaseDate;
  private String director;

  public Movie(String theTitle, double theStars, String theRating, boolean animated, int theRuntime, String theReleaseDate, String theDirector) {

    super(theTitle, theStars, theRating, animated);
    this.runtime = theRuntime;
    this.releaseDate = theReleaseDate;
    this.director = theDirector;

  }

  public int getRuntime() {

    return this.runtime;

  }

  public String getReleaseDate() {

    return this.releaseDate;

  }

  public String getDirector() {

    return this.director;

  }

  public void play(String title) {

    System.out.println("you watched " + title);

  }

}