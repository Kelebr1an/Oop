import java.util.Scanner;

public class Primes {

  public static void main(String[] args) {
    System.out.println("Простые числа: ");
    for (int i = 2; i < 100; i++) {
      if (isPrime(i)) {
        System.out.print(i + " ");
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
}
