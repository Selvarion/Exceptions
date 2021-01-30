package app;

public class Zad2 {
    void możeZgłosićWyjątek() throws Exception {
        if (new java.util.Random().nextInt(5) == 0)
            throw new Exception();
    }

    public static void main(String[] args) {
        Zad2 z = new Zad2();
        int i = 1;
        try {
            z.możeZgłosićWyjątek();
            i++;
            z.możeZgłosićWyjątek();
            i++;
            z.możeZgłosićWyjątek();
            i++;
            z.możeZgłosićWyjątek();
            i++;
            z.możeZgłosićWyjątek();
            i++;
        } catch (Exception e) {
            System.out.println("Wyjątek wystąpił w instrukcji " + i);
        }
        if (i == 6) System.out.println("Wyjątek nie wystąpił.");
    }
}
