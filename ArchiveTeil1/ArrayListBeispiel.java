import java.util.ArrayList;
public class ArrayListBeispiel {
/* Unterschiede zwischen normalen Arrays und ArrayLists:
// Комментарий: Это очень полезная для IHK сводка различий!
1. Größe
    -Ein normales Array hat eine feste Größe, die bei der Deklaration festgelegt wird.
    -Eine ArrayList kann ihre Größe dynamisch ändern, während Elemente hinzugefügt oder entfernt werden.

2. Flexibilität:
-Bei Arrays muss der Typ der Elemente zur Compiler-Zeit bekannt sein.
// arrays могут хранить только примитивы или объекты (но не генерируют ошибок примитивы)
-ArrayList können Objekte jeder Klasse speichern (z.B. Integer, String) und unterstützen Generics,
// ArrayList всегда хранит объекты (поэтому Integer, а не int). Generics(<Integer>) делают код типобезопасным.
was bedeutet, dass man die Art der Elemente zur Compile-Zeit festlegen kann.

3. Methoden:
-Arrays bieten grundlegende Operationen wie Zugriff und Iteration.
-ArrayList bieten viele nützliche Methoden wie add(), remove(), und contains(),
 die die Manipulation von Daten erleichtert.

Praktische Anwendung:
-ArrayList sind nützlich wenn die Anzahl der Elemente nicht im Voraus bekannt ist oder sich häufig ändert.
-Sie werden oft in Situationen verwendet, in denen man eine Liste von Objekten verwalten muss,
 wie z.B. eine Liste von Benutzer, Produkten oder Aufgaben in einer To-Do-Listen-Programm.
*/

    public static void main(String[] args) {
        // Объявление и инициализация ArrayList.
        // Указываем, что список будет хранить объекты типа Integer (объектная обертка для int).
        ArrayList<Integer> zahlen = new ArrayList<Integer>();

        // 1. Hinzufügen (Добавление)
        zahlen.add(10); // Добавляет элемент 10 в конец списка (индекс 0)
        zahlen.add(20); // Добавляет элемент 20 в конец списка (индекс 1)
        zahlen.add(30); // Добавляет элемент 30 в конец списка (индекс 2)
        System.out.println("ArrayList nach dem hinzufügen von Eleementen: " + zahlen); // Вывод: [10, 20, 30]

        // 2. Entfernen (Удаление)
        zahlen.remove(1); // Удаляет элемент по указанному ИНДЕКСУ (удаляется 20). Список сжимается.
        System.out.println("ArrayList nach dem entfrernen eines Eleementen: " + zahlen); // Вывод: [10, 30]

        // 3. Zugriff (Получение элемента)
        int erstesElement = zahlen.get(0); // Получает элемент по индексу 0 (это 10)
        System.out.println("Erstes Element: " + erstesElement); // Вывод: 10

        // 4. Prüfen (Проверка наличия)
        boolean enthaeltZahl = zahlen.contains(30); // Проверяет, содержит ли список объект 30 (да)
        System.out.println("Enthält die ArrayList die Zahl 30? " + enthaeltZahl); // Вывод: true

        // 5. Итерация (Перебор элементов)
        System.out.println("Alle Elemente in der ArrayList: ");
        for (int i = 0; i < zahlen.size(); i++) { // Цикл до размера списка (zahlen.size() = 2)
            System.out.println(zahlen.get(i)); // Получение элемента на каждой итерации: 10, затем 30
        }

        // 6. Размер (Текущая длина)
        int groesse = zahlen.size(); // Получает текущее количество элементов (после удаления)
        System.out.println("Größe der Liste: " + groesse); // Вывод: 2

        // 7. ArrayList для другого типа (Generics)
        ArrayList<String> name = new ArrayList<String>(); // Создание списка для объектов типа String
        name.add("Alice");
        name.add("Bob");
        name.add("Charlie");

        System.out.println("Namen in der ArrayList: ");
        for (int i = 0; i < name.size(); i++) {
            System.out.println(name.get(i)); // Вывод всех имен
        }

        // 8. Проверка на пустоту
        boolean istLeer = zahlen.isEmpty(); // Проверяет, пуст ли список zahlen (нет)
        System.out.println("Ist die ArrayList leer? " + istLeer); // Вывод: false

        // 9. Замена элемента (Set)
        // Заменяет элемент на позиции 0 (было 10) на новое значение 50.
        zahlen.set (0,50);
        System.out.println("Nach ersetzen der Zehn = " + zahlen); // Вывод: [50, 30]

        // 10. Очистка списка
        zahlen.clear(); // Удаляет все элементы из списка
        System.out.println("Nach dem Clear: " + zahlen + " (Größe: " + zahlen.size() + ")"); // Вывод: [] (Größe: 0)

        // 11. Повторное заполнение и расчеты (Демонстрация работы get() и indexOf())
        zahlen.add(40); // [40] (индекс 0)
        zahlen.add(50); // [40, 50] (индекс 1)
        zahlen.add(60); // [40, 50, 60] (индекс 2)

        // Получение индекса элемента
        int index = zahlen.indexOf(50); // Ищет первое вхождение объекта 50
        System.out.println("Index von 50 ist: " + index); // Вывод: 1

        // Расчет суммы (Используем правильный синтаксис get()!)
        int summe = zahlen.get(0) + zahlen.get(1); // 40 + 50
        System.out.println("Summe: " + summe); // Вывод: 90

        // 12. Перебор с использованием forEach (Лямбда-выражение)
        System.out.println("Alle Elemente mit forEach: ");
        // z -> System.out.println(z) - это более современный и лаконичный способ перебора элементов.
        zahlen.forEach(z-> System.out.println(z));

    }
}