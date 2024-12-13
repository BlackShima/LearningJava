package ADT_101;
public class bubbleSort {
    public static void bubbleSort(int[] numArray) {
    
        int n = numArray.length;
        int temp = 0;
    
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (numArray[j] > numArray[j+1]) {
                    // swap elements
                    temp = numArray[j];
                    numArray[j] = numArray[j+1];
                    numArray[j+1] = temp;
                }
            }
        
        }

        System.out.println(numArray);
    }
    
}
