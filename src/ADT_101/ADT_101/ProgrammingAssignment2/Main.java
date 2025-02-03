package ADT_101.ProgrammingAssignment2;
public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        TextStats stats = new TextStats("input1.text");

        System.out.println("Total Character count: " + stats.getCharCount());
        System.out.println("Total Palindrome found: " + stats.getPalindromeCount());
        System.out.println("Total Number of tokens: " + stats.getTokenCount());
        System.out.println("Total Number of emoticon: " + stats.getEmoticonCount());
        System.out.println("Total of new line: " + stats.getNewLineCount());
        System.out.println("The longest token: " + stats.getLongestToken());
        System.out.println("Average token size: " + stats.getAverageTokenSize());

        long endTime = System.currentTimeMillis();
        double executionTime = (endTime - startTime) / 1000.0;
        System.out.println("Total time to execute this program " + executionTime + " secs");

        System.out.println("Program terminated properly!");
    }
}
