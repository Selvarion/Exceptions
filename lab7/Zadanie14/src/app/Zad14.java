package app;

public class Zad14 {
    void Napis (String sth){
        System.out.println(sth.length());
    }

    public static void main(String[] args) {
        try {
            Zad14 boom = new Zad14();
            boom.Napis(null);
        }catch (NullPointerException e){
            e.printStackTrace(System.out);
            throw e;
        }finally {
            System.out.println("\n Oba slady stosu sa takie same.\n");
        }
    }
}

// Oba ślady stosu są takie same.
