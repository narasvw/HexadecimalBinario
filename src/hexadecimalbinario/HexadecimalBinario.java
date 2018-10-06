package hexadecimalbinario;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class HexadecimalBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String hexadecimal, binario = "";
        
        boolean b = true, sw = true;
        
        String valores [][] = {
            {"0","0000"},
            {"1","0001"},
            {"2","0010"},
            {"3","0011"},
            {"4","0100"},
            {"5","0101"},
            {"6","0110"},
            {"7","0111"},
            {"8","1000"},
            {"9","1001"},
            {"A","1010"},
            {"B","1011"},
            {"C","1100"},
            {"D","1101"},
            {"E","1110"},
            {"F","1111"}
        };
        
        System.out.println("Introduce el valor en hexadecimal");
        
        hexadecimal = sc.nextLine();
        
        hexadecimal = hexadecimal.toUpperCase();
        
        for (int i = 0; i < hexadecimal.length() && b; i++) {
            
            if ((hexadecimal.charAt(i) < 0 && hexadecimal.charAt(i) > 9) || 
                    (hexadecimal.charAt(i) <= 'A' && 
                        hexadecimal.charAt(i) >= 'F')) {
                
                b = false;
                
            } else if (hexadecimal.charAt(i) == '.') {
                
                binario += '.';
                
            }
            
            String aux = String.valueOf(hexadecimal.charAt(i));
            
            for (int j = 0; j < valores.length && sw; j++) {
                
                if (valores[j][0].equalsIgnoreCase(aux)) {
                    
                    binario += valores[j][1];
                    sw = false;
                    
                }
                
            }
            
            sw = true;
            
        }
        
        if (binario.startsWith("0") || binario.endsWith("0")) {
            
            binario = binario.substring(
                    binario.indexOf("1"), binario.lastIndexOf("0"));
            
        }
        
        if (!b) {
            
            System.out.println("No es un número hexadecimal.");
            
        } else {
            
            System.out.println("El valor en hexadecimal: " + hexadecimal +
                    " en binario equivale a: " + binario);
            
        }
        
    }
    
}