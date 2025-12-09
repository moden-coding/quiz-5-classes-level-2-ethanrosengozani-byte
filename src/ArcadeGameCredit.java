import java.util.Scanner;
public class ArcadeGameCredit {
private String gameName;   //what the game name is //we make evrthing private always 
private int credits;      // how many credits the user can spend
private int costPerPlay;      // how many credits one play costs
private int playsCompleted;    //how many plays happened so far
private int amountToAdd;//will be used later on ADDED CODE
    public ArcadeGameCredit(String givenGameName, int initialCredits, int initialCostPerPlay)//everthing is given in the main method here we jsut say waht cost what
    {
        gameName = givenGameName;
        if (initialCredits < 0) {
            credits = 0;
            System.out.println("Invalid initial credits. Setting to 0.");
        } else {
            credits = initialCredits;//makes it so the intital cost is now a new varible credits that we can use 
        }
        if (initialCostPerPlay <= 0) {// if cost per play is 0 or negative
            costPerPlay = 1;// if cost per play is 0 or negative set to 1
            System.out.println("Invalid cost per play. Setting to 1.");
        } else {
            costPerPlay = initialCostPerPlay;// else set to initial cost per play
        }
        playsCompleted = 0; // start at 0
        System.out.println("Arcade game created: " + gameName);//prints what game was created

    }
    public int getcredits(){//how many creidts we have
        return credits;
        
    }
    public int costPerPlay(){//how much it cost
        return costPerPlay;
    }

    public int getPlaysCompleted()//how many times we played
    {
        return playsCompleted; // returns plays completed
    }
    public String toString()//returns all the info but in a String
    {
        return gameName + ": " + credits + " credits, cost per play " + costPerPlay + ", plays completed " + playsCompleted;//returns all our varibles
    }
    public void playOnce()
    {
        if (credits >= costPerPlay) {//if the user has enough credits to play then do it 
            credits -= costPerPlay;// minus the cost per play from credits
            playsCompleted++; // playsCompleted will add one to the total
            System.out.println("You played the game! Hope you had fun!");
        } if(credits <= costPerPlay) {
            System.out.println("Not enough credits to play. Not doing anyhting");
            System.out.println("Do you want to add credits?");//Added code
            Scanner scanner = new Scanner(System.in);//added code
            System.out.print("Enter amount to add: ");//added code
            int amountToAdd = scanner.nextInt();//added code also if i am not wrong we do nextInt becuase we are getting a Int
            credits += amountToAdd;//added code
            if(amountToAdd > 20){//addded code
                System.out.println("You cant add that many! maxmimum is 15!");//added code
                amountToAdd = 15;//added code
            }
            System.out.println("Added " + amountToAdd + " credits.");//added code
        }
    }
    public  int getTotalCreditsUsed(){
        return costPerPlay * playsCompleted;//for A+ level returns how many credits we used by doing how muchh it costed per play then multiplying that by how many times we played to get out Int

    }

}


