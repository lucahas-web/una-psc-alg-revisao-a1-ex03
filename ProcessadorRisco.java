import java.util.Scanner;

public class ProcessadorRisco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] notasRisco = new int[15];
        int soma = 0;
        int totalpesos = 0;

      
        for (int i = 0; i < 5; i++){
            System.out.print("Digite a nota do analista " + (i+1) + ": ");
            notasRisco[i] = scanner.nextInt();
            notasRisco[i] = notasRisco[i] * 3;
            soma += notasRisco[i];
            totalpesos += 3;
            }
        
        for (int i = 5; i < 15; i++) {
            System.out.print("Digite a nota do analista " + (i+1) + ": ");
            notasRisco[i] = scanner.nextInt();
            soma += notasRisco[i];
            totalpesos += 1;
            }
        double mediaPonderada = (double) soma/totalpesos;
        System.out.println("\nNotas ponderadas dos analistas:");
        for (int i = 0; i < 15; i++) {
            System.out.print(notasRisco[i] + " ");      
            }
        System.out.println("\nMédia ponderada do risco: " + mediaPonderada);

        int alarmantes = 0;
        int otimistas = 0;

        for (int nota : notasRisco){
            if (nota <= 20){
                otimistas++;
            } else if (nota >= 90) {
                alarmantes++;
            }
        }
        System.out.println("Analistas otimistas " + otimistas);
        System.out.println("Analistas alarmantes: " + alarmantes);

        if (mediaPonderada > 70){
            System.out.println("Alto Risco: Venda ou reajuste de portfólio recomendado.");
        } else if (mediaPonderada >= 40 && mediaPonderada <=70){
            System.out.println("Risco Moderado: Acompanhar de perto, mas manter os ativos.");
        } else if (mediaPonderada < 40){
            System.out.println("Baixo Risco: Excelente momento para capitalização.");
        }

        scanner.close();


        
    }
}
