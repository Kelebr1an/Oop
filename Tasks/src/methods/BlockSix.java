package methods;

import java.util.*;
import java.util.stream.Collectors;

public class BlockSix {

    public BlockSix() {
        cycle:
        while (true) {
            switch (TaskMenu.createMenu()) {
                case 1:
                    while (true) {
                        try {
                            Scanner in = new Scanner(System.in);
                            System.out.println("\nВведите первую строку");
                            String string = in.nextLine();
                            System.out.println("\nВведите вторую строку");
                            String substring = in.nextLine();
                            System.out.println(hiddenAnagram(string, substring));
                            break;
                        } catch (Exception exception) {
                            System.out.println("Ошибка: " + exception + ". Повторите ввод");
                            continue;
                        }
                    }
                    break;
                case 2:
                    while (true) {
                        try {
                            Scanner in = new Scanner(System.in);
                            System.out.println("\nВведите строку");
                            String string = in.nextLine();
                            System.out.println("\nВведите длину среза");
                            int n = in.nextInt();
                            for (String str : collect(string, n)) {
                                System.out.println(str);
                            }
                            break;
                        } catch (Exception exception) {
                            System.out.println("Ошибка: " + exception + ". Повторите ввод");
                            continue;
                        }
                    }
                    break;
                case 3:
                    while (true) {
                        try {
                            Scanner in = new Scanner(System.in);
                            System.out.println("\nВведите сообщение");
                            String message = in.nextLine();
                            System.out.println("\nВведите ключ");
                            String key = in.nextLine();
                            System.out.println(nicoCipher(message, key));
                            break;
                        } catch (Exception exception) {
                            System.out.println("Ошибка: " + exception + ". Повторите ввод");
                            continue;
                        }
                    }
                    break;
                case 4:
                    while (true) {
                        try {
                            Scanner in = new Scanner(System.in);
                            System.out.println("\nВведите числа через пробел");
                            int[] array = BlockTwo.intArrayCreator();
                            System.out.println("\nВведите число");
                            int product = in.nextInt();
                            for (int num : twoProduct(array, product)) {
                                System.out.println(num);
                            }
                            break;
                        } catch (Exception exception) {
                            System.out.println("Ошибка: " + exception + ". Повторите ввод");
                            continue;
                        }
                    }
                    break;
                case 5:
                    while (true) {
                        try {
                            Scanner in = new Scanner(System.in);
                            System.out.println("\nВведите число");
                            int n = in.nextInt();
                            for (int num : isExact(n)) {
                                System.out.println(num);
                            }
                            break;
                        } catch (Exception exception) {
                            System.out.println("Ошибка: " + exception + ". Повторите ввод");
                            continue;
                        }
                    }
                    break;
                case 6:
                    while (true) {
                        try {
                            Scanner in = new Scanner(System.in);
                            System.out.println("\nВведите число");
                            String decimal = in.nextLine();
                            System.out.println(fractions(decimal));
                            break;
                        } catch (Exception exception) {
                            System.out.println("Ошибка: " + exception + ". Повторите ввод");
                            continue;
                        }
                    }
                    break;
                case 7:
                    while (true) {
                        try {
                            Scanner in = new Scanner(System.in);
                            System.out.println("\nВведите строку");
                            String string = in.nextLine();
                            System.out.println(pilishString(string));
                            break;
                        } catch (Exception exception) {
                            System.out.println("Ошибка: " + exception + ". Повторите ввод");
                            continue;
                        }
                    }
                    break;
                case 8:
                    while (true) {
                        try {
                            Scanner in = new Scanner(System.in);
                            System.out.println("\nВведите длину");
                            int n = in.nextInt();
                            System.out.println(generateNonconsecutive(n));
                            break;
                        } catch (Exception exception) {
                            System.out.println("Ошибка: " + exception + ". Повторите ввод");
                            continue;
                        }
                    }
                    break;
                case 9:
                    while (true) {
                        try {
                            Scanner in = new Scanner(System.in);
                            System.out.println("\nВведите строку");
                            String string = in.nextLine();
                            System.out.println(isValid(string));
                            break;
                        } catch (Exception exception) {
                            System.out.println("Ошибка: " + exception + ". Повторите ввод");
                            continue;
                        }
                    }
                    break;
                case 10:
                    while (true) {
                        try {
                            System.out.println("\nВведите числа через пробел");
                            int[] array = BlockTwo.intArrayCreator();
                            for (int[] num : sumsUp(array)) {
                                System.out.println(num[0] + " " + num[1]);
                            }
                            break;
                        } catch (Exception exception) {
                            System.out.println("Ошибка: " + exception + ". Повторите ввод");
                            continue;
                        }
                    }
                    break;
                case 0:
                    break cycle;
            }
        }
    }

