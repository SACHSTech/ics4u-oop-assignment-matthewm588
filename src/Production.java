import java.util.ArrayList;

public abstract class Production {

  
  String title;
  // out of 10 stars
  double stars;
  String rating;
  ArrayList<Actor> cast;
  ArrayList<Genre> genres;

  public Production(String theTitle, double theStars, String theRating) {

    this.title = theTitle;
    this.stars = theStars;
    this.rating = theRating;

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
    return title;
  }

}