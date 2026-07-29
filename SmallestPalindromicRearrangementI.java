
// Topics
// premium lock icon
// Companies
// Hint
// You are given a palindromic string s.

// Return the lexicographically smallest palindromic permutation of s.

 

// Example 1:

// Input: s = "z"

// Output: "z"

// Explanation:

// A string of only one character is already the lexicographically smallest palindrome.

// Example 2:

// Input: s = "babab"

// Output: "abbba"

// Explanation:

// Rearranging "babab" → "abbba" gives the smallest lexicographic palindrome.

// Example 3:

// Input: s = "daccad"

// Output: "acddca"

// Explanation:

// Rearranging "daccad" → "acddca" gives the smallest lexicographic palindrome.

class SmallestPalindromicRearrangementI{
    public String smallestPalindrome(String s) {
        String menorPallindromo = ""; 
        int[] qtdAparece = new int[26];
        Character letraMeio = null;

        if(s.length() < 4){
            return s;
        }

        for (int i = 0; i < s.length(); i++) {
            qtdAparece[s.charAt(i) - 'a']++;
        }
        
        for(int i = 0; i < 26; i++){
            int j = 0;
            if(qtdAparece[i] > 0){
                while(j < qtdAparece[i] / 2) { 
                    menorPallindromo = menorPallindromo + (char) ('a' + i);
                    j++;
                }
            }
            
            if(qtdAparece[i] % 2 != 0){
                letraMeio = (char) ('a' + i);
            }
        }

        for(int i = menorPallindromo.length() - 1; i >= 0; i--){
            if(i == menorPallindromo.length() - 1 && s.length() % 2 != 0){
                menorPallindromo = menorPallindromo + letraMeio;
            }
            menorPallindromo = menorPallindromo + menorPallindromo.charAt(i);

        }
        
        return menorPallindromo;
    }


    public static void main(String[] args) {
        SmallestPalindromicRearrangementI teste = new SmallestPalindromicRearrangementI();

        System.out.println(teste.smallestPalindrome("rur"));

    }
}