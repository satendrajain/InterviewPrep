


import java.util.Scanner;
public class zipToBarCode {


public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    System.out.print("Enter a zip code: "); 
    int zip = input.nextInt(); 
    input.close(); 
    int checkDigit = checkDigit(zip); 

    String barcode = "|"; 
    barcode = dBarCode(checkDigit) + barcode; 
    for (int i = 0; i < 5; i++) { 
    	int code = zip % 10;
        barcode = dBarCode(code) + barcode; 
        
        zip /= 10; 
    } 
  //11002  barcode = "|" + barcode; 
    System.out.println(barcode); 


} 
 public static int checkDigit(int zip) { 
    int remaining = zip; 
    int sum = 0; 
    while (remaining > 0) { 
        sum += remaining % 10; 
        remaining /= 10; 
    } 
    return 10 - (sum % 10); 
} 

public static String dBarCode(int digit) {

    if (digit == 1) { 
        return ":::||"; 
    } 
    if (digit == 2) { 
        return "::|:|"; 
    } 
    if (digit == 3) { 
        return "::||:"; 
    } 
    if (digit == 4) { 
        return ":|::|"; 
    } 
    if (digit == 5) { 
        return ":|:|:"; 
    } 
    if (digit == 6) { 
        return ":||::"; 
    } 
    if (digit == 7) { 
        return "|:::|"; 
    } 
    if (digit == 8) { 
        return "|::|:"; 
    } 
    if (digit == 9) { 
        return "|:|::"; 
    } 
    return "||:::"; 

  }

}