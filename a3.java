import java.util.Random;
import java.util.Scanner;

class a3{
    public static void main(String[] args){
        System.out.println("Who are you?");
        Scanner s = new Scanner(System.in);
        System.out.print(">");
        String name = s.nextLine();
        System.out.println("Hello, "+name+"!");
    System.out.println("Tossing a coin...");

    Random rand = new Random();
    String[] coins = {"Heads", "Tails"};

    int p=0;
    int q=0;

    for(int i=1;i<=3;i++){
        String coin = coins[rand.nextInt(2)];
        System.out.println("Round "+i+": "+coin);
        if(coin=="Heads"){
            p++;
        }else{
            q++;
        }
    }

    System.out.print("Heads: "+p);
    System.out.print(", ");
    System.out.println("Tails: "+q);

    if(p>q){
        System.out.println("You won!");
    }else{
        System.out.println("You lost!");
    }
    }
}