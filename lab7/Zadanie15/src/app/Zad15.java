package app;

public class Zad15 {
    void Napis (String sth){
        System.out.println(sth.length());
    }

    public static void main(String[] args) throws Exception {
        try {
            Zad15 boom = new Zad15();
            boom.Napis(null);
        }catch (NullPointerException e){
            e.printStackTrace(System.out);
            throw new Exception();
        }
    }
}
