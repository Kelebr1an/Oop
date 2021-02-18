public class Palindrome {

  public static void main(String[] args) {
    for (int i = 0; i < args.length; i++) {
      String s = args[i];
      System.out.println(s + " - палиндром? " + isPalindrome(s) + " (" + reverseString(s) + ")");
    }
  }

  public static String reverseString(String s) {
    /*
     * Создаём пустую строку result.
     * Создаём переменную length равную длине строки s - 1.
     * Перебираем каждый символ начиная с конца и добавляем его к созданной пустой строке
     */
    String result = "";
    for (int length = s.length() - 1; length >= 0; length--) {
      result += s.charAt(length);
    }
    return result;
  }

  public static boolean isPalindrome(String s) {
    // Сравниваем строку s, со строкой возвращаемой методом reverseString (перевернутая строка s)
    return (s.equals(reverseString(s)));
  }
}
