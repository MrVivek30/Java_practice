
    import java.util.*;

    public class Char {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("sysrtlelfjeirok");
            // Declare a 2D char array
            char[][] charArray = new char[3][3];
            System.out.println("cccc");
            // Take input for the 2D char array
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.println("aaaaaaaaaaaaa");
                    charArray[i][j] = scanner.next().charAt(0);
                    System.out.println("ddddddddddd");
                }
            }
            System.out.println("bfhghdnbf");
            // Print the 2D char array
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(charArray[i][j] + " ");
                }
                System.out.println();
            }

            scanner.close();
        }
    }
