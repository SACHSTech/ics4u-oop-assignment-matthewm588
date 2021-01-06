/**
* A program Actor.java that creates an Actor object with a name and birthdate.
* @author Matthew Morelli
*
*/
public class Actor {

  private String name;
  private String birthdate;

  /**
  * Creates an actor object
  *
  * @param theName  The name of the actor
  * @param theBirthdate  The date of birth of the actor
  */
  public Actor(String theName, String theBirthdate) {

    this.name = theName;
    this.birthdate = theBirthdate;

  }

  /**
  * Gets the name of the actor
  *
  * @return The actor's name
  */
  public String getName() {
    return this.name;
  }

  /**
  * Gets the birthdate of the actor
  *
  * @return The actor's date of birth
  */
  public String getBirthdate() {
    return this.birthdate;
  }

}