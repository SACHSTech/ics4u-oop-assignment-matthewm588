/**
* A program Movie.java that creates a Movie object with a title, star rating, maturity rating,
* whether it's animated or not, the runtime in minutes, the release date, and the director.
* @author Matthew Morelli
*
*/
public class Movie extends Production {

  // the runtime is in minutes
  private int runtime;
  private String releaseDate;
  private String director;

  /**
  * Creates a new movie
  *
  * @param theTitle  The title of the movie
  * @param theStars  The number of stars the movie was rated, out of ten
  * @param theRating  The maturity rating of the movie
  * @param animated  Whether the movie is animated or not
  * @param theRuntime  The runtime of the movie, in minutes
  * @param theReleaseDate  The release date of the movie
  * @param theDirector  The name of the director of the movie
  */
  public Movie(String theTitle, double theStars, String theRating, boolean animated, int theRuntime, String theReleaseDate, String theDirector) {

    super(theTitle, theStars, theRating, animated);
    this.runtime = theRuntime;
    this.releaseDate = theReleaseDate;
    this.director = theDirector;

  }

  /**
  * Gets the runtime in minutes of the selected movie
  *
  * @return The runtime for the selected movie
  */
  public int getRuntime() {
    return this.runtime;
  }

  /**
  * Gets the release date of the selected movie
  *
  * @return The release date for the selected movie
  */
  public String getReleaseDate() {
    return this.releaseDate;
  }

  /**
  * Gets the name of the director of the selected movie
  *
  * @return The director of the selected movie
  */
  public String getDirector() {
    return this.director;
  }

  /**
  * Prints that the user has watched the movie they inputted
  *
  * @param title  The title of the movie that the user has chosen
  */
  public void play(String title) {
    System.out.println("you watched " + title);
  }

}