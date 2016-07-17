
/***********************************
 * 
 ** Project0.java
 ** Muhammad Islam
 **	Lec 212-11; Lab 212-11A
 ** CS, Queens College
 *
 ***********************************/

import javax.swing.*;

/**
 * Asks user to input a sentence, calculates the number of upper case e and
 * lower case e on the sentence and displays it. All input and output are done
 * on standard pop up dialog box instead of using console.
 * 
 * Consists of one class Project0, one main method and one static method
 * checkLetter. The main method asks for the input, calls the checkLetter method
 * and displays the output. checkLetter method takes in two arguments; a
 * character (e or E) and a string to compute number of matches with the
 * character.
 */

public class Project0 {

   public static void main(String args[]) {

      // out_e for lower case and out_E for upper case output string.
      String out_e, out_E;
      
      //to ask the user for continuous input
      while(true){
         // input from user by dialog box
         String in = JOptionPane.showInputDialog("Please enter a sentence: ");
         
         if(in.equalsIgnoreCase("stop")) System.exit(0);    //if user inputs stop program execution stops. Not case sensitive.  
         
         /*
          * sends e or E(char) and in(string variable) as arguments to
          * checkLetter(method) which returns an integer. The integer is
          * concatenated with the String literal at the beginning.
          */
         out_e = "Number of lower case e's: " + checkLetter('e', in);
         out_E = "Number of upper case e's: " + checkLetter('E', in);
   
         // Final output
         JOptionPane.showMessageDialog(null, out_e + "\n" + out_E);
      }
   }
   /* End of main method */

   /*
    * Receives a character and a string from the main function and returns
    * an integer which is the number of e or E in the string.
    */
   public static int checkLetter(char ch, String st) {

      int counter = 0; // for counting matches

      // checks every element of the string for matches
      for (int i = 0; i < st.length(); i++) {
         if (st.charAt(i) == ch)
            counter++;  // increment by 1
      } // loop end

      return counter; // integer
   } 
   /* End of checkLetter method */
}
