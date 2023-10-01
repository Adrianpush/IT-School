package session14_collections.homework.trie;

import java.util.List;

public class Trie {

    TrieNode root = new TrieNode(' ', false);

    public void addWord(String word) {
        TrieNode currentNode = root;

        for (int index = 0; index < word.length(); index++) {
            List<TrieNode> children = currentNode.getChildren();
            char currentChar = word.charAt(index);
            boolean isFound = false;
            for (TrieNode child : children) {
                if (child.getCharValue() == currentChar) {
                    if (index == word.length() -1) {
                        child.setEndOfWord(true);
                    }
                    currentNode = child;
                    children = child.getChildren();
                    isFound = true;
                    break;
                }
            }
            if (!isFound) {
                TrieNode node = new TrieNode(currentChar, index == word.length() -1);
                currentNode.addChar(node);
                currentNode = node;
            }
        }
    }

    public boolean isWordPresent(String word) {
        TrieNode currentNode = root;
        for (int index = 0; index < word.length(); index++) {
            char currentChar = word.charAt(index);
            boolean isFound = false;
            for (TrieNode child : currentNode.getChildren()) {
                if (child.getCharValue() == currentChar) {
                    currentNode = child;
                    isFound = true;
                    break;
                }
            }
            if (!isFound) {
                return false;
            }
        }
        return currentNode.isEndOfWord();
    }


}
