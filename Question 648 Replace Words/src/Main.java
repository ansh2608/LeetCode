import java.util.*;

class Trie {
    private static class Node{
        Node[] arr;
        boolean isWord;
        Node(){
            arr =new Node [26];
        }
    }
    private static Node root;
    Trie(){
        root =new Node();
    }
    public static void add(String word){
        Node curr =root;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            int index = c-'a';
            if(curr.arr[index]!=null){
                curr = curr.arr[index];
            }else{
                curr.arr[index] = new Node();
                curr =curr.arr[index];
            }
        }
        curr.isWord=true;
    }
    String getRoot(String word){
        Node curr =root;
        int i=-1;
        for(i=0;i<word.length();i++){
            if(curr.isWord) break;
            char c = word.charAt(i);
            int index = c -'a';

            if(curr.arr[index]!=null) curr = curr.arr[index];
            else return"";
        }
        return word.substring(0,i);
    }
}
public class Main {

    public static String replaceWords(List<String> dictionary, String sentence) {
        Trie trie = new Trie();
        for(String i : dictionary) trie.add(i);
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder(sentence.length()+1);
        for(String word :words){
            String root = trie.getRoot(word);
            if(root.equals("")){
                result.append(word);
                result.append(" ");
            }else{
                result.append(root);
                result.append(" ");
            }
        }
        return result.toString().trim();
    }
    public static void main(String[] args) {
        List<String> dictionary = new ArrayList<>();
        dictionary.add("cat");
        dictionary.add("bat");
        dictionary.add("rat");
        String sentence = "the cattle was rattled by the battery";
        System.out.println(replaceWords(dictionary,sentence));
    }
}