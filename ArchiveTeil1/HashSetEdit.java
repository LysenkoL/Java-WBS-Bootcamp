import java.util.*;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;


public class HashSetEdit {
    public static void main(String[] args) {
        Set<String> namenUser = new HashSet<String>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie die Namen ein oder exit um Programm zu beenden: ");

        while(true){
            System.out.print("Name: ");
            String name = scanner.nextLine();
            if(name.equalsIgnoreCase("exit"))
            {
                break;
            }
            namenUser.add(name);
        }

        List<String> namenArray = new ArrayList<String>(namenUser);

        Collections.sort(namenArray);

        for (int i = 0; i < namenArray.size(); i++) {
            System.out.print(namenArray.get(i) + " ");
        }

        scanner.close();


    }
}
