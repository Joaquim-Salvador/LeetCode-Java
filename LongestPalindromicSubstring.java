

import java.util.Arrays;

// Given a string s, return the longest palindromic substring in s.

// Example 1:

// Input: s = "babad"
// Output: "bab"
// Explanation: "aba" is also a valid answer. 
// Example 2:

// Input: s = "cbbd"
// Output: "bb"

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        String[] palavra = s.split("");
        String[] palindrome = null;
        String resultado = null;


        int tamanho = palavra.length;
        if(palavra.length % 2 == 0){
            tamanho = tamanho / 2;
        } else{
            tamanho = (tamanho / 2) + 1;
        }

        for(int i = 0; i < palavra.length; i++){
                if(palavra[i].equals(palavra[tamanho - 1 - i])){
                    System.out.println(tamanho);
                    palindrome = Arrays.copyOfRange(palavra, i, tamanho - 1 - i);
                    resultado = String.join("", palindrome);
                } else{
                    while(palindrome.contains(palavra[i])){
                        palindrome.remove(0);
                    }
                }      
            }
        
        return resultado;
    }

    public static void main(String[] args) {
        LongestPalindromicSubstring teste = new LongestPalindromicSubstring();

        System.out.println("Resultado: " + teste.longestPalindrome("babad"));

    }


}
