package enigma;

/**
 * Created by kbriggs on 7/16/18.
 */
public class Enigma {
    private char[] alpha={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p',
            'q','r','s','t','u','v','w','x','y','z'};

    public Enigma() {
        // Constructor. Nothing to intialize yet, but will be needed later
    }


    /*
     * Simple encryption method
     */
    public char encypt(char character) {
        // iterate through alpha looking for our index and save it
        int index=0;
        for (int i=0; i<alpha.length; i++) {
            if(character == alpha[i]) {
                index = i;
            }

        }

        // After we have index add 5
        // If greater than 25, continue at zero
        index += 5;

        if(index > 25) {
            index -= 26;
        }

        return alpha[index];
    }

    /*
     * TODO: Write code to decrypt
     */
    public char decrypt(char encrypted) {
        return encrypted;
    }
}
