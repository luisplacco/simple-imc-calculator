import java.util.Scanner; 
import java.util.Locale;
public class Main {     public static void main(String[] args) {

      
        Scanner scanner = new Scanner (System.in).useLocale(Locale.forLanguageTag("US")); 
            System.out.println("qual seu peso?");
            double peso = scanner.nextDouble();
            System.out.println("qual sua altura?");
            double altura = scanner.nextDouble();
            double imc = peso/(altura*altura);
            String formatarimc = String.format("%.2f", imc);

            if (imc < 18.5){
            
                System.out.print("seu imc é: " + formatarimc + " vc esta abaixo do peso");
            }
            else if (imc > 18.5 && imc < 24.9) {

                System.out.print("seu imc é: " + formatarimc + " vc esta no peso normal");
            }
            else if (imc > 24.9 && imc < 29.9){
                System.out.print("seu imc é: " + formatarimc + " vc esta no sobrepeso :/");
            }
            else if(imc > 29.9 && imc <39.9){
                System.out.print("seu imc é: "+ formatarimc + " vc esta obeso");
            }
            else {
                System.out.print("seu imc é: " + formatarimc+ " vc esta obeso morbido");
            }

        
        }
            
    }


