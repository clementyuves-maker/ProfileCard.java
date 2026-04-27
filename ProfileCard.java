// This is the name of our class. In Java, the file name must match this name.
public class ProfileCard {
    
    // This is the main method. It is the starting point where the computer begins running the code.
    public static void main(String[] args) {
        
        // --- DATA SECTION: Storing information in Variables ---
        
        // We use 'String' to store text data. 
        String firstName = "CLEMENT";
        String lastName =  "YUVES";

        // This stores the unique identification number for school.
        String studentId = "2024-04-11679";

        // Storing the current academic level.
        String yearOfStudy = "2nd Year";

        // Describing past experience with coding languages.
        String programmingBackground = "Beginner in Java, familiar with Python";

        // Storing the primary objective for taking this course.
        String courseGoal = "i want to build strong java application";

        // A little personal detail to make the profile unique!
        String funFact = "I enjoy solving coding challanges";

        
        // --- OUTPUT SECTION: Printing the profile card to the console ---
        
        // Printing the top border of the card
        System.out.println("=================================================");
        System.out.println(" CS 234 - JAVA PROFILE CARD         ");
        System.out.println("=================================================");
        
        // Printing the variables. The '+' sign combines (concatenates) the text and the variable.
        System.out.println(" firstName             : " + firstName            );
        System.out.println(" lastName              : " + lastName             );
        System.out.println(" Student ID            : " + studentId            );
        
        System.out.println(" Year of Study         : " + yearOfStudy          );
        System.out.println("=================================================");
        System.out.println(" Programming Background: " + programmingBackground);
        System.out.println("=================================================");
            
        System.out.println(" Course Goal           : " + courseGoal           );
        System.out.println("=================================================");
        System.out.println(" Fun Fact              : " + funFact              );
        
        // Printing the bottom border of the card
        System.out.println("==================================================");
        
    } // End of main method
} // End of class
