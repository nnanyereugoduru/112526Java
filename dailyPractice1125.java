
import java.util.Scanner;
import java.util.ArrayList;

// extended math array functions
public class dailyPractice1125 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();
        System.out.println("Enter integers and type a non number to end");
        while (input.hasNext()){
            if (input.hasNextInt()) {num.add(input.nextInt());}
            else {break;}
        }
        System.out.println(findAvg(num));
        System.out.println(subFromAll(num, 3.3));
        input.close();
    }

    public static double findAvg(ArrayList<Integer> x){
        double total = 0;
        for (int i : x){
            total = total + i;
        }
        return total / x.size();
    }

    public static ArrayList<Double> subFromAll(ArrayList<Integer> x, double num){
        ArrayList<Double> y = new ArrayList<>();
        for (int i : x){
           y.add(i - num);
        }
        return y;
    }
    
    public static ArrayList<Double> addFromAll(ArrayList<Integer> x, double num){
        ArrayList<Double> y = new ArrayList<>();
        for (int i : x){
           y.add(i + num);
        }
        return y;
    }
    
}
