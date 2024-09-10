package screenmatch;

import java.time.LocalDate;

public class Condicional {
	public static void main(String[] args) {
		
		 int anoDeLancamento = 2024;
         boolean incluidoNoPlano = true;
         double notaDoFilme = 8.1;
         int anoAtual = LocalDate.now().getYear();
         String tipoPlano = "plus"; 
         
         if ( anoDeLancamento <anoAtual) {
        	 System.out.println("Filme antigo");
         }else if (anoDeLancamento >anoAtual) {
        	 System.out.println("Filme ainda será lançado em "+ anoDeLancamento);
         }else {
        	 System.out.println("Filme novo, lançado agora em " +anoAtual);
         }
         
         if(incluidoNoPlano || tipoPlano.equals("plus")) {
        	 System.out.println("Liberado no catálogo!");
        	 
         }else {
        	 System.out.println("Não está incluso, Apenas para membros Plus!");
         }
         
         
         //SWITCH CASE EXEMPLI: 
         
         int dia = 3;
         String nomeDia;

         switch (dia) {
            case 1:
               nomeDia = "domingo";
               break;
            case 2:
               nomeDia = "segunda-feira";
               break;
            case 3:
               nomeDia = "terça-feira";
               break;
            case 4:
               nomeDia = "quarta-feira";
               break;
            case 5:
               nomeDia = "quinta-feira";
               break;
            case 6:
               nomeDia = "sexta-feira";
               break;
            case 7:
               nomeDia = "sábado";
               break;
            default:
               nomeDia = "Dia inválido";
               break;
         }

         System.out.println("O dia " + dia + " é " + nomeDia);
	}

}
