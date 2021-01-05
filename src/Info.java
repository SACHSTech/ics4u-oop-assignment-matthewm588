import java.util.ArrayList;
import java.util.Arrays;

public class Info {

  ArrayList<Series> shows = new ArrayList<Series>();
  ArrayList<Movie> movies = new ArrayList<Movie>();

  Genre crimeTVDramas = new Genre("Crime TV Dramas");
  Genre TVThrillers = new Genre("TV Thrillers");
  Genre TVDramas = new Genre("TV Dramas");
  Genre sitcom = new Genre("Sitcoms");
  Genre TVComedies = new Genre("TV Comedies");
  Genre fantasyTVShows = new Genre("Fantasy TV Shows");
  Genre TVShowsBasedOnComics = new Genre("TV Shows Based on Comics");
  Genre TVShowsBasedOnBooks = new Genre("TV Shows Based on Books");
  Genre teenTVShows = new Genre("Teen TV Shows");
  Genre TVHorror = new Genre("TV Horror");
  Genre actionAdventure = new Genre("Action & Adventure");
  Genre actionComedies = new Genre("Action Comedies");
  Genre adventures = new Genre("Adventures");
  Genre comicBookAndSuperHeroMovies = new Genre("Comic Book and Superhero Movies");
  Genre comedies = new Genre("Comedies");
  Genre british = new Genre("British");
  Genre spyActionAdventure = new Genre("Spy Action & Adventure");
  Genre satires = new Genre("Satires");
  Genre familyFeatures = new Genre("Family Features");
  Genre familyComedies = new Genre("Family Comedies");
  Genre dramas = new Genre("Dramas");
  Genre crimeDramas = new Genre("Crime Dramas");
  Genre thrillerMovies = new Genre("Thriller Movies");
  Genre crimeThrillers = new Genre("Crime Thrillers");
  Genre scifiFantasy = new Genre("Sci-Fi & Fantasy");
  Genre actionScifiFantasy = new Genre("Action Sci-Fi & Fantasy");
  Genre scifiAdventure = new Genre("Sci-Fi Adventure");
  Genre kidsTV = new Genre("Kids' TV");
  Genre TVCartoons = new Genre("TV Cartoons");
  Genre familyWatchTogetherTV = new Genre("Family Watch Together TV");

  Series breakingBad = new Series("Breaking Bad", 9.5, "TV-MA", false, 5, "January 20, 2008", "September 29, 2013", "Vince Gilligan");

  Series brooklyn99 = new Series("Brooklyn Nine-Nine", 8.4, "TV-14", false, 7, "September 17, 2013", "Present", "Daniel J. Goor, Micheal Schur");

  Series lucifer = new Series("Lucifer", 8.2, "TV-14", false, 5, "January 25, 2016", "Present", "Tom Capinos");

  Series you = new Series("You", 7.7, "TV-MA", false, 2, "September 9, 2018", "Present", "Greg Berlanti, Sera Gamble");

  Series caos = new Series("Chilling Adventures of Sabrina", 7.6, "TV-14", false, 4, "October 26, 2018", "December 31 2020", "Roberto Aguirre-Sacasa");

  Series jurassicWorldCampCretaceous = new Series("Jurassic World Camp Cretaceous", 7.4, "TV-PG", true, 2, "September 18, 2020", "Present", "Colin Trevorrow, Steven Spielberg, Frank Marshall, Zack Stentz");

  Movie spiderverse = new Movie("Spider-Man: Into the Spider-Verse", 8.4, "PG", true, 116, "December 1, 2018", "Peter Ramsey, Rodney Rothman, Bob Persichetti");

  Movie robinHood = new Movie("Robin Hood", 5.3, "PG-13", false, 116, "November 21, 2018", "Otto Bathurst");

  Movie johnnyEnglish = new Movie("Johnny English", 6.2, "PG", false, 87, "April 6, 2003", "Peter Howitt");

  Movie johnnyEnglishReborn = new Movie("Johnny English Reborn", 6.3, "PG", false, 102, "October 21, 2011", "Oliver Parker");

