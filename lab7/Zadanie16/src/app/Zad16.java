package app;

public class Zad16 {
    void Napis (String sth){
        System.out.println(sth.length());
    }

    public static void main(String[] args) throws Exception {
        try {
            Zad16 boom = new Zad16();
            boom.Napis(null);
        }catch (NullPointerException e){
            throw new Exception(e);
        }
    }
}
