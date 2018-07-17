package enigma;

/**
 * Created by kbriggs on 7/16/18.
 */
public class Main {
    public static void main(String[]args) {
        Enigma enigma = new Enigma();
        char s = 'b';

        System.out.println("Started: " + s);
        char result = enigma.encypt(s);
        System.out.println("Encrypted: " + result);

        // Should return your original character
        char decrypted = enigma.decrypt(result);
        System.out.println("Decrypted: " + decrypted + ". Should be " + s);
        if (s == decrypted) {
            System.out.println("Success!");

        } else {
            System.out.println("Keep trying!");

        }

    }
}
