import java.io.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class MainProgram {

  public static void main(String args[]) throws IOException {

    Info info = new Info();
    MyList myList = new MyList();
    String choice;
    boolean run = true;
    
    info.createBreakingBad();
    info.createBrooklyn99();
    info.createLucifer();
    info.createYou();
    info.createCaos();
    info.createSpiderverse();
    info.createJurassicWorldCampCretaceous();

    info.createSpiderverse();
    info.createRobinHood();
    info.createJohnnyEnglish();
    info.createJohnnyEnglishReborn();
    info.createJohnnyEnglishStrikesAgain();
    info.createElCamino();
    info.createJurassicWorldFallenKingdom();
    info.createVenom();

    //Collections.sort(info.shows);
    //Collections.sort(info.movies);

    System.out.println("Shows:");
    for (int i = 0; i < info.shows.size(); i++) {

      System.out.println(info.shows.get(i).getTitle());

    }
    System.out.println();

    System.out.println("Movies:");
    for (int i = 0; i < info.movies.size(); i++) {

      System.out.println(info.movies.get(i).getTitle());

    }
    System.out.println();
    
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    while (run) {

      System.out.println();
      System.out.println();

      choice = "";

      System.out.println("Choose a show to see info or watch (type name exactly to watch, put the word 'info' before title to view info), or type 'my list' to view your list, or type 'view productions' to see the list of movies and shows again, or type 'recommend' to get recommended shows for you, or type 'exit' to exit.");
      choice = keyboard.readLine();

      if (choice.equalsIgnoreCase("exit")) {

        run = false;

      } else if (choice.equalsIgnoreCase("breaking bad")) {

        System.out.println();
        info.breakingBad.play(info.breakingBad.getTitle());
        myList.addProduction(info.breakingBad);

      } else if (choice.equalsIgnoreCase("info breaking bad")) {

        System.out.println();
        System.out.println();
        info.printBreakingBad();

      } else if (choice.equalsIgnoreCase("brooklyn nine-nine")) {

        System.out.println();
        info.brooklyn99.play(info.brooklyn99.getTitle());
        myList.addProduction(info.brooklyn99);

      } else if (choice.equalsIgnoreCase("info brooklyn nine-nine")) {

        System.out.println();
        System.out.println();
        info.printBrooklyn99();

      } else if (choice.equalsIgnoreCase("lucifer")) {

        System.out.println();
        info.lucifer.play(info.lucifer.getTitle());
        myList.addProduction(info.lucifer);

      } else if (choice.equalsIgnoreCase("info lucifer")) {

        System.out.println();
        System.out.println();
        info.printLucifer();

      } else if (choice.equalsIgnoreCase("you")) {

        System.out.println();
        info.you.play(info.you.getTitle());
        myList.addProduction(info.you);

      } else if (choice.equalsIgnoreCase("info you")) {

        System.out.println();
        System.out.println();
        info.printYou();

      } else if (choice.equalsIgnoreCase("chilling adventures of sabrina")) {

        System.out.println();
        info.caos.play(info.caos.getTitle());
        myList.addProduction(info.caos);

      } else if (choice.equalsIgnoreCase("info chilling adventures of sabrina")) {

        System.out.println();
        System.out.println();
        info.printCaos();

      } else if (choice.equalsIgnoreCase("spider-man: into the spider-verse")) {

        System.out.println();
        info.spiderverse.play(info.spiderverse.getTitle());
        myList.addProduction(info.spiderverse);

      } else if (choice.equalsIgnoreCase("info spider-man: into the spider-verse")) {

        System.out.println();
        System.out.println();
        info.printSpiderverse();

      } else if (choice.equalsIgnoreCase("jurassic world camp cretaceous")) {

        System.out.println();
        info.jurassicWorldCampCretaceous.play(info.jurassicWorldCampCretaceous.getTitle());
        myList.addProduction(info.jurassicWorldCampCretaceous);

      } else if (choice.equalsIgnoreCase("info jurassic world camp cretaceous")) {

        System.out.println();
        System.out.println();
        info.printJurassicWorldCampCretaceous();

      } else if (choice.equalsIgnoreCase("robin hood")) {

        System.out.println();
        info.robinHood.play(info.robinHood.getTitle());
        myList.addProduction(info.robinHood);

      } else if (choice.equalsIgnoreCase("info robin hood")) {

        System.out.println();
        System.out.println();
        info.printRobinHood();

      } else if (choice.equalsIgnoreCase("johnny english")) {

        System.out.println();
        info.johnnyEnglish.play(info.johnnyEnglish.getTitle());
        myList.addProduction(info.johnnyEnglish);

      } else if (choice.equalsIgnoreCase("info johnny english")) {

        System.out.println();
        System.out.println();
        info.printJohnnyEnglish();

      } else if (choice.equalsIgnoreCase("johnny english reborn")) {

        System.out.println();
        info.johnnyEnglishReborn.play(info.johnnyEnglishReborn.getTitle());
        myList.addProduction(info.johnnyEnglishReborn);

      } else if (choice.equalsIgnoreCase("info johnny english reborn")) {

        System.out.println();
        System.out.println();
        info.printJohnnyEnglishReborn();

      } else if (choice.equalsIgnoreCase("johnny english strikes again")) {

        System.out.println();
        info.johnnyEnglishStrikesAgain.play(info.johnnyEnglishStrikesAgain.getTitle());
        myList.addProduction(info.johnnyEnglishStrikesAgain);

      } else if (choice.equalsIgnoreCase("info johnny english strikes again")) {

        System.out.println();
        System.out.println();
        info.printJohnnyEnglishStrikesAgain();

      } else if (choice.equalsIgnoreCase("el camino: a breaking bad movie")) {

        System.out.println();
        info.elCamino.play(info.elCamino.getTitle());
        myList.addProduction(info.elCamino);

      } else if (choice.equalsIgnoreCase("info el camino: a breaking bad movie")) {

        System.out.println();
        System.out.println();
        info.printElCamino();

      } else if (choice.equalsIgnoreCase("jurassic world: fallen kingdom")) {

        System.out.println();
        info.jurassicWorldFallenKingdom.play(info.jurassicWorldFallenKingdom.getTitle());
        myList.addProduction(info.jurassicWorldFallenKingdom);

      } else if (choice.equalsIgnoreCase("info jurassic world: fallen kingdom")) {

        System.out.println();
        System.out.println();
        info.printJurassicWorldFallenKingdom();

      } else if (choice.equalsIgnoreCase("venom")) {

        System.out.println();
        info.venom.play(info.venom.getTitle());
        myList.addProduction(info.venom);

      } else if (choice.equalsIgnoreCase("info venom")) {

        System.out.println();
        System.out.println();
        info.printVenom();

      } else if (choice.equalsIgnoreCase("my list")) {
        System.out.println();
        for (int i = 0; i < myList.productionsSeen.size(); i++) {

          System.out.println(myList.productionsSeen.get(i).getTitle());

        }

      } else if (choice.equalsIgnoreCase("view productions")) {

        System.out.println();
        System.out.println("Shows:");
        for (int i = 0; i < info.shows.size(); i++) {

          System.out.println(info.shows.get(i).getTitle());

        }
        System.out.println();

        System.out.println("Movies:");
        for (int i = 0; i < info.movies.size(); i++) {

          System.out.println(info.movies.get(i).getTitle());

        }
        System.out.println();

      } else if (choice.equalsIgnoreCase("recommend")) {

        System.out.println();
        System.out.println("Recommended movies and shows for you:");
        System.out.println(myList.getReccomendations());
        System.out.println(myList.getMovieReccomendations());

      } else {

        System.out.println();
        System.out.println("Error. Make sure everything is typed exactly as shown (capitals don't matter)");

      }

    }

  }

}