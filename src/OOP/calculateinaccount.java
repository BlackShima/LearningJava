package OOP;

public class calculateinaccount {
    public static void main(String[] args) {
        
        int t = 0;
        int result = 1;

        for (int i = 0, k = 1; i <20 ; i++, k++){
            result = (int) Math.pow(2, k);
            t = t + result;
            
            System.out.println("Day: " + k + " Vander total saving: " +result);
        }
    }
    
}
