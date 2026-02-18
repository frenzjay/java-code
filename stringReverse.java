import java.util.Scanner;

public class stringReverse {
  public static void main(String[] args) {
    Scanner gwapo = new Scanner(System.in);
    
    boolean isRunning = true;
    while (isRunning) {
      System.out.print("Enter a word: ");
      String word = gwapo.nextLine();

      String reversed = "";

      for (int i = word.length() - 1; i >= 0; i--){
        reversed += word.charAt(i);
      } System.out.println(reversed);
      if (reversed.equals("quit")){
        isRunning = false;
    } 
    }



  }
}
