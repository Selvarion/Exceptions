package app;

public class Zad12 {
    void Napis (String sth){
        System.out.println(sth.length());
    }

    public static void main(String[] args) {
        try {
            Zad12 boom = new Zad12();
            boom.Napis(null);
        }catch (NullPointerException e){
            e.printStackTrace(System.out);
        }
    }
}
