

// Example 1:

// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.
// Example 2:

// Input: x = -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
// Example 3:

// Input: x = 10
// Output: false
// Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        boolean palindrome = false;
        int numeroInicial = x;
        int numeroInvertido = 0;
    
        while (x != 0) {
            if (x < 0){
                break;
            }
            int digito = x % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            x /= 10;
        }
        if (numeroInvertido == numeroInicial){
            palindrome = true;
        }
        return palindrome;
    }

    public static void main(String[] args) {
        PalindromeNumber teste = new PalindromeNumber();

        System.out.println(teste.isPalindrome(121));
    }
}
