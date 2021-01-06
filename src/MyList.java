import java.util.Arrays;
import java.util.ArrayList;

/**
* A program MyList.java that stores the user's watched productions, and creates reccomendations based
* on those watched productions.
* @author Matthew Morelli
*
*/
public class MyList {

  Info info = new Info();

  ArrayList<Production> productionsSeen = new ArrayList<Production>();

  /**
  * Adds a production to a list of all the productions you have watched
  *
  * @param production  The Production object that you watched
  */
  public void addProduction(Production production) {
    productionsSeen.add(production);
  }

  /**
  * Print recommended shows for the user based on their watched productions
  *
  * @return The recommended shows for the user
  */
  public String getReccomendations() {

    String reccomendations = "";
    // to prevent duplicate shows getting recommended
    String previous = "";
    ArrayList<String> usedShows = new ArrayList<String>();

    info.createBreakingBad();
    info.createBrooklyn99();
    info.createLucifer();
    info.createYou();
    info.createCaos();
    info.createSpiderverse();
    info.createJurassicWorldCampCretaceous();

    // reccomend by mutual cast
    for (int productionsCount = 0; productionsCount < productionsSeen.size(); productionsCount++) {

      for (int showsCount = 0; showsCount < info.shows.size(); showsCount++) {

        for (int castCount = 0; castCount < productionsSeen.get(productionsCount).cast.size(); castCount++) {

          for (int castCount2 = 0; castCount2 < info.shows.get(showsCount).cast.size(); castCount2++) {

            if (productionsSeen.get(productionsCount).cast.get(castCount).getName().equals(info.shows.get(showsCount).cast.get(castCount2).getName()) && !productionsSeen.get(productionsCount).getTitle().equals(info.shows.get(showsCount).getTitle())) {

              if (!previous.equals(info.shows.get(showsCount).getTitle()) && !usedShows.contains(info.shows.get(showsCount).getTitle()) && !productionsSeen.contains(info.shows.get(showsCount))) {

                reccomendations += info.shows.get(showsCount).getTitle();
                reccomendations += ", ";
                if (!usedShows.contains(info.shows.get(showsCount).getTitle())) {
                  usedShows.add(info.shows.get(showsCount).getTitle());
                }
                previous = info.shows.get(showsCount).getTitle();

              }

            }

          }

        }

      }

    }

    // recommend by mutual genre
    for (int productionsCount = 0; productionsCount < productionsSeen.size(); productionsCount++) {

      for (int showsCount = 0; showsCount < info.shows.size(); showsCount++) {

        for (int genreCount = 0; genreCount < productionsSeen.get(productionsCount).genres.size(); genreCount++) {

          for (int genreCount2 = 0; genreCount2 < info.shows.get(showsCount).genres.size(); genreCount2++) {

            if (productionsSeen.get(productionsCount).genres.get(genreCount).getGenre().equals(info.shows.get(showsCount).genres.get(genreCount2).getGenre()) && !productionsSeen.get(productionsCount).getTitle().equals(info.shows.get(showsCount).getTitle())) {

              if (!previous.equals(info.shows.get(showsCount).getTitle()) && !usedShows.contains(info.shows.get(showsCount).getTitle()) && !productionsSeen.contains(info.shows.get(showsCount))) {

                reccomendations += info.shows.get(showsCount).getTitle();
                reccomendations += ", ";
                if (!usedShows.contains(info.shows.get(showsCount).getTitle())) {
                  usedShows.add(info.shows.get(showsCount).getTitle());
                }
                previous = info.shows.get(showsCount).getTitle();

              }

            }

          }

        }

      }

    }

    return reccomendations;

  }

  /**
  * Print recommended movies for the user based on their watched productions
  *
  * @return The recommended movies for the user
  */
  public String getMovieReccomendations() {

    String reccomendations = "";
    String previous = "";
    ArrayList<String> usedMovies = new ArrayList<String>();

    info.createSpiderverse();
    info.createRobinHood();
    info.createJohnnyEnglish();
    info.createJohnnyEnglishReborn();
    info.createJohnnyEnglishStrikesAgain();
    info.createElCamino();
    info.createJurassicWorldFallenKingdom();
    info.createVenom();

    // reccomend by mutual cast
    for (int productionsCount = 0; productionsCount < productionsSeen.size(); productionsCount++) {

      for (int movieCount = 0; movieCount < info.movies.size(); movieCount++) {

        for (int castCount = 0; castCount < productionsSeen.get(productionsCount).cast.size(); castCount++) {

          for (int castCount2 = 0; castCount2 < info.movies.get(movieCount).cast.size(); castCount2++) {

            if (productionsSeen.get(productionsCount).cast.get(castCount).getName().equals(info.movies.get(movieCount).cast.get(castCount2).getName()) && !productionsSeen.get(productionsCount).getTitle().equals(info.movies.get(movieCount).getTitle())) {

              if (!previous.equals(info.movies.get(movieCount).getTitle()) && !usedMovies.contains(info.movies.get(movieCount).getTitle()) && !productionsSeen.contains(info.movies.get(movieCount))) {

                reccomendations += info.movies.get(movieCount).getTitle();
                reccomendations += ", ";
                if (!usedMovies.contains(info.movies.get(movieCount).getTitle())) {
                  usedMovies.add(info.movies.get(movieCount).getTitle());
                }
                previous = info.movies.get(movieCount).getTitle();

              }

            }

          }

        }

      }

    }

    // recommend by mutual genre
    for (int productionsCount = 0; productionsCount < productionsSeen.size(); productionsCount++) {

      for (int movieCount = 0; movieCount < info.movies.size(); movieCount++) {

        for (int genreCount = 0; genreCount < productionsSeen.get(productionsCount).genres.size(); genreCount++) {

          for (int genreCount2 = 0; genreCount2 < info.movies.get(movieCount).genres.size(); genreCount2++) {

            if (productionsSeen.get(productionsCount).genres.get(genreCount).getGenre().equals(info.movies.get(movieCount).genres.get(genreCount2).getGenre()) && !productionsSeen.get(productionsCount).getTitle().equals(info.movies.get(movieCount).getTitle())) {

              if (!previous.equals(info.movies.get(movieCount).getTitle())&& !usedMovies.contains(info.movies.get(movieCount).getTitle()) && !productionsSeen.contains(info.movies.get(movieCount))) {

                reccomendations += info.movies.get(movieCount).getTitle();
                reccomendations += ", ";
                if (!usedMovies.contains(info.movies.get(movieCount).getTitle())) {
                  usedMovies.add(info.movies.get(movieCount).getTitle());
                }
                previous = info.movies.get(movieCount).getTitle();

              }

            }

          }

        }

      }

    }

    return reccomendations;

  }

}