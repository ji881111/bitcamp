//ver 0.4
public class App {
    
     public static void main(String[] args) {
       String[] name = {"홍길동","임꺽정","유관순"};
       int[] arr1 = {100,80,100};
       int[] arr2 = {90,80,100};
       int[] arr3 = {80,80,100};

       for(int i=0; i<name.length; i++){
        int sum = arr1[i]+arr2[i]+arr3[i];
        float aver = sum/3.0f;
        System.out.printf("-%4s,%4d,%4d,%4d,%4d,%6.1f\n",name[i],arr1[i],arr2[i],arr3[i],sum,aver);
        }

        System.out.printf("\n\n");

        int[][] scores = {{100,90,80},{80,80,80},{100,100,100}};
        for(int i=0; i<3; i++){
            System.out.printf("%-4s,",name[i]);
            int sum = 0;
            for(int j=0; j<3; j++){
                System.out.printf("%4d,",scores[i][j]);
                sum+=scores[i][j];
            }
            System.out.printf("%4d,%6.1f\n",sum,sum/3.0f);
        
        }
     }
}
