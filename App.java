import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rev_string = "";
        
        System.out.print("Enter a string: ");
        String string = scanner.nextLine().trim();
        System.out.println();

        for (int i = string.length() - 1; i >= 0; i--) {
            rev_string += string.charAt(i);
        }

        System.out.println("Reversed String: " + rev_string);
        scanner.close();
    }
}