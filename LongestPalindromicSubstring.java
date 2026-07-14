

// Example 1:

// Input: s = "babad"
// Output: "bab"
// Explanation: "aba" is also a valid answer. 
// Example 2:

// Input: s = "cbbd"
// Output: "bb"

public class LongestPalindromicSubstring {
    String palindromo = "";
    String novoPalindromo = "";

    public String longestPalindrome(String s) {
         
        for(int i = 0; i < s.length(); i++){
                palindromo = encontrarPalindromo(s, i - 1, i);    
                palindromo = encontrarPalindromo(s, i, i);
        }
        return palindromo;
    }

    
    public String encontrarPalindromo(String s, int esquerda, int direita){
        while(esquerda >= 0 && direita < s.length() && s.charAt(esquerda) == s.charAt(direita)){

            if(s.charAt(esquerda) == s.charAt(direita)){
                palindromo = s.substring(esquerda, direita + 1);
                if(palindromo.length() > novoPalindromo.length()){
                    novoPalindromo = palindromo;
                }
            }
            direita++;
            esquerda--;
        }
        return novoPalindromo;
    }
    

    public static void main(String[] args) {
        LongestPalindromicSubstring teste = new LongestPalindromicSubstring();
                                                                   
        System.out.println(teste.longestPalindrome("babad")); 

    }


}
