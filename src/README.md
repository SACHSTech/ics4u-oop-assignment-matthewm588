# Class Diagram

![alt text](https://github.com/SACHSTech/ics4u-oop-assignment-matthewm588/blob/main/src/classDiagram.png "Class Diagram")

## Summary

This system allows the user to choose shows to watch from a list of series and movies.  The user can also view information about each show/movie if they want to.  Whenever a user watches a show or movie, it will get added to their list of movies and shows they have watched, and then the user can choose to get recommendations based on what they have watched.

The "Series" and "Movie" classes both extend the "Production" class.  The Production class has an array list of Actors and Genres, and has a "MyList."  The MyList class has an array of Productions that the user has watched.  It also contains a method that will recommend shows and movies for the user, comparing what they have watched to other shows or movies of similar cast or genre.  The Production class also has an asbtract method called "play" in order to ensure that all child classes of Production have a play method, so that you can play the production.

The "MainProgram" class is where the main method is, where the user will be inputting what they would like to do.

The "Info" class is there in order to make the MainProgram class not be jammed with thousands of lines of code, and makes the MainProgram much neater.