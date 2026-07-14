

// Example 1:

// Input: s = "babad"
// Output: "bab"
// Explanation: "aba" is also a valid answer. 
// Example 2:

// Input: s = "cbbd"
// Output: "bb"

public class LongestPalindromicSubstring {
    String palindromo = "";
    int maior = 1;
    public String longestPalindrome(String s) {
         
        for(int i = s.length() / 2; i < s.length(); i++){
            if (s.length() % 2 == 0){
                palindromo = encontrarPalindromo(s, i, i);    
            } else {
                palindromo = encontrarPalindromo(s, i, i);
            }

        }
        return palindromo;
    }

    
    public String encontrarPalindromo(String s, int esquerda, int direita){
            System.out.println(direita + " Direita: "+s.charAt(direita));
            System.out.println(esquerda + " Esquerda: "+s.charAt(esquerda));
        while(esquerda >= 0 && direita < s.length() && s.charAt(direita) == s.charAt(esquerda)){

            if(s.charAt(esquerda) == s.charAt(direita) && direita != esquerda){
            if (s.length() % 2 == 0){
                palindromo = s.substring(esquerda, direita);    
            } else {
                palindromo = s.substring(esquerda, direita + 1);
            }
                
            }
            System.out.println("Palindromo: " + palindromo.length());
            System.out.println("Maior: " + maior);

            direita++;
            esquerda--;

        }

        System.out.println("palindromo: "+ palindromo);
        return palindromo;
    }
    

    public static void main(String[] args) {
        LongestPalindromicSubstring teste = new LongestPalindromicSubstring();

        System.out.println("Resultado: " + teste.longestPalindrome("cbbd"));

    }


}
