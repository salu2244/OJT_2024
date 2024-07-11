import java.util.*;

public class WordLadder4 {

    public static void main(String[] args) {
        // Test case
        String beginWord = "hit";
        String endWord = "cog";
        Set<String> wordDict = new HashSet<>(Arrays.asList("hot", "dot", "dog", "lot", "log"));

        WordLadder4 solution = new WordLadder4();
        int result = solution.ladderLength(beginWord, endWord, wordDict);

        System.out.println("The length of the shortest transformation sequence is: " + result);
    }

    public int ladderLength(String beginWord, String endWord, Set<String> wordDict) {
        // Use LinkedList as a queue for BFS
        LinkedList<WordNode> queue = new LinkedList<>();
        queue.add(new WordNode(beginWord, 1));
        wordDict.add(endWord); // Ensure the endWord is in the dictionary

        // BFS
        while(!queue.isEmpty()){
            WordNode top = queue.remove();
            String word = top.word;

            // If we reached the end word, return the number of steps
            if(word.equals(endWord)){
                return top.numSteps;
            }

            char[] arr = word.toCharArray();
            for(int i = 0; i < arr.length; i++){
                char temp = arr[i];
                for(char c = 'a'; c <= 'z'; c++){
                    // Change one letter at a time
                    if(arr[i] != c){
                        arr[i] = c;
                    }
                    String newWord = new String(arr);
                    // If the new word is in the dictionary, add it to the queue
                    if(wordDict.contains(newWord)){
                        queue.add(new WordNode(newWord, top.numSteps + 1));
                        wordDict.remove(newWord); // Remove to avoid re-visiting
                    }
                    arr[i] = temp; // Restore original character
                }
            }
        }
        return 0; // No valid transformation sequence
    }

    // WordNode class to store the word and the number of steps
    class WordNode {
        String word;
        int numSteps;

        public WordNode(String word, int numSteps) {
            this.word = word;
            this.numSteps = numSteps;
        }
    }
}
