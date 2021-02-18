import java.util.Scanner;

public class Primes {

  public static void main(String[] args) {
    /*
     * В случае если параметр args не задан, выводятся простые числа от 2 до 100.
     * В противном случае, каждый элемент массива args проверяется проверяется на то,
     * является ли он палиндромом.
     */

    if (args.length == 0) {
      System.out.println("Простые числа: ");
      for (int i = 2; i < 100; i++) {
        if (isPrime(i)) {
          System.out.print(i + " ");
        }
      }
    } else {
      for (int i = 0; i < args.length; i++) {
        String s = args[i];
        System.out.println(s + " - палиндром? " + isPalindrome(s) + " (" + reverseString(s) + ")");
      }
    }
  }

  public static boolean isPrime(int n) {
    /*
     * n делится на все числа от 2 до n.
     * Если остаток от деления на какое-то из чисел будет равен 0, к переменной count добавляется 1.
     * Если переменная count = 0, значит не было такого числа на которое бы n делилось без остатка.
     * Значит оно является простым.
     */
    int count = 0;
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        count++;
      }
    }
    if (count == 0) {
      return true;
    } else {
      return false;
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
