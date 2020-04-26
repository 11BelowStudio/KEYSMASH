package uwu;

import java.io.*;

public class Keysmash {

    public static void main(String args[]) {

        System.out.println("** KEYSMASH **");
        System.out.println("made because reasons");

        Keysmash uwu = new Keysmash();

        boolean quit;
        do{

            uwu.smash();
            System.out.println("\nenter 'q' if you want to stop");
            quit = uwu.getLine().equals("q");
        } while(!quit);
        System.out.println("aight bye");
        //bye

    }

    Keysmash(){ } //uwu

    //prints a random string with a length of 1-2000 characters
    void smash(){
        int smashLength = (int) (Math.random() * 2000);

        for (int i = 0; i < smashLength; i++) {
            System.out.print((char)((Math.random() * 95) + 32));
        }
        System.out.println();
    }

    //just obtains a user input basically
    String getLine() {
        String line= "";
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        try {
            line = buf.readLine().trim();

        } catch (Exception e) {
            System.out.println("That wasn't supposed to happen");
            System.exit(1);
        }
        return(line);
    }

}
