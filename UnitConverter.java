
import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Convert x = new Convert();       
        System.out.println(x.CF(25,-1));

    }
}
// (num, -i represent from or +i represent to)
class Convert {
    public double CF(double x, double y){
        if (y < 0){
            return 5.0/9 * (x - 32);
        }
        else if (y > 0){
            return x * 9.0/5 + 32;
        }
        else{
            throw new IllegalArgumentException("y must be positive or negative");
        }
    }
}
