/* import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BenutzerEingabe {


       public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> namen = new ArrayList<>();

        while (true) {
            System.out.println("Geben Sie den Namen ein, um Programm zu beenden schreiben Sie \"fertig\". ");
            String eingabe = scan.nextLine();
            if (eingabe.equalsIgnoreCase("fertig")) {
                System.out.println("Eingabe beendet. Die Daten können weiter verarbeitet werden.");
                break;
            }
            else namen.add(eingabe);
        }
           System.out.println("Alle von Ihnen eingegebenen Namen: ");
            for (int i = 0; i < namen.size(); i++) {
                System.out.println(namen.get(i));
            };
           System.out.println("Wollen Sie die Namen mit Buchstabe filtern? j/n: ");
           String antwort = scan.nextLine();
           if (antwort.equalsIgnoreCase("j")) {
               System.out.println("Mit welchem Buchstaben sollen sie Namen beginnen? Geben Sie ein: ");
               char buchstabe =  scan.nextLine().charAt(0);
               for (int i = 0; i < namen.size(); i++) {
                   if (buchstabe == namen.get(i).charAt(0) ) {
                       System.out.println(namen.get(i));
                   }
               }
           } else if (antwort.equalsIgnoreCase("n")) {
               System.out.println("Programm beendet.");
           }
           else  {
               System.out.println("Ungültige Eingabe. Programm beendet.");
           }

       }
}
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BenutzerEingabe {

    public static void main(String[] args) {

        // Scanner — объект для чтения ввода пользователя из консоли
        Scanner scan = new Scanner(System.in);

        // List<String> namen — список для хранения введённых имён
        // Используется ArrayList, так как он динамический (размер может меняться)
        List<String> namen = new ArrayList<>();

        // =========================
        // ВВОД ИМЁН ПОЛЬЗОВАТЕЛЕМ
        // Цикл работает, пока пользователь не введёт "fertig"
        // =========================
        while (true) {

            // Сообщение пользователю, что нужно ввести имя
            System.out.println(
                    "Geben Sie den Namen ein, um Programm zu beenden schreiben Sie \"fertig\". "
            );

            // Считываем строку, введённую пользователем
            String eingabe = scan.nextLine();

            // Если пользователь ввёл "fertig" — завершаем ввод
            if (eingabe.equalsIgnoreCase("fertig")) {

                // Сообщение о завершении ввода данных
                System.out.println(
                        "Eingabe beendet. Die Daten können weiter verarbeitet werden."
                );

                // Выход из цикла while
                break;

            } else {
                // Если это не "fertig", добавляем имя в список
                namen.add(eingabe);
            }
        }

        // =========================
        // ВЫВОД ВСЕХ ВВЕДЁННЫХ ИМЁН
        // =========================
        System.out.println("Alle von Ihnen eingegebenen Namen: ");

        // Проходим по списку и выводим каждый элемент
        for (int i = 0; i < namen.size(); i++) {
            // namen.get(i) — получение имени по индексу
            System.out.println(namen.get(i));
        }

        // =========================
        // СПРОСИТЬ, НУЖНА ЛИ ФИЛЬТРАЦИЯ
        // =========================
        System.out.println("Wollen Sie die Namen mit Buchstabe filtern? j/n: ");

        // Считываем ответ пользователя (j или n)
        String antwort = scan.nextLine();

        // =========================
        // ФИЛЬТРАЦИЯ ИМЁН ПО ПЕРВОЙ БУКВЕ
        // =========================
        if (antwort.equalsIgnoreCase("j")) {

            // Запрашиваем букву для фильтрации
            System.out.println(
                    "Mit welchem Buchstaben sollen sie Namen beginnen? Geben Sie ein: "
            );

            // Считываем строку и берём первый символ
            // charAt(0) — первый символ строки
            char buchstabe = scan.nextLine().charAt(0);

            // Проходим по списку имён
            for (int i = 0; i < namen.size(); i++) {

                // Проверяем: начинается ли имя с введённой буквы
                // namen.get(i).charAt(0) — первая буква имени
                if (buchstabe == namen.get(i).charAt(0)) {

                    // Если совпало — выводим имя
                    System.out.println(namen.get(i));
                }
            }

        } else if (antwort.equalsIgnoreCase("n")) {

            // Если пользователь не хочет фильтрацию
            System.out.println("Programm beendet.");

        } else {

            // Если пользователь ввёл что-то кроме j или n
            System.out.println("Ungültige Eingabe. Programm beendet.");
        }
    }
}

