// Given a string s, find the length of the longest substring without duplicate characters.

// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
// Example 2:

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.
// Example 3:

// Input: s = "pwwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3.
// Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

import java.util.ArrayList;
import java.util.List;

class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s){
        char[] letras = s.toCharArray();
        List<Character> lista = new ArrayList<>();
        int tamanhoSubstring = 0;

        for(int i = 0; i < letras.length; i++){
            if(!lista.contains(letras[i])){
                lista.add(letras[i]);
            } else{
                while (lista.contains(letras[i])) {
                    lista.remove(0);
                }
                lista.add(letras[i]);
            }
            if (tamanhoSubstring < lista.size()){
                tamanhoSubstring = lista.size();
            }
            System.out.println(i);
    }
    return tamanhoSubstring;
}

    public static void main(String[] args) {
        LengthOfLongestSubstring lengthOfLongestSubstringue = new LengthOfLongestSubstring();

        System.out.println(lengthOfLongestSubstringue.lengthOfLongestSubstring("dvdf"));
    }
}
