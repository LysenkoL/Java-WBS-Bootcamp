import java.util.Arrays; // Импорт класса Arrays для использования мощных встроенных методов

public class ArraysBeispiel {

    // --- 1. Методы для демонстрации базовой работы с массивами (Ручная реализация) ---

    public static void beispielArray() {
        // Декларация: Создание массива целых чисел 'zahlen' фиксированного размера 5.
        // Ключевой момент: Размер массива определяется при инициализации и не меняется.
        int [] zahlen = new int [5];

        // Прямое присвоение значений: Доступ к ячейкам массива только по индексу (от 0 до 4).
        zahlen[0] = 1;
        zahlen[1] = 2;
        zahlen[2] = 3;
        zahlen[3] = 4;
        zahlen[4] = 5;

        System.out.println("--- Beispiel Array: Purer Zugriff ---");
        // Итерация: Цикл 'for' для прохода по всем элементам.
        // Важно: 'zahlen.length' возвращает размер массива.
        for (int i = 0; i < zahlen.length; i++) {
            System.out.println("Zahl an Index " + i + ": " + zahlen[i]);
        }
    }

    public static void summeDerElemente(){
        // Инициализация: Сокращенный синтаксис для создания и заполнения массива.
        int [] zahlen = {1,2,3,4,5};
        int summe = 0; // Накопительная переменная, обнуляется перед циклом.

        // Алгоритм суммирования: Посещаем каждый элемент и прибавляем его к сумме.
        for (int i = 0; i < zahlen.length; i++) {
            summe = summe + zahlen[i];
        }
        System.out.println("\n--- Summe Der Elemente ---");
        System.out.println("Summe: " + summe); // Вывод: 15
    }

    public static void maxImArray(){
        int [] zahlen = {3,5,7,2,8};
        // Алгоритм поиска максимума: Инициализируем 'max' первым элементом.
        int max = zahlen[0]; // max = 3

        // Сравнение: Проходим по массиву и обновляем 'max', если находим большее значение.
        for (int i = 0; i < zahlen.length; i++) {
            if(max < zahlen[i]) // Сравниваем текущий max с элементом по индексу i
                max = zahlen[i]; // Обновляем max
        }
        System.out.println("\n--- Maximum im Array ---");
        System.out.println("Maximum ist " + max); // Вывод: 8
    }

    public static void umgekehrtesArray() {
        int [] zahlen = {1,2,3,4,5};
        // Создание нового массива для результата. Важно: массив имеет ту же фиксированную длину.
        int [] umgekehrt = new int [zahlen.length];

        // Алгоритм реверса:
        for (int i = 0; i < zahlen.length; i++) {
            // Формула инвертирования индекса:
            // umgekehrt[i] = zahlen[Длина - 1 - i]
            // При i=0 берем элемент с индекса 4. При i=4 берем элемент с индекса 0.
            umgekehrt[i]= zahlen[zahlen.length - 1 -i];
        }

        System.out.println("\n--- Umgekehrtes Array (Revers) ---");
        System.out.print("Umgekehrtes array: ");
        // Вывод перевернутого массива.
        for (int i = 0; i < umgekehrt.length; i++) {
            // Используется print, а не println, чтобы вывод был в одну строку.
            System.out.print(umgekehrt[i] + " ");
        }
        System.out.println(); // Переход на новую строку после вывода
    }

    // --- 2. Поля экземпляра (Объявлены, но не используются в main, т.к. main - static) ---

    // Демонстрация массивов разных типов.
    String[] wort = {
            "Hallo",
            "Welt",
            "Guten Tag, meine Name ist Müller"
    };
    double [] zahlenDouble = { // Переименовал, чтобы избежать конфликта имен
            10.3,
            33.567,
            13.01,
            12.07
    };

    // --- 3. main() - Использование встроенных утилит java.util.Arrays ---

    public static void main(String[] args) {
        // Вызов демонстрационных методов
        beispielArray();
        summeDerElemente();
        maxImArray();
        umgekehrtesArray();

        System.out.println("\n--- Methoden von java.util.Arrays (Best Practice) ---");

        int [] zahlenArray = {5,3,8,1,4};

        // Arrays.toString(): Ключевой метод! Преобразует массив в удобную для чтения строку.
        System.out.println("Ursprünglicher Arrays: " + Arrays.toString(zahlenArray)); // Вывод: [5, 3, 8, 1, 4]

        // Arrays.sort(): Сортирует массив по возрастанию. Работает быстро и эффективно.
        Arrays.sort(zahlenArray);
        System.out.println("Das sortierte Array: " + Arrays.toString(zahlenArray)); // Вывод: [1, 3, 4, 5, 8]

        int suchWert = 3;
        // Arrays.binarySearch(): Выполняет очень быстрый бинарный поиск.
        // !!! ВАЖНО для IHK: binarySearch работает КОРРЕКТНО только на ОТСОРТИРОВАННОМ массиве.
        int index = Arrays.binarySearch(zahlenArray, suchWert);
        System.out.println("Index von " + suchWert + ": " + index); // Вывод: 1

        // Arrays.fill(): Заполняет ВСЕ ячейки массива указанным значением.
        Arrays.fill(zahlenArray, 100);
        System.out.println("Array nach Füllen: " + Arrays.toString(zahlenArray)); // Вывод: [100, 100, 100, 100, 100]

        // Arrays.copyOf(): Создает НОВЫЙ массив, копируя указанное количество (3) элементов из исходного.
        // Это безопасный способ изменить размер массива.
        int[] kopiertesArray = Arrays.copyOf(zahlenArray, 3);
        System.out.println("Kopiertes Array: " + Arrays.toString(kopiertesArray)); // Вывод: [100, 100, 100]
    }
}