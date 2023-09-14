package session14.homework.trie;

import java.util.ArrayList;
import java.util.List;

public class TrieNode {

    private char charValue;
    private boolean endOfWord;
    private List<TrieNode> children = new ArrayList<>();

    public TrieNode(char charValue, boolean endOfWord) {
        this.charValue = charValue;
        this.endOfWord = endOfWord;
    }

    public void addChar(TrieNode trieNode) {
        children.add(trieNode);
    }

    public List<TrieNode> getChildren() {
        return children;
    }

    public char getCharValue() {
        return charValue;
    }

    public boolean isEndOfWord() {
        return endOfWord;
    }

    public void setEndOfWord(boolean endOfWord) {
        this.endOfWord = endOfWord;
    }
}
