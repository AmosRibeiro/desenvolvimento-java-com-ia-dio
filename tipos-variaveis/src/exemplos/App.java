package exemplos;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        // TiposEVariaveis.java
    short numeroCurto = 1;
    int numeroNormal = numeroCurto;
    //casting
    short numeroCurto2 = (short) numeroNormal;
    //constante precisa ter final declarado e é usada em caixa alta
    final int NUMERO = 10;

    System.out.println(NUMERO);

    System.out.println(numeroCurto2);
    }
}
