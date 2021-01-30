package app;

public class Zad13 {
    void Napis (String sth){
        System.out.println(sth.length());
    }

    public static void main(String[] args) {
        try {
            Zad13 boom = new Zad13();
            boom.Napis(null);
        }catch (NullPointerException e){
            e.printStackTrace(System.out);
            throw e;
        }
    }
}
