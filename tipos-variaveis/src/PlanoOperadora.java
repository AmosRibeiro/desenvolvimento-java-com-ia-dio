public class PlanoOperadora{
    public static void main(String[] args) {
        String planoTelefonico = "B"; // Planos: T -> TURBO, M -> MIDIA, B -> BASIC

        switch (planoTelefonico){
            case "T":{
                System.out.println("5GB YOUTUBE");
            }
            case "M":{
                System.out.println("WHATS E INSTAGRAM GRÁTIS");
            }
            case "B":{
                System.out.println("100 MINUTOS DE LIGAÇÃO");
            }
        }
    }
}