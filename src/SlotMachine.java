import java.util.Random;

public class SlotMachine implements DataTraverser{
    private int coins;
    Random rand = new Random();
    public SlotMachine() {
        int initialCoins = coins;
        coins = rand.nextInt(10);
    }
        public int next(){
            if(rand.nextInt(2) == 0){
                coins++;

            }
                coins--;
                 return coins;

        }
        public boolean hasNext() {
            while (coins > 0) {
                if (coins <= 0) {
                    return false;
                }
                else
                    return true;
            }
        }
        public int iterator(){
            if(true){
                next() + 2;
                System.out.println("You win");
                
            }
            else(false){
                next() - 2;
                System.out.println("You lose");
            }
            return next();
    }
    public int remove(){
        coins--;
        for(next() <= coins){
            coins--;
                return coins;
}
