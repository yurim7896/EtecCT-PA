/*
 */
package vetorcrescente;

public class VetorCrescente {

    public static void main(String[] args) {
        int ordem[]={40,43,7,3,70,54,121,1};
        int aux = 0;
        
       for (int i = 0; i < ordem.length; i++)
            {
                for (int j = 0; j < ordem.length; j++)
                {
                    if (ordem[i] < ordem[j])
                    {
                        aux = ordem[i];
                        ordem[i] = ordem[j];
                        ordem[j] = aux;
                    }
                }
            }
            for (int x = 0; x < ordem.length; x++)
            {
                System.out.println(ordem[x]);
            }
    }
       
}