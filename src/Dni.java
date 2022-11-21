import java.security.PublicKey;

public class Dni {
    private static final char[] L = {'T','R','W','A','G','M','Y','F','P','D',
            'X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
    private int number;
    private char letter;

    public Dni() {
        number = 0;
        letter = L[0];
    }

    public Dni(int number, char letter) {
        this.number = number;
        this.letter = letter;
    }

    public int getNumber() {
        return number;
    }

    public char getLetter() {
        return letter;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String toString() {
        return number + Character.toString(letter); //asigna char al String
    }

    public boolean correctDni() {
        if (number < 9 ) {
            return false;
        } else {
            return true;
        }
    }




}
