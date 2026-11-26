import java.util.ArrayList;
import java.util.Scanner;

public class RandomNumberGen {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Guesser user = new Guesser(); 
       
        do {
            System.out.print("Enter random number: =>");
        } while (!user.Guess(input.nextInt()));
        System.out.println("you got it");
      
    }   
}
class Guesser {
    private ArrayList<Integer> a;
    private int random = (int)(Math.random()*100);
    public Guesser() {
        this.a = new ArrayList<>();
    }
    public boolean Guess(int x){
        Alreadyguessed(x);
        if (x == random){
            return true;
        }
        a.add(x);
        return false;
    } 
      public boolean Guess(){
        return false;
    } 

    public void Alreadyguessed(int x){
        if (a.contains(x)){
            System.out.println("Already guessed");
        }
        else {
            System.out.println("new guess");
        }
    }     
}
