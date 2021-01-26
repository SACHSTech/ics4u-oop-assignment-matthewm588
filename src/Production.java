import java.util.ArrayList;

/**
* A program Production.java that creates a Production which can be either a movie or a show. Both have
* a title, a star rating, a maturity rating, and whether it is animated or not.
* @author Matthew Morelli
*
*/
public abstract class Production {
  
  private String title;
  // out of 10 stars
  private double stars;
  private String rating;
  private boolean isAnimated;
  ArrayList<Actor> cast;
  ArrayList<Genre> genres;

  /**
  * Creates a new production
  *
  * @param theTitle  The title of the production
  * @param theStars  The number of stars the production was rated, out of ten
  * @param theRating  The maturity rating of the production
  * @param animated  Whether the production is animated or not 
  */
  public Production(String theTitle, double theStars, String theRating, boolean animated) {

    this.title = theTitle;
    this.stars = theStars;
    this.rating = theRating;
    this.isAnimated = animated;

    cast = new ArrayList<Actor>();
    genres = new ArrayList<Genre>();

  }

  /**
  * Given an Actor object, add a new actor to the cast ArrayList
  *
  * @param newActor  The Actor object to be added to the cast ArrayList
  */
  public void addActor(Actor newActor) {
    cast.add(newActor);
  }

  /**
  * Given a Genre object, add a new genre to the genres ArrayList
  *
  * @param newGenre  The Genre object to be added to the genres ArrayList
  */
  public void addGenre(Genre newGenre) {
    genres.add(newGenre);
  }

  /**
  * Gets the name of the selected production
  *
  * @return The title for the selected production
  */
  public String getTitle() {
    return this.title;
  }

  /**
  * Gets the number of stars (out of ten) for the selected production
  *
  * @return The number of stars for the selected production
  */
  public double getStars() {
    return this.stars;
  }

  /**
  * Gets what the rating is for the selected production
  *
  * @return The rating for the selected production
  */
  public String getRating() {
    return this.rating;
  }

  /**
  * Returns wheter or not the selected production is animated or not
  *
  * @return Whether the selected production is animated or not
  */
  public boolean getAnimated() {
    return this.isAnimated;
  }

  public abstract void play(String title);

}