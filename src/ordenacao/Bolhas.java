package ordenacao;

public class Bolhas {

   public static void bolhas(int v[]){
       for (int i = 0; i < v.length - 1; i++){
           for (int j = 0; j < v.length - i; j++){
               if (v[j] > v[j+i]){
                   int x = v[j];
                   v[j] = v[j+1];
                   v[j+1] = x;
               }
           }

       }
   }
}
