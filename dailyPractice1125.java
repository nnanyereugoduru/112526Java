
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
        //System.out.println(findAvg(num));
        //System.out.println(subFromAll(num, 3.4));
        System.out.println(findPeak(num, 4));
        input.close();
    }

    public static double findAvg(ArrayList<Integer> x){
        double total = 0;
        for (int i : x){
            total += i;
        }
        return total / x.size();
    }

    public static ArrayList<Double> subToAll(ArrayList<Integer> x, double num){
        ArrayList<Double> y = new ArrayList<>();
        for (int i : x){
           y.add(i - num);
        }
        return y;
    }
    
    public static ArrayList<Double> addToAll(ArrayList<Integer> x, double num){
        ArrayList<Double> y = new ArrayList<>();
        for (int i : x){
           y.add(i + num);
        }
        return y;
    }

    public static int findPeak(ArrayList<Integer> x){
        int y = x.get(0);
        for (int c : x){
             if (c > y){
                y = c;
             }
        }
        return y; 
    }
    
    public static ArrayList<Integer> findPeak(ArrayList<Integer> x, int step){
        ArrayList<Integer> y = new ArrayList<>();
        ArrayList<Integer> z = new ArrayList<>();
        for (int i : x){
            y.add(i);
            if (y.size() == step){
                z.add(findPeak(y));
                y.clear();
            }
        }
        if (!y.isEmpty()){
            z.add(findPeak(y));
        }     
        return z;    
    }
}
