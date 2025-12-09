import java.util.Scanner;
public class App {
        public static void main(String[] args) {
                System.out.println("=== ArcadeGameCredit Quiz Tester ===\n");

                // -----------------------------
                // B / B+ LEVEL: constructor, toString, playOnce()
                // -----------------------------
                System.out.println("--- B / B+ LEVEL TESTS ---");
                ArcadeGameCredit gameA = new ArcadeGameCredit("Dance Machine", 6, 2);

                System.out.println("Initial gameA (should show Dance Machine, 6 credits, cost per play 2):");
                System.out.println(gameA);

                System.out.println("\nPlaying gameA once...");
                gameA.playOnce(); // ignore return; only side effect matters
                System.out.println("After 1st play (credits should be 4):");
                System.out.println(gameA);

                System.out.println("\nPlaying gameA two more times...");
                gameA.playOnce(); // credits should go from 4 to 2
                gameA.playOnce(); // credits should go from 2 to 0
                System.out.println("After 3rd play total (credits should now be 0):");
                System.out.println(gameA);

                System.out.println("\nTrying to play gameA with 0 credits (credits should stay 0):");
                gameA.playOnce(); // should do nothing
                System.out.println("After attempting play with no credits:");
                System.out.println(gameA);
                System.out.println();

                // -----------------------------
                // A- LEVEL: constructor validation
                // -----------------------------
                // System.out.println("--- A- LEVEL TESTS (constructor validation) ---");
                // ArcadeGameCredit gameB = new ArcadeGameCredit("Pinball", -5, 0);

                // System.out.println("Created gameB with negative credits and non-positive costPerPlay:");
                // System.out.println(gameB);
                // System.out.println("Expected: credits should be 0; costPerPlay should be 1.\n");

                // -----------------------------
                // A LEVEL: playsCompleted + playOnce() change
                // -----------------------------
                // System.out.println("--- A LEVEL TESTS (playsCompleted tracking) ---");
                // ArcadeGameCredit gameC = new ArcadeGameCredit("Racing Game", 10, 3);

                // System.out.println("Initial gameC (before any plays):");
                // System.out.println(gameC);

                // System.out.println("\nPlaying gameC three times...");
                // gameC.playOnce(); // 10 -> 7
                // gameC.playOnce(); // 7 -> 4
                // gameC.playOnce(); // 4 -> 1 (not enough for another full play)
                // System.out.println("After 3 plays, gameC:");
                // System.out.println(gameC);

                // System.out.println("\nTrying to play gameC again (only 1 credit left; cost is 3):");
                // gameC.playOnce(); // should do nothing
                // System.out.println("After attempting extra play, gameC:");
                // System.out.println(gameC);
                // System.out.println(
                //                 "If you chose to show playsCompleted in toString(), it should match the number of successful plays.\n");

                // -----------------------------
                // A+ LEVEL: getTotalCreditsUsed()
                // -----------------------------
                System.out.println("--- A+ LEVEL TESTS (getTotalCreditsUsed) ---");
                ArcadeGameCredit gameD = new ArcadeGameCredit("Shooting Game", 15, 5);

                System.out.println("Initial gameD:");
                System.out.println(gameD);

                System.out.println("\nPlaying gameD twice...");
                gameD.playOnce(); // 15 -> 10
                gameD.playOnce(); // 10 -> 5
                System.out.println("After 2 plays, gameD:");
                System.out.println(gameD);

                int totalUsed = gameD.getTotalCreditsUsed();
                System.out.println("\nGameD getTotalCreditsUsed() returned: " + totalUsed);
                System.out.println(
                                "Expected total credits used: 2 * 5 = 10 (if playsCompleted and costPerPlay are correct).");


        }

}
