/* * Was ist Enum?
 * * * Ein Enum (kurz für Enumeration) ist ein spezieller Datentyp in Java, der eine feste Menge von Werten definiert.
 * * Enums sind hilfreich, um verwandte Konstanten zu gruppieren, was die Lesbarkeit des Codes erhöht und sicherstellt,
 * * dass nur vordefinierte Werte verwendet werden können.
 *
 * * 1. Typensicherheit (Typesafety): // Безопасность типов — важнейшее свойство
 * Enums erlauben nur die Verwendung definierter Werte, was Fehler durch falsche Eingabe minimiert.
 * (Man kann z.B. nur Wochentag.MONTAG verwenden, keine String-Werte wie "MontagX").
 *
 * * 2. Lesbarkeit (Readability): // Повышение читаемости и понятности кода
 * Der Code wird klarer, da die Bedeutung der Werte sofort erkennbar ist (z.B. Status.ABGESCHLOSSEN).
 *
 * * 3. Vermeidung von Fehlern (Bug Prevention): // Защита от ошибок
 * Nur vordefinierte Werte können verwendet werden, was die Wartung erleichtert und die Gefahr von Tippfehlern eliminiert.
 *
 * * 4. Stabilität (Stability): // Стабильность
 * Enums haben eine feste Menge an Werten, im Gegensatz zu flexiblen Arrays oder Listen.
 *
 * * 5. Typsicherung (Strong Typing): // Строгая типизация
 * Enums sind spezifische Datentypen (sie erben implizit von java.lang.Enum), die Operationen unterstützen,
 * die für den definierten Typ relevant sind (z.B. .ordinal() или .values()).
 *
 * * Enums sind ideal für vordefinierte Gruppen von Werten z.B. Status, Farben usw. und bieten Stabilität
 * * und Lesbarkeit, während sie weniger flexibel sind, da sie zur Laufzeit nicht geändert werden können.
 * * * WICHTIG: Enums in Java sind Objekte und Konstanten (keine einfachen primitive Werte).
 * * Man kann ihnen Konstruktoren, Felder und Methoden hinzufügen (z.B. für die Berechnung von Gehältern pro Tag).
 */


/*enum Aufgabestatus {
    // Определение фиксированного набора констант (Status-Werte).
    // Эти константы - единственные возможные значения для типа Aufgabestatus.
    OFFEN, // Открыта (Задача еще не начата)
    IN_BEARBEITUNG, // В работе (Задача обрабатывается)
    ABGESCHLOSSEN, // Завершена (Задача выполнена)
    BLOCKIERT // Заблокирована (Задача не может быть продолжена)
}
public class ProjektManagement {
    public static void main(String[] args) {

        // Zuweisung eines Enum-Werts zu einer Variablen
        // Объявление переменной типа Aufgabestatus и присвоение начального значения OFFEN.
        Aufgabestatus status = Aufgabestatus.OFFEN;
        System.out.println("Aktueller Status der Aufgabe: " + status); // Вывод: OFFEN

        // Statusänderung der Aufgabe
        // Переменной 'status' можно присвоить только одно из четырех значений, определенных в Enum.
        status = Aufgabestatus.IN_BEARBEITUNG;
        System.out.println("Neuer Status der Aufgabe: " + status); // Вывод: IN_BEARBEITUNG

        // Verwendung einer switch-Anweisung zur Verarbeitung des aktuellen Status
        // Switch-Anweisung идеально подходит для Enum, так как компилятор проверяет,
        // что все возможные состояния (case) учтены. Это часть Typensicherheit.
        switch (status){
            // При использовании Enum в switch не нужно писать полное имя (Aufgabestatus.OFFEN),
            // достаточно просто OFFEN.
            case OFFEN:
                System.out.println("Die Aufgabe ist noch nicht begonnen.");
                break;
            case IN_BEARBEITUNG:
                System.out.println("Die Aufgabe wird gerade bearbeitet");
                break;
            case ABGESCHLOSSEN:
                System.out.println("Die Aufgabe ist abgeschlossen");
                break;
            case BLOCKIERT:
                System.out.println("Die Aufgabe ist blokiert");
                break;
            // Важно: Если бы ты использовала String, тебе пришлось бы писать 'default'
            // и ловить ошибки (например, если бы кто-то написал "abgeschlossen").
        }
    }
}
*/
