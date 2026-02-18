import java.util.Scanner;

public class fibonacci {
  public static void main(String[] args) {
    Scanner gwapo = new Scanner(System.in);
    System.out.print("Enter term: ");
    int howMany = gwapo.nextInt();
    int fn = 1;
    int sn = 1;

    for (int i = 1; i <= howMany; i++){
        System.out.print(fn + " ");
        int sum = fn + sn;
        fn = sn;
        sn = sum;
    }



  }
}
