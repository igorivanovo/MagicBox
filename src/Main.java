import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MagicBox<Integer> magicBox = new MagicBox<>(6);
        MagicBox<String> magicBox1 = new MagicBox<>(5);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Для завершения введите <end>");
            System.out.println("Введите числa для волшебной коробки в количестве " + magicBox.getLength());
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }
            String[] parts = input.split(" ");

            for (int i = 0; i < parts.length; i++) {
                int chislo = Integer.parseInt(parts[i]);
                magicBox.add(chislo);
            }
            System.out.println("Ваша коробка Integer --" + Arrays.toString(magicBox.getItems()));
            System.out.println("Введите строки для волшебной коробки в количестве " + magicBox1.getLength());
            String input1 = scanner.nextLine();
            if ("end".equals(input1)) {
                break;
            }
            String[] parts1 = input1.split(" ");
            for (int i = 0; i < parts1.length; i++) {
                String stroka = parts1[i];
                magicBox1.add(stroka);

            }
            System.out.println("Ваша коробка String --" + Arrays.toString(magicBox1.getItems()));
        }
        System.out.print("Вынимаем случайное число из коробки Integer:  ");
        System.out.println("< " + magicBox.pick() + " >");
        System.out.print("Вынимаем случайную строку из коробки String:  ");
        System.out.println("< " + magicBox1.pick() + " >");
    }
}