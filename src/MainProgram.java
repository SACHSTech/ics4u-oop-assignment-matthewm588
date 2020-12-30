import java.io.*;

public class MainProgram {
  public static void main(String args[]) throws IOException {

    Series series = new Series("Title", 9.5, "TV-MA", 5, "January 1, 2010", "September 19, 2015", "Creator");

    System.out.println(series.getTitle());
    
  }
}