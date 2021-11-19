/*
 */
package vetormédia;

public class VetorMédia {

    public static void main(String[] args) {
        // TODO code application logic here
        
        double[] notas={7,8,6,9,8.5,7,9,8,8,9.5}; 
        
        double media = 0;
        for(int i = 0; i < notas.length; i++)
            media += notas[i];

        double total = media / notas.length;

        System.out.println("A média é: "+total);
        
    }
    
}
