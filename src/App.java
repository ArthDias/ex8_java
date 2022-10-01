import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Scanner console = new Scanner(System.in);

        double salarioHora = 0f;
        float horasTrabalhadasMes = 0f;
        double salarioMensal = 0f;

        System.out.println("Quanto você ganha por hora? ");
        salarioHora = console.nextDouble();
        System.out.println("Quantas horas você trabalha por mês? ");
        horasTrabalhadasMes = console.nextFloat();

        salarioMensal = salarioHora * horasTrabalhadasMes;
    
        System.out.printf("Seu salário mensal é R$%.2f.", salarioMensal);
        console.close();
    }
}
