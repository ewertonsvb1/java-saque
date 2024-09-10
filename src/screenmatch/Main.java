package screenmatch;

public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
                System.out.println("Filme: Top Gun: Maverick");

                int anoDeLancamento = 2022;
                System.out.println("Ano de lançamento:" + anoDeLancamento);
                boolean incluidoNoPlano = true;
                double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = "Filme de aventura com galÃ£ dos anos 80";
        System.out.println(sinopse);
        
        int classificacao = (int) (media / 2);
        System.out.println("Estrelas: " + classificacao);
        
        
        double temp = 34.5;
        double convertido = (temp * 1.8) + 32;
        int convertidoInteiro = (int) convertido;
        System.out.println("Temperatura atual em Celsius: " + temp +"°C");
        System.out.println("Temperatura atual em Fahrenheit: " + convertido +"°F");
        System.out.println("Temperatura atual em Fahrenheit: " + convertidoInteiro +"°F");
    }
}