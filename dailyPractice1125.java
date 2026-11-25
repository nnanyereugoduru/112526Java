
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
        Stats s = new Stats(num);
        System.out.println(s.findPeak(3));
        System.out.println(s.findPercentage(2)); 
        input.close();

       
    }
}

class Stats{
    private ArrayList<Integer> num;

    public Stats(ArrayList<Integer> x){
        this.num = new ArrayList<>(x);
    }
    public  double findAvg(){
        double total = 0;
        for (int i : num){
            total += i;
        }
        return total / num.size();
    }

    public ArrayList<Double> subFromAll(double x){
        ArrayList<Double> y = new ArrayList<>();
        for (int i : num){
           y.add(i - x);
        }
        return y;
    }
    
    public ArrayList<Double> addToAll(double x){
        ArrayList<Double> y = new ArrayList<>();
        for (int i : num){
           y.add(i + x);
        }
        return y;
    }

    public int findPeak(){
        return maximum(num);
    }
    public int findTotal(){
        return addAll(num);
    }

    public static int maximum(ArrayList<Integer> x){
        int max = x.get(0);
        for (int i : x){
            if (max < i){
                max = i;
            }
        }
        return max;
    }
    public static int addAll(ArrayList<Integer> x){
        int total = 0;
        for (int i : x){
            total += i;
        }
        return total;
    }
    
    public ArrayList<Integer> findPeak(int step){
        ArrayList<Integer> y = new ArrayList<>();
        ArrayList<Integer> z = new ArrayList<>();
        for (int i : num){
            y.add(i);
            if (y.size() == step){
                z.add(maximum(y));
                y.clear();
            }
        }
        if (!y.isEmpty()){
            z.add(maximum(y));
        }     
        return z;    
    }
    public double findPercentage(int target){
        int count = 0;
        for (int i : num){
            if (i == target) count++; 
        }
      return 100.0 * count/num.size();
    }
}
