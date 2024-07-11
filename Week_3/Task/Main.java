// Removed unused imports
import java.io.*;
import java.lang.*;

// Parent class
class One {
    public void print_geeks() {
        System.out.println("Geeks");
    }
}

class Two extends One {
    public void print_for() {
        System.err.println("for");
    }
}

// Driver class
public class Main {
    public static void main(String[] args) {
        Two g = new Two();
        g.print_geeks();
        g.print_for();
        g.print_geeks();
    }
}
