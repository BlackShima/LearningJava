

public class deposit {
    
    public static void main(String[] args) {
        
        int totalsaving = 0;
        int dailysaving = 1;

        for(int day = 1, k = 0; day <= 30; day++ , k++){
            dailysaving = (int) Math.pow(2, k);
            totalsaving = totalsaving + dailysaving;

            System.out.println("Total savings by April: " + day + " deposit: " + dailysaving + " total is: " + totalsaving);
        }
    }
}
