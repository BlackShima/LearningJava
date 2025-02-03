package ADT_101.ProgrammingAssignment2;

import java.io.*;
import java.util.*;

public class TextStats {
    private String text;

    public TextStats(String filePath) {
        StringBuilder content = new StringBuilder();
        try (Scanner scanner = new Scanner(new File("C://Users//Black//Downloads//input1.txt"))) {
            while (scanner.hasNextLine()) {
                content.append(scanner.nextLine()).append("\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        this.text = content.toString();
    }

    public int getCharCount() {
        return text.length();
    }

    public int getPalindromeCount() {
        int count = 0;
        String[] words = text.split("\\W+");
        for (String word : words) {
            if (isPalindrome(word)) {
                count++;
            }
        }
        return count;
    }

    public int getTokenCount() {
        String[] words = text.split("\\W+");
        return words.length;
    }

    public int getEmoticonCount() {
        String emoticonPattern = "[:;]-?[)D]";
        return text.split(emoticonPattern).length - 1;
    }

    public int getNewLineCount() {
        return text.split("\n").length - 1;
    }

    public String getLongestToken() {
        String longestToken = "";
        String[] words = text.split("\\W+");
        for (String word : words) {
            if (word.length() > longestToken.length()) {
                longestToken = word;
            }
        }
        return longestToken;
    }

    public double getAverageTokenSize() {
        int totalTokenLength = 0;
        String[] words = text.split("\\W+");
        for (String word : words) {
            totalTokenLength += word.length();
        }
        return (double) totalTokenLength / words.length;
    }

    private boolean isPalindrome(String word) {
        int left = 0, right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
