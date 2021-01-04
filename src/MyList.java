import java.util.Arrays;
import java.util.ArrayList;

public class MyList {

  ArrayList<Production> productionsSeen = new ArrayList<Production>();

  public void addProduction(Production production) {
    productionsSeen.add(production);
  }

}