  Movie johnnyEnglishStrikesAgain = new Movie("Johnny English Strikes Again", 6.2, "TV-PG", false, 88, "September 13, 2018", "David Kerr");

  Movie elCamino = new Movie("El Camino: A Breaking Bad Movie", 7.3, "TV-MA", false, 122, "October 7, 2019", "Vince Gilligan");

  Movie jurassicWorldFallenKingdom = new Movie("Jurassic World: Fallen Kingdom", 6.2, "PG-13", false, 128, "June 22, 2018", "J. A. Bayona");

  Movie venom = new Movie("Venom", 6.7, "PG-13", false, 112, "October 5, 2018", "Ruben Fleischer");

  // shows
  public void createBreakingBad() {

    breakingBad.addGenre(crimeTVDramas);
    breakingBad.addGenre(TVThrillers);
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

    shows.add(breakingBad);

  }

  public void printBreakingBad() {

    System.out.println(breakingBad.getTitle());
    if (!breakingBad.getAnimated()) {
      System.out.println("This show is live action");
    } else {
      System.out.println("This show is animated");
    }
    System.out.println(breakingBad.getStars() + "/10 stars");
    System.out.println("Rating: " + breakingBad.getRating());
    System.out.println("Cast:");
    for (int i = 0; i < breakingBad.cast.size(); i++) {
      System.out.print(breakingBad.cast.get(i).getName() + ", Birthdate: ");
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

  }

  public void createBrooklyn99() {

    brooklyn99.addGenre(sitcom);
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

    shows.add(brooklyn99);

  }

  public void printBrooklyn99() {

    System.out.println(brooklyn99.getTitle());
    if (!brooklyn99.getAnimated()) {
      System.out.println("This show is live action");
    } else {
      System.out.println("This show is animated");
    }
    System.out.println(brooklyn99.getStars() + "/10 stars");
    System.out.println("Rating: " + brooklyn99.getRating());
    System.out.println("Cast:");
    for (int i = 0; i < brooklyn99.cast.size(); i++) {
      System.out.print(brooklyn99.cast.get(i).getName() + ", Birthdate: ");
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

  public void createLucifer() {

    lucifer.addGenre(crimeTVDramas);
    lucifer.addGenre(fantasyTVShows);
    lucifer.addGenre(TVShowsBasedOnComics);
    lucifer.addGenre(TVDramas);

    Actor tomEllis = new Actor("Tom Ellis", "November 17, 1978");
    lucifer.addActor(tomEllis);

    Actor laurenGerman = new Actor("Lauren German", "November 29, 1978");
    lucifer.addActor(laurenGerman);

    Actor kevinAlejandro = new Actor("Kevin Alejandro", "April 7, 1976");
    lucifer.addActor(kevinAlejandro);

    Actor dbWoodside = new Actor("D.B. Woodside", "July 25, 1969");
    lucifer.addActor(dbWoodside);

    Actor lesleyannBrandt = new Actor("Lesley-Ann Brandt", "December 2, 1981");
    lucifer.addActor(lesleyannBrandt);

    shows.add(lucifer);

  }

  public void printLucifer() {

    System.out.println(lucifer.getTitle());
    if (!lucifer.getAnimated()) {
      System.out.println("This show is live action");
    } else {
      System.out.println("This show is animated");
    }
    System.out.println(lucifer.getStars() + "/10 stars");
    System.out.println("Rating: " + lucifer.getRating());
    System.out.println("Cast:");
    for (int i = 0; i < lucifer.cast.size(); i++) {
      System.out.print(lucifer.cast.get(i).getName() + ", Birthdate: ");
      System.out.println(lucifer.cast.get(i).getBirthdate());
    }
    System.out.println("Number of seasons: " + lucifer.getSeasons());
    System.out.println("Start Date: " + lucifer.getStartDate());
    System.out.println("End Date: " + lucifer.getEndDate());
    System.out.println("Creator: " + lucifer.getCreator()); 

    System.out.println("Genres:");
    for (int i = 0; i < lucifer.genres.size(); i++) {
      System.out.print(lucifer.genres.get(i).getGenre() + ", ");
    }

  }

  public void createYou() {

    you.addGenre(TVShowsBasedOnBooks);
    you.addGenre(TVThrillers);
    you.addGenre(TVDramas);

    Actor pennBadgley = new Actor("Penn Badgley", "November 1, 1986");
    you.addActor(pennBadgley);

    Actor elizabethLail = new Actor("Elizabeth Lail", "March 25, 1992");
    you.addActor(elizabethLail);

    Actor victoriaPedretti = new Actor("Victoria Pedretti", "March 23, 1995");
    you.addActor(victoriaPedretti);

    Actor shayMitchell = new Actor("Shay Mitchell", "April 10, 1987");
    you.addActor(shayMitchell);

    Actor jennaOrtega = new Actor("Jenna Ortega", "September 27, 2002");
    you.addActor(jennaOrtega);

    shows.add(you);

  }

  public void printYou() {

    System.out.println(you.getTitle());
    if (!you.getAnimated()) {
      System.out.println("This show is live action");
    } else {
      System.out.println("This show is animated");
    }
    System.out.println(you.getStars() + "/10 stars");
    System.out.println("Rating: " + you.getRating());
    System.out.println("Cast:");
    for (int i = 0; i < you.cast.size(); i++) {
      System.out.print(you.cast.get(i).getName() + ", Birthdate: ");
      System.out.println(you.cast.get(i).getBirthdate());
    }
    System.out.println("Number of seasons: " + you.getSeasons());
    System.out.println("Start Date: " + you.getStartDate());
    System.out.println("End Date: " + you.getEndDate());
    System.out.println("Creator: " + you.getCreator()); 

    System.out.println("Genres:");
    for (int i = 0; i < you.genres.size(); i++) {
      System.out.print(you.genres.get(i).getGenre() + ", ");
    }

  }

  public void createCaos() {

    caos.addGenre(fantasyTVShows);
    caos.addGenre(TVShowsBasedOnComics);
    caos.addGenre(teenTVShows);
    caos.addGenre(teenTVShows);

    Actor kiernanShipka = new Actor("Kiernan Shipka", "November 10, 1999");
    caos.addActor(kiernanShipka);

    Actor rossLynch = new Actor("Ross Lynch", "December 29, 1995");
    caos.addActor(rossLynch);

    Actor mirandaOtto = new Actor("Miranda Otto", "December 16, 1967");
    caos.addActor(mirandaOtto);

    Actor lucyDavis = new Actor("Lucy Davis", "February 17, 1973");
    caos.addActor(lucyDavis);

    Actor chancePerdomo = new Actor("Chance Perdomo", "October 19, 1996");
    caos.addActor(chancePerdomo);

    shows.add(caos);

  }

  public void printCaos() {

    System.out.println(caos.getTitle());
    if (!caos.getAnimated()) {
      System.out.println("This show is live action");
    } else {
      System.out.println("This show is animated");
    }
    System.out.println(caos.getStars() + "/10 stars");
    System.out.println("Rating: " + caos.getRating());
    System.out.println("Cast:");
    for (int i = 0; i < caos.cast.size(); i++) {
      System.out.print(caos.cast.get(i).getName() + ", Birthdate: ");
      System.out.println(caos.cast.get(i).getBirthdate());
    }
    System.out.println("Number of seasons: " + caos.getSeasons());
    System.out.println("Start Date: " + caos.getStartDate());
    System.out.println("End Date: " + caos.getEndDate());
    System.out.println("Creator: " + caos.getCreator()); 

    System.out.println("Genres:");
    for (int i = 0; i < caos.genres.size(); i++) {
      System.out.print(caos.genres.get(i).getGenre() + ", ");
    }
    System.out.println();
    System.out.println();

  }

  // movies
  public void createSpiderverse() {

    spiderverse.addGenre(actionAdventure);
    spiderverse.addGenre(actionComedies);
    spiderverse.addGenre(adventures);
    spiderverse.addGenre(comicBookAndSuperHeroMovies);
    spiderverse.addGenre(comedies);

    Actor shameikMoore = new Actor("Shameik Moore", "May 4, 1995");
    spiderverse.addActor(shameikMoore);

    Actor jakeJohnson = new Actor("Jake Johnson", "May 28, 1978");
    spiderverse.addActor(jakeJohnson);

    Actor haileeSteinfeld = new Actor("Hailee Steinfeld", "December 11, 1996");
    spiderverse.addActor(haileeSteinfeld);

    Actor brianHenry = new Actor("Brian Tyree Henry", "March 31, 1982");
    spiderverse.addActor(brianHenry);

    Actor laurenVelez = new Actor("Lauren Vélez", "November 2, 1964");
    spiderverse.addActor(laurenVelez);

    movies.add(spiderverse);

  }

  public void printSpiderverse() {

    System.out.println(spiderverse.getTitle());
    if (!spiderverse.getAnimated()) {
      System.out.println("This movie is live action");
    } else {
      System.out.println("This movie is animated");
    }
    System.out.println(spiderverse.getStars() + "/10 stars");
    System.out.println("Rating: " + spiderverse.getRating());
    System.out.println("Cast:");
    for (int i = 0; i < spiderverse.cast.size(); i++) {
      System.out.print(spiderverse.cast.get(i).getName() + ", Birthdate: ");
      System.out.println(spiderverse.cast.get(i).getBirthdate());
    }
    System.out.println("Runtime: " + spiderverse.getRuntime() + " minutes");
    System.out.println("Release Date: " + spiderverse.getReleaseDate());
    System.out.println("Director: " + spiderverse.getDirector());

    System.out.println("Genres:");
    for (int i = 0; i < spiderverse.genres.size(); i++) {
      System.out.print(spiderverse.genres.get(i).getGenre() + ", ");
    }
    System.out.println();
    System.out.println();

  }

  public void createRobinHood() {

    robinHood.addGenre(actionAdventure);
    robinHood.addGenre(adventures);

    Actor taronEgerton = new Actor("Taron Egerton", "November 10, 1989");
    robinHood.addActor(taronEgerton);

    Actor jamieFoxx = new Actor("Jamie Foxx", "December 13, 1967");
    robinHood.addActor(jamieFoxx);

    Actor benMendelsohn = new Actor("Ben Mendelsohn", "April 3, 1969");
    robinHood.addActor(benMendelsohn);

    Actor eveHewson = new Actor("Eve Hewson", "July 7, 1991");
    robinHood.addActor(eveHewson);

    Actor jamieDornan = new Actor("Jamie Dornan", "May 1, 1982");
    robinHood.addActor(jamieDornan);

    movies.add(robinHood);

  }

  public void printRobinHood() {

    System.out.println(robinHood.getTitle());
    if (!robinHood.getAnimated()) {
      System.out.println("This movie is live action");
    } else {
      System.out.println("This movie is animated");
    }
    System.out.println(robinHood.getStars() + "/10 stars");
    System.out.println("Rating: " + robinHood.getRating());
    System.out.println("Cast:");
    for (int i = 0; i < robinHood.cast.size(); i++) {
      System.out.print(robinHood.cast.get(i).getName() + ", Birthdate: ");
      System.out.println(robinHood.cast.get(i).getBirthdate());
    }
    System.out.println("Runtime: " + robinHood.getRuntime() + " minutes");
    System.out.println("Release Date: " + robinHood.getReleaseDate());
    System.out.println("Director: " + robinHood.getDirector());

    System.out.println("Genres:");
    for (int i = 0; i < robinHood.genres.size(); i++) {
      System.out.print(robinHood.genres.get(i).getGenre() + ", ");
    }
    System.out.println();
    System.out.println();

  }

  public void createJohnnyEnglish() {

    johnnyEnglish.addGenre(british);
    johnnyEnglish.addGenre(actionAdventure);
    johnnyEnglish.addGenre(actionComedies);
    johnnyEnglish.addGenre(spyActionAdventure);
    johnnyEnglish.addGenre(satires);

    Actor rowanAtkinson = new Actor("Rowan Atkinson", "January 6, 1955");
    johnnyEnglish.addActor(rowanAtkinson);

    Actor natalieImbruglia = new Actor("Natalie Imbruglia", "February 4, 1975");
    johnnyEnglish.addActor(natalieImbruglia);

    Actor johnMalkovich = new Actor("John Malkovich", "December 9, 1953");
    johnnyEnglish.addActor(johnMalkovich);

    Actor tashaVasconcelos = new Actor("Tasha de Vasconcelos", "August 15, 1966");
    johnnyEnglish.addActor(tashaVasconcelos);

    Actor benMiller = new Actor("Ben Miller", "February 24, 1966");
    johnnyEnglish.addActor(benMiller);

    movies.add(johnnyEnglish);

  }

  public void printJohnnyEnglish() {

    System.out.println(johnnyEnglish.getTitle());
    if (!johnnyEnglish.getAnimated()) {
      System.out.println("This movie is live action");
    } else {
      System.out.println("This movie is animated");
    }
    System.out.println(johnnyEnglish.getStars() + "/10 stars");
    System.out.println("Rating: " + johnnyEnglish.getRating());
    System.out.println("Cast:");
    for (int i = 0; i < johnnyEnglish.cast.size(); i++) {
      System.out.print(johnnyEnglish.cast.get(i).getName() + ", Birthdate: ");
      System.out.println(johnnyEnglish.cast.get(i).getBirthdate());
    }
    System.out.println("Runtime: " + johnnyEnglish.getRuntime() + " minutes");
    System.out.println("Release Date: " + johnnyEnglish.getReleaseDate());
    System.out.println("Director: " + johnnyEnglish.getDirector());

    System.out.println("Genres:");
    for (int i = 0; i < johnnyEnglish.genres.size(); i++) {
      System.out.print(johnnyEnglish.genres.get(i).getGenre() + ", ");
    }
    System.out.println();
    System.out.println();

  }

  public void createJohnnyEnglishReborn() {

    johnnyEnglishReborn.addGenre(british);
    johnnyEnglishReborn.addGenre(familyFeatures);
    johnnyEnglishReborn.addGenre(familyComedies);
    johnnyEnglishReborn.addGenre(actionAdventure);
    johnnyEnglishReborn.addGenre(actionComedies);
    johnnyEnglishReborn.addGenre(spyActionAdventure);

    Actor rowanAtkinson = new Actor("Rowan Atkinson", "January 6, 1955");
    johnnyEnglishReborn.addActor(rowanAtkinson);

    Actor dominicWest = new Actor("Dominic West", "October 15, 1969");
    johnnyEnglishReborn.addActor(dominicWest);

    Actor gillianAnderson = new Actor("Gillian Anderson", "August 9, 1968");
    johnnyEnglishReborn.addActor(gillianAnderson);

    Actor rosamundPike = new Actor("Rosamund Pike", "January 27, 1979");
    johnnyEnglishReborn.addActor(rosamundPike);

    Actor danielKaluuya = new Actor("Daniel Kaluuya", "February 24, 1989");
    johnnyEnglishReborn.addActor(danielKaluuya);

    movies.add(johnnyEnglishReborn);

  }

  public void printJohnnyEnglishReborn() {

    System.out.println(johnnyEnglishReborn.getTitle());
    if (!johnnyEnglishReborn.getAnimated()) {
      System.out.println("This movie is live action");
    } else {
      System.out.println("This movie is animated");
    }
    System.out.println(johnnyEnglishReborn.getStars() + "/10 stars");
    System.out.println("Rating: " + johnnyEnglishReborn.getRating());
    System.out.println("Cast:");
    for (int i = 0; i < johnnyEnglishReborn.cast.size(); i++) {
      System.out.print(johnnyEnglishReborn.cast.get(i).getName() + ", Birthdate: ");
      System.out.println(johnnyEnglishReborn.cast.get(i).getBirthdate());
    }
    System.out.println("Runtime: " + johnnyEnglishReborn.getRuntime() + " minutes");
    System.out.println("Release Date: " + johnnyEnglishReborn.getReleaseDate());
    System.out.println("Director: " + johnnyEnglishReborn.getDirector());

    System.out.println("Genres:");
    for (int i = 0; i < johnnyEnglishReborn.genres.size(); i++) {
      System.out.print(johnnyEnglishReborn.genres.get(i).getGenre() + ", ");
    }
    System.out.println();
    System.out.println();

  }

  public void createJohnnyEnglishStrikesAgain() {

    johnnyEnglishStrikesAgain.addGenre(familyFeatures);
    johnnyEnglishStrikesAgain.addGenre(familyComedies);
    johnnyEnglishStrikesAgain.addGenre(actionAdventure);
    johnnyEnglishStrikesAgain.addGenre(actionComedies);
    johnnyEnglishStrikesAgain.addGenre(spyActionAdventure);
    johnnyEnglishStrikesAgain.addGenre(adventures);

    Actor rowanAtkinson = new Actor("Rowan Atkinson", "January 6, 1955");
    johnnyEnglishStrikesAgain.addActor(rowanAtkinson);

    Actor benMiller = new Actor("Ben Miller", "February 24, 1966");
    johnnyEnglishStrikesAgain.addActor(benMiller);

    Actor olgaKurylenko = new Actor("Olga Kurylenko", "November 14, 1979");
    johnnyEnglishStrikesAgain.addActor(olgaKurylenko);

    Actor jakeLacy = new Actor("Jake Lacy", "February 14, 1985");
    johnnyEnglishStrikesAgain.addActor(jakeLacy);

    Actor matthewBeard = new Actor("Matthew Beard", "March 25, 1989");
    johnnyEnglishStrikesAgain.addActor(matthewBeard);

    movies.add(johnnyEnglishStrikesAgain);

  }

  public void printJohnnyEnglishStrikesAgain() {

    System.out.println(johnnyEnglishStrikesAgain.getTitle());
    if (!johnnyEnglishStrikesAgain.getAnimated()) {
      System.out.println("This movie is live action");
    } else {
      System.out.println("This movie is animated");
    }
    System.out.println(johnnyEnglishStrikesAgain.getStars() + "/10 stars");
    System.out.println("Rating: " + johnnyEnglishStrikesAgain.getRating());
    System.out.println("Cast:");
    for (int i = 0; i < johnnyEnglishStrikesAgain.cast.size(); i++) {
      System.out.print(johnnyEnglishStrikesAgain.cast.get(i).getName() + ", Birthdate: ");
      System.out.println(johnnyEnglishStrikesAgain.cast.get(i).getBirthdate());
    }
    System.out.println("Runtime: " + johnnyEnglishStrikesAgain.getRuntime() + " minutes");
    System.out.println("Release Date: " + johnnyEnglishStrikesAgain.getReleaseDate());
    System.out.println("Director: " + johnnyEnglishStrikesAgain.getDirector());

    System.out.println("Genres:");
    for (int i = 0; i < johnnyEnglishStrikesAgain.genres.size(); i++) {
      System.out.print(johnnyEnglishStrikesAgain.genres.get(i).getGenre() + ", ");
    }
    System.out.println();
    System.out.println();

  }

  public void createElCamino() {

    elCamino.addGenre(dramas);
    elCamino.addGenre(crimeDramas);
    elCamino.addGenre(thrillerMovies);
    elCamino.addGenre(crimeThrillers);

    Actor aaronPaul = new Actor("Aaron Paul", "August 27, 1979");
    elCamino.addActor(aaronPaul);

    movies.add(elCamino);

  }

  public void printElCamino() {

    System.out.println(elCamino.getTitle());
    if (!elCamino.getAnimated()) {
      System.out.println("This movie is live action");
    } else {
      System.out.println("This movie is animated");
    }
    System.out.println(elCamino.getStars() + "/10 stars");
    System.out.println("Rating: " + elCamino.getRating());
    System.out.println("Cast:");
    for (int i = 0; i < elCamino.cast.size(); i++) {
      System.out.print(elCamino.cast.get(i).getName() + ", Birthdate: ");
      System.out.println(elCamino.cast.get(i).getBirthdate());
    }
    System.out.println("Runtime: " + elCamino.getRuntime() + " minutes");
    System.out.println("Release Date: " + elCamino.getReleaseDate());
    System.out.println("Director: " + elCamino.getDirector());

    System.out.println("Genres:");
    for (int i = 0; i < elCamino.genres.size(); i++) {
      System.out.print(elCamino.genres.get(i).getGenre() + ", ");
    }
    System.out.println();
    System.out.println();

  }

  public void createJurassicWorldFallenKingdom() {

    jurassicWorldFallenKingdom.addGenre(actionAdventure);
    jurassicWorldFallenKingdom.addGenre(adventures);
    jurassicWorldFallenKingdom.addGenre(scifiFantasy);
    jurassicWorldFallenKingdom.addGenre(actionScifiFantasy);
    jurassicWorldFallenKingdom.addGenre(scifiAdventure);

    Actor chrisPratt = new Actor("Chris Pratt", "June 21, 1979");
    jurassicWorldFallenKingdom.addActor(chrisPratt);

    Actor bryceDallasHoward = new Actor("Bryce Dallas Howard", "March 2, 1981");
    jurassicWorldFallenKingdom.addActor(bryceDallasHoward);

    Actor rafeSpall = new Actor("Rafe Spall", "March 10, 1983");
    jurassicWorldFallenKingdom.addActor(rafeSpall);

    Actor tedLevine = new Actor("Ted Levine", "May 29, 1957");
    jurassicWorldFallenKingdom.addActor(tedLevine);

    Actor tobyJones = new Actor("Toby Jones", "September 7, 1966");
    jurassicWorldFallenKingdom.addActor(tobyJones);

    movies.add(jurassicWorldFallenKingdom);

  }

  public void printJurassicWorldFallenKingdom() {

    System.out.println(jurassicWorldFallenKingdom.getTitle());
    if (!jurassicWorldFallenKingdom.getAnimated()) {
      System.out.println("This movie is live action");
    } else {
      System.out.println("This movie is animated");
    }
    System.out.println(jurassicWorldFallenKingdom.getStars() + "/10 stars");
    System.out.println("Rating: " + jurassicWorldFallenKingdom.getRating());
    System.out.println("Cast:");
    for (int i = 0; i < jurassicWorldFallenKingdom.cast.size(); i++) {
      System.out.print(jurassicWorldFallenKingdom.cast.get(i).getName() + ", Birthdate: ");
      System.out.println(jurassicWorldFallenKingdom.cast.get(i).getBirthdate());
    }
    System.out.println("Runtime: " + jurassicWorldFallenKingdom.getRuntime() + " minutes");
    System.out.println("Release Date: " + jurassicWorldFallenKingdom.getReleaseDate());
    System.out.println("Director: " + jurassicWorldFallenKingdom.getDirector());

    System.out.println("Genres:");
    for (int i = 0; i < jurassicWorldFallenKingdom.genres.size(); i++) {
      System.out.print(jurassicWorldFallenKingdom.genres.get(i).getGenre() + ", ");
    }
    System.out.println();
    System.out.println();

  }

  public void createVenom() {

    venom.addGenre(actionAdventure);
    venom.addGenre(adventures);
    venom.addGenre(comicBookAndSuperHeroMovies);
    venom.addGenre(scifiFantasy);
    venom.addGenre(actionScifiFantasy);
    venom.addGenre(scifiAdventure);

    Actor tomHardy = new Actor("Tom Hardy", "September 15, 1977");
    venom.addActor(tomHardy);

    Actor michelleWilliams = new Actor("Michelle Williams", "September 9, 1980");
    venom.addActor(michelleWilliams);

    Actor rizAhmed = new Actor("Riz Ahmed", "December 1, 1982");
    venom.addActor(rizAhmed);

    Actor scottHaze = new Actor("Scott Haze", "June 28, 1993");
    venom.addActor(scottHaze);

    Actor reidScott = new Actor("Reid Scott", "November 19, 1977");
    venom.addActor(reidScott);

    movies.add(venom);

  }

  public void printVenom() {

    System.out.println(venom.getTitle());
    if (!venom.getAnimated()) {
      System.out.println("This movie is live action");
    } else {
      System.out.println("This movie is animated");
    }
    System.out.println(venom.getStars() + "/10 stars");
    System.out.println("Rating: " + venom.getRating());
    System.out.println("Cast:");
    for (int i = 0; i < venom.cast.size(); i++) {
      System.out.print(venom.cast.get(i).getName() + ", Birthdate: ");
      System.out.println(venom.cast.get(i).getBirthdate());
    }
    System.out.println("Runtime: " + venom.getRuntime() + " minutes");
    System.out.println("Release Date: " + venom.getReleaseDate());
    System.out.println("Director: " + venom.getDirector());

    System.out.println("Genres:");
    for (int i = 0; i < venom.genres.size(); i++) {
      System.out.print(venom.genres.get(i).getGenre() + ", ");
    }
    System.out.println();
    System.out.println();

  }

  public void createJurassicWorldCampCretaceous() {

    jurassicWorldCampCretaceous.addGenre(actionAdventure);
    jurassicWorldCampCretaceous.addGenre(adventures);
    jurassicWorldCampCretaceous.addGenre(comicBookAndSuperHeroMovies);
    jurassicWorldCampCretaceous.addGenre(scifiFantasy);
    jurassicWorldCampCretaceous.addGenre(actionScifiFantasy);
    jurassicWorldCampCretaceous.addGenre(scifiAdventure);

    Actor paulWilliams = new Actor("Paul-Mikél Williams", "Unknown");
    jurassicWorldCampCretaceous.addActor(paulWilliams);

    Actor jennaOrtega = new Actor("Jenna Ortega", "September 27, 2002");
    jurassicWorldCampCretaceous.addActor(jennaOrtega);

    Actor seanGiambrone = new Actor("Sean Giambrone", "May 30, 1999");
    jurassicWorldCampCretaceous.addActor(seanGiambrone);

    Actor kausarMohammed = new Actor("Kausar Mohammed", "Unkown");
    jurassicWorldCampCretaceous.addActor(kausarMohammed);

    Actor ryanPotter = new Actor("Ryan Potter", "September 12, 1995");
    jurassicWorldCampCretaceous.addActor(ryanPotter);

    shows.add(jurassicWorldCampCretaceous);

  }

  public void printJurassicWorldCampCretaceous() {

    System.out.println(jurassicWorldCampCretaceous.getTitle());
    if (!jurassicWorldCampCretaceous.getAnimated()) {
      System.out.println("This show is live action");
    } else {
      System.out.println("This show is animated");
    }
    System.out.println(jurassicWorldCampCretaceous.getStars() + "/10 stars");
    System.out.println("Rating: " + jurassicWorldCampCretaceous.getRating());
    System.out.println("Cast:");
    for (int i = 0; i < jurassicWorldCampCretaceous.cast.size(); i++) {
      System.out.print(jurassicWorldCampCretaceous.cast.get(i).getName() + ", Birthdate: ");
      System.out.println(jurassicWorldCampCretaceous.cast.get(i).getBirthdate());
    }
    System.out.println("Number of seasons: " + jurassicWorldCampCretaceous.getSeasons());
    System.out.println("Start Date: " + jurassicWorldCampCretaceous.getStartDate());
    System.out.println("End Date: " + jurassicWorldCampCretaceous.getEndDate());
    System.out.println("Creator: " + jurassicWorldCampCretaceous.getCreator()); 

    System.out.println("Genres:");
    for (int i = 0; i < jurassicWorldCampCretaceous.genres.size(); i++) {
      System.out.print(jurassicWorldCampCretaceous.genres.get(i).getGenre() + ", ");
    }

  }

}