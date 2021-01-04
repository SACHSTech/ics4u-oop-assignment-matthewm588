import java.util.ArrayList;

public abstract class Production {

  
  String title;
  // out of 10 stars
  double stars;
  String rating;
  boolean isAnimated;
  ArrayList<Actor> cast;
  ArrayList<Genre> genres;

  public Production(String theTitle, double theStars, String theRating, boolean animated) {

    this.title = theTitle;
    this.stars = theStars;
    this.rating = theRating;
    this.isAnimated = animated;

    cast = new ArrayList<Actor>();
    genres = new ArrayList<Genre>();

  }

  public void addActor(Actor newActor) {

    cast.add(newActor);

  }

  public void addGenre(Genre newGenre) {

    genres.add(newGenre);

  }

  public String getTitle() {

    return this.title;

  }

  public double getStars() {

    return this.stars;

  }

  public String getRating() {

    return this.rating;

  }

  public boolean getAnimated() {

    return this.isAnimated;

  }

  public abstract void play(String title);

}