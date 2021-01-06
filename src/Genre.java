/**
* A program Genre.java that creates a Genre object with the name of the genre.
* @author Matthew Morelli
*
*/
public class Genre {

  private String genre;
  
  /**
  * Creates a genre
  *
  * @param theGenre  A genre object to be created
  */
  public Genre(String theGenre) {
    this.genre = theGenre;
  }

  /**
  * Gets the name of the genre
  *
  * @return The genre name
  */
  public String getGenre() {
    return this.genre;
  }

}