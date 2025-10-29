import java.util.Scanner;
public class JavaCalc {
    public static void main(String []args) {
        Scanner gwapo = new Scanner(System.in);
        // double ang gamit, pag int mo ug ganahan mo
        double fn, sn, eq;
        
        System.out.print("Enter mode (+, -, *, /): ");
        char mode = gwapo.next().charAt(0);
        
        System.out.print("First num: ");
        fn = gwapo.nextDouble();
        
        System.out.print("Second num: ");
        sn = gwapo.nextDouble();
        
        // switch statement, meaning ug unsa ang operator nga gi enter, mao uy case
        switch(mode) {
        // if maka code naka aning case system, i copy paste nana ditso HAHAHHA
            case '+':
            eq = fn + sn;
            System.out.println(fn + " + " + sn + " = " + eq);
            break;
   
            case '-':
            eq = fn - sn;
            System.out.println(fn + " - " + sn + " = " + eq);
            break;
            
            case '*':
            eq = fn * sn;
            System.out.println(fn + " * " + sn + " = " + eq);
            break;
            //dili ma divide and zero (FREEZE!), kapoy mag if else
            case '/':
            eq = fn + sn;
            System.out.println(fn + " / " + sn + " = " + eq);
            break;
        }
    }
}