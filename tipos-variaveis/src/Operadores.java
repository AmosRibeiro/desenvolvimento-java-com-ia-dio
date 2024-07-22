    public class Operadores {
        public static void main(String[] args) {

            //classe Operadores.java
            String nomeCompleto = "LINGUAGEM" + " " + "JAVA";
            
            System.out.println(nomeCompleto);

            int numero = 5;

            numero = - numero;

            System.out.println(- numero);
            System.out.println(numero);
            
            numero = numero * -1;
            //x repetição numero = numero +1;

            numero++;

            System.out.println(numero);

            boolean variavel = true;

            System.out.println(variavel);

            variavel = !variavel;

            System.out.println(variavel);

            //ternarios
            // classe Operadores.java
            int a, b;

            a = 5;
            b = 6;


            /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
            if(a==b)
            resultado = "verdadeiro";
            else
            resultado = "falso";
            */

            //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
            String resultado = (a==b) ? "verdadeiro" : "false";

             System.out.println(resultado);

                boolean ligada = true;
                int canal = 0;
                int volume = 0;
                
                ligada = !ligada;

                if(ligada == true){
                    System.out.println("Televisão ligada.");
                } else {
                    System.out.println("Televisão desligada.");
                }
        }
        

}