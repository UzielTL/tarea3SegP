
/**
 * Write a description of class Tarea here.
 * 
 * @author Uziel Ticona Ledezma 
 * @version 12/06/2021
 */
public class Tarea{
    int [][]matriz;
    Tarea(int n){
        matriz= new int [n][n];
    }
    
    public int [][] recorridoCaracol(int n){
        matriz= new int [n][n];
        int inicio= 0;
        int limite= n-1;
        int c= 1;
        while(c<=(n*n)){
            for(int i=inicio;i<=limite;i++){
                matriz[inicio][i]=c++;
            }
            for(int i=inicio+1; i<=limite;i++){
                matriz[i][limite]=c++;
            }
            for(int i=limite-1;i>=inicio;i--){
                matriz[limite][i]=c++;
            }
            for(int i=limite-1;i>=inicio+1;i--){
                matriz[i][inicio]=c++;
            }
            inicio= inicio+1;
            limite= limite-1;
        }
        return matriz;
    }
    
    public int [][] DiagonalPS(int n){
        matriz= new int [n][n];
        int [] dP = new int [matriz.length];
        int [] dS = new int [matriz.length];
        int c =1;
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                matriz[i][j]=c++;
            }
            System.out.println(matriz);
        }
        for(int i=0;i<matriz.length;i++){
            for(int j=0; j<matriz[i].length; j++){
                if(i==j){
                    dP[i]=matriz[i][j];
                }
                if(i+j==matriz.length-1){
                    dS[i]=matriz[i][j];
                }
            }
        }
        return matriz;
    }
    public void Imprimir(){
        for(int i=0;i<matriz.length;i++){
            System.out.println();
            for(int j=0;j<matriz.length;j++){
                System.out.print(matriz[i][j]+"\t");
            }
        }
    }
}
