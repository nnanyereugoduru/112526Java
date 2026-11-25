import java.util.ArrayList;
import java.util.Scanner;

public class arraylistdev1 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    ArrayList<Integer> num = new ArrayList<>();

    System.out.println("Enter several numbers enter a non-number to stop: ");
    while (input.hasNext()) {
        if (input.hasNextInt()) {
            num.add(input.nextInt());
        } else {
            break;
        }
    }
    num.sort(null);
    num = removeDubplicate(num);
    System.out.println("Numbers entered: " + num);
    }
    public static ArrayList<Integer> removeDubplicate(ArrayList<Integer> list){
        ArrayList<Integer> newList = new ArrayList<>();
        for (Integer num : list) {
            if (!newList.contains(num)){
                newList.add(num);
            }
        }
        return newList;
    }
    
}