    public static String hiddenAnagram(String string, String substring) {
        string = string.toLowerCase().replaceAll("[^a-z]", ""); // Убираем все символы в строке кроме букв
        substring = substring.toLowerCase().replaceAll(" ", ""); // Убираем все пробелы
        // Проходим в течение разницы между длинами строк
        for (int i = 0; i < string.length() - substring.length() + 1; i++) {
            // Если i символ в первой строке присутствует во второй строке
            if (substring.indexOf(string.charAt(i)) > -1) {
                // Создаём подстроку от найденного символа до длины второй строки + i
                String subT = string.substring(i, i + substring.length());
                // Проверяем является ли полученная строка анаграмой
                if (isAnagram(subT, substring)) {
                    return subT;
                }
            }
        }
        return "noutfond";
    }

    private static Boolean isAnagram(String firstString, String secondString) {
        StringBuilder s = new StringBuilder(secondString); // Создаём объект класса StringBuilder из второй строки
        // Проходим по всем символам строки, которая может быть анаграммой
        for (int i = 0; i < firstString.length(); i++) {
            int in = s.indexOf(String.valueOf(firstString.charAt(i))); // Находим индекс i символа строки во второй строке
            // Если символ отсутствует во второй строке, значит это не анаграмма
            if (in == -1) {
                return false;
            }
            s.setCharAt(in, '-'); // Меняем символ на -
        }
        return true;
    }

    public static String[] collect(String string, int n) {
        // Если длина строки меньше, чем длина среза, возвращаем пустой массив
        if (string.length() < n) return new String[0];
        String[] w = collect(string.substring(n), n); // Вызываем метод с урезанной строкой
        String[] v = new String[w.length + 1]; // Создаём массив размером = кол-во слов
        v[0] = string.substring(0, n); // Вставляем первое слово в массив
        for (int i = 0; i < w.length; i++) v[i + 1] = w[i]; // Добавляем остальные слова
        Arrays.sort(v); // Сортируем полученный массив
        return v;
    }

