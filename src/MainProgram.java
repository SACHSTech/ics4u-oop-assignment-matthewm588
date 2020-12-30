import java.io.*;
import java.util.Arrays;

public class MainProgram {
  public static void main(String args[]) throws IOException {

    Series breakingBad = new Series("Breaking Bad", 9.5, "TV-MA", 5, "January 20, 2008", "September 29, 2013", "Vince Gilligan");

    Genre crimeTVDramas = new Genre("Crime TV Dramas");
    breakingBad.addGenre(crimeTVDramas);

    Genre TVThrillers = new Genre("TV Thrillers");
    breakingBad.addGenre(TVThrillers);

    Genre TVDramas = new Genre("TV Dramas");
    breakingBad.addGenre(TVDramas);

    Actor bryanCranston = new Actor("Bryan Cranston", "March 7, 1956");
    breakingBad.addActor(bryanCranston);

    Actor aaronPaul = new Actor("Aaron Paul", "August 27, 1979");
    breakingBad.addActor(aaronPaul);

    Actor annaGunn = new Actor("Anna Gunn", "August 11, 1968");
    breakingBad.addActor(annaGunn);

    Actor deanNorris = new Actor("Dean Norris", "April 8, 1963");
    breakingBad.addActor(deanNorris);

    Actor betsyBrandt = new Actor("Betsy Brandt", "March 14, 1973");
    breakingBad.addActor(betsyBrandt);

    System.out.println(breakingBad.getTitle());
    System.out.println(breakingBad.getStars() + "/10 stars");
    System.out.println("Rating: " + breakingBad.getRating());
    System.out.println("Cast:");
    for (int i = 0; i < breakingBad.cast.size(); i++) {
      System.out.print(breakingBad.cast.get(i).getName() + " Birthdate: ");
      System.out.println(breakingBad.cast.get(i).getBirthdate());
    }
    System.out.println("Number of seasons: " + breakingBad.getSeasons());
    System.out.println("Start Date: " + breakingBad.getStartDate());
    System.out.println("End Date: " + breakingBad.getEndDate());
    System.out.println("Creator: " + breakingBad.getCreator()); 

    System.out.println("Genres:");
    for (int i = 0; i < breakingBad.genres.size(); i++) {
      System.out.print(breakingBad.genres.get(i).getGenre() + ", ");
    }
    System.out.println();
    System.out.println();


    Series brooklyn99 = new Series("Brooklyn Nine-Nine", 8.4, "TV-14", 7, "September 17, 2013", "Present", "Daniel J. Goor, Micheal Schur");

    Genre sitcom = new Genre("Sitcoms");
    brooklyn99.addGenre(sitcom);

    Genre TVComedies = new Genre("TV Comedies");
    brooklyn99.addGenre(TVComedies);

    Actor andySamberg = new Actor("Andy Samberg", "August 18, 1978");
    brooklyn99.addActor(andySamberg);

    Actor andreBraugher = new Actor("Andre Braugher", "July 1, 1962");
    brooklyn99.addActor(andreBraugher);

    Actor stephanieBeatriz = new Actor("Stephanie Beatriz", "February 10, 1981");
    brooklyn99.addActor(stephanieBeatriz);

    Actor terryCrews = new Actor("Terry Crews", "July 30, 1968");
    brooklyn99.addActor(terryCrews);

    Actor melissaFumero = new Actor("Melissa Fumero", "August 19, 1982");
    brooklyn99.addActor(melissaFumero);

    System.out.println(brooklyn99.getTitle());
    System.out.println(brooklyn99.getStars() + "/10 stars");
    System.out.println("Rating: " + brooklyn99.getRating());
    System.out.println("Cast:");
    for (int i = 0; i < brooklyn99.cast.size(); i++) {
      System.out.print(brooklyn99.cast.get(i).getName() + " Birthdate: ");
      System.out.println(brooklyn99.cast.get(i).getBirthdate());
    }
    System.out.println("Number of seasons: " + brooklyn99.getSeasons());
    System.out.println("Start Date: " + brooklyn99.getStartDate());
    System.out.println("End Date: " + brooklyn99.getEndDate());
    System.out.println("Creator: " + brooklyn99.getCreator()); 

    System.out.println("Genres:");
    for (int i = 0; i < brooklyn99.genres.size(); i++) {
      System.out.print(brooklyn99.genres.get(i).getGenre() + ", ");
    }

  }
}