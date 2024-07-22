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

             public class MyClass {
	
                public double somar(int num1, int num2){
                    //LOGICA - FINALIDADE DO MÉTODO
                    return ... ;
                }
                
                public void imprimir(String texto){
                    //LOGICA - FINALIDADE DO MÉTODO
                    //AQUI NÃO PRECISA DO RETURN
                    //POIS NÃO SERÁ RETORNADO NENHUM RESULTADO
                }
                // throws Exception : indica que o método ao ser utilizado
                // poderá gerar uma exceção
                public double dividir(int dividendo, int divisor) throws Exception{}
                
                // este método não pode ser visto por outras classes no projeto
                private void metodoPrivado(){}
        }

}