    public static String nicoCipher(String string, String key) {
        int stringLength = string.length(); // Получаем длину строки
        int keyLength = key.length(); // Получем длину ключа
        int r = (stringLength - stringLength % keyLength) / keyLength; // Переменная для назначения номеров для букв сообщения
        if (stringLength % keyLength != 0) r++; // Увеличиваем на 1, в случае необходимости в зависимости от чётности
        for (int i = stringLength; i < r * keyLength; i++)
            string += " ";
        char[][][] v = new char[r][keyLength][2]; // Создаём массив для хранения букв и номеров
        // Заполняем массив
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < keyLength; j++) {
                v[i][j][0] = string.charAt(i * keyLength + j);
                v[i][j][1] = key.charAt(j);
            }
            Arrays.sort(v[i], (a, b) -> (int) a[1] - (int) b[1]); // Сортируем полученный массив
        }
        String eMessage = "";
        for (int i = 0; i < r; i++)
            for (int j = 0; j < keyLength; j++)
                eMessage += v[i][j][0]; // Формируем строку
        return eMessage;
    }

    public static int[] twoProduct(int[] array, int product) {
        // Проходим по массиву
        for (int i = 1; i < array.length; i++) {
            // Проходим по массиву до i числа
            for (int j = 0; j < i; j++) {
                // Если произведение чисел равно необходимому числу
                if (array[j] * array[i] == product) {
                    // Заполняем массив соответствующими числами
                    int[] result = new int[2];
                    result[0] = array[j];
                    result[1] = array[i];
                    return result; // Возвращаем массив
                }
            }
        }
        // Если не нашли соответствие, возвращаем пустой массив
        int[] result = new int[1];
        return result;
    }

    public static int[] isExact(int n, int... f) {
        if (f.length < 2) return isExact(n, 1, 1);
        //  Считаем значение факториала
        f[1] *= ++f[0];
        // Если верхняя граница факториала меньше исходного числа, заного вызываем метод
        if (f[1] < n) {
            return isExact(n, f[0], f[1]);
        } else if (f[1] == n) {
            return new int[]{n, f[0]};  // Если верхняя граница факториала совпадает с исходном числом, возвращаем число и факториал
        } else {
            return new int[0]; // Возвращаем пустой массив
        }
    }

    public static String fractions(String decimal) {
        // Получаем первую часть числа
        long n1 = Long.parseLong(decimal.replaceAll("(.*)\\(.*", "$1").replace(".", ""));
        // Получаем вторую часть числа
        long n2 = Long.parseLong(decimal.replaceAll("[\\(\\)\\.]", ""));
        int exp1 = decimal.replaceAll("\\d+\\.(\\d*)\\(\\d+\\)", "$1").length();
        int exp2 = decimal.replaceAll("\\d+\\.(?=.*)", "").replaceAll("[\\(\\)]", "").length();
        // Считаем разницу между частями числа
        long num = n2 - n1;
        long div = (long) Math.pow(10, exp2) - (long) Math.pow(10, exp1);
        long gcdiv = gcd(num, div);
        num = num / gcdiv;
        div = div / gcdiv;
        return String.format("%d/%d", num, div);
    }

    private static long gcd(long a, long b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

    public static String pilishString(String string) {
        int[] pi = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9, 7, 9}; // Число Пи
        int i = 0; // Счётчик
        String str = ""; // Строка
        // Пока счётчик меньше 15 и длина строки больше чем значение i цифры числа Пи
        while (i < 15 && string.length() >= pi[i]) {
            str += string.substring(0, pi[i]) + " "; // Добавляем к результирующей строке часть от слова по длине равную i цифре числа Пи
            string = string.substring(pi[i]); // Обрезаем строку
            i++; // Двигаем счётчик
        }
        return string.isEmpty() || i == 15 ? str.trim() : str + string + String.format("%0" + (pi[i] - string.length()) + "d", 0).replace('0', string.charAt(string.length() - 1));
    }

    public static String generateNonconsecutive(int n) {
        String ans = ""; // Строка для ответа
        // Пока не кончатся возможные комбинации
        for (int i = 0; i < Math.pow(2, n); i++) {
            String b = Integer.toBinaryString(i); // Получаем бинарное значение
            // Пока длина бинарного значения не будет = n, добавляем 0
            while (b.length() < n) b = "0" + b;
            // Убираем последовательность и добав
            if (b.indexOf("11") < 0) ans += " " + b;
        }
        return ans.substring(1);
    }

    public static String isValid(String string) {
        HashMap<Character, Integer> map = new HashMap(); // Создаём HashMap
        // Заполняем HashMap
        for (int i = 0; i < string.length(); i++) {
            char key = string.charAt(i); // Запоминаем символ
            // Если в HashMap есть такой символ
            if (map.get(key) != null)
                map.put(key, map.get(key) + 1); // Добавляем значению по данному символу 1
            else
                map.put(key, 1); // Если нет, то добавляем символ в HashMap
        }
        ArrayList<Integer> mapValues = new ArrayList(map.values()); // Создаём список из значение HashMap
        int max = (int) Collections.max(mapValues); //Находим максимальное
        int min = (int) Collections.min(mapValues); //Находим минимальное
        if (max == min) // Если они равны
            return "YES"; // Возвращаем Yes
        int minСount = 0, maxСount = 0; // Счётчики
        // Проходим по значения HashMap
        for (int i = 0; i < mapValues.size(); i++) {
            // Считаем значения максимальных
            if (mapValues.get(i) == max)
                maxСount++;
            // Считаем значения минимальных
            else if (mapValues.get(i) == min)
                minСount++;
        }
        // Если убрав один символ мы сможем сравнять значения max и min, то возвращаем YES
        return (minСount == 1 || (maxСount == 1 && max == min + 1)) ? "YES" : "NO";
    }

    public static int[][] sumsUp(int[] array) {
        int[][] tempResult = new int[array.length][2]; // Создаём массив
        int resultCounter = 0; // Счётчик
        // Проходим по всему исходному массиву
        for (int i = 0; i < array.length; i++) {
            // Проходим по всему исходному массиву с конца
            for (int j = i - 1; j >= 0; j--) {
                // Проверяем даёт ли пары чисел в сумме 8 и при этом не является 8 по отдельности
                if (array[i] + array[j] == 8 && array[i] != 8 && array[j] != 8) {
                    // Записываем пару в порядке возрастания
                    if (array[i] < array[j]) {
                        tempResult[resultCounter][0] = array[i];
                        tempResult[resultCounter][1] = array[j];
                    } else {
                        tempResult[resultCounter][0] = array[j];
                        tempResult[resultCounter][1] = array[i];
                    }
                    resultCounter++; //Добавляем 1 к счётчику
                }
            }
        }
        int[][] result = new int[resultCounter][2]; // Создаём массив
        // Заполняем его полученными парами чисел
        for (int i = 0; i < resultCounter; i++) {
            result[i][0] = tempResult[i][0];
            result[i][1] = tempResult[i][1];
        }
        return result;
    }
}
