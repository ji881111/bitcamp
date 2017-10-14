package bitcamp.java100;

public class Test16_4 {
    public static void main(String[] args) {

      int i = 0;
      while (i < 5)
          System.out.println(i++);
      
      System.out.println("-----------------------------------------");
      
      i = 0;
      while (i < 5) {
          System.out.println("=>");
          System.out.println(i);
          i++;  
      }
      System.out.println("-----------------------------------------");
      
      i = 1;
      while (i <= 5) {
          int count = 1;
          while(count <= i) {
              System.out.print("*");
              count++;
          }
          System.out.println("");
          i++;
      }
      System.out.println("-----------------------------------------");
      int j;
      for(i=1; i<=5; i++) {
          for(j=1; j<=i; j++) {
              System.out.print("*");
          }
          System.out.println("");
      }
      System.out.println("-----------------------------------------");
      
      i = 1;
      while (i <= 5) {
          int count = 5;
          while(count > i) {
              System.out.print("*");
              count--;
          }
          System.out.println("");
          i++;
      }
      
      System.out.println("-----------------------------------------");
      
      i = 0;
      while (i <= 5) {
          int count = 5-i;
          while(count > 0) {
              System.out.print(" ");
              count--;
          }
          count = 1;
          while (count <= i) {
          System.out.print("*");
          count++;
          }
      System.out.println();
      i++;
      }
      
      System.out.println("-----------------------------------------");
      
      i = 1;
      while (i<=5) {
          int count = (5-i)/2;
          while (count > 0) {
              System.out.print(" ");
              count--;
          }
          count = 1;
          while (count <= i) {
              System.out.print("*");
              count++;
              }
          System.out.println();
          i += 2;
          }
      
      System.out.println("-----------------------------------------");
      
      /* 
        i = 1;
        while (i <= 5) {
            int count = (i+5)/2;
            while (count > 0) {
                System.out.print(" ");
                count--;
            }
            count = 6;
            while (count > i) {
                System.out.print("*");
                count--;
            }
            System.out.println();
            i += 2;
        }
      */
      
      System.out.println("-----------------------------------------");
      
      i = 5;
      while (i>0) {
          int count = (5-i)/2;
          while (count > 0) {
              System.out.print(" ");
              count--;
          }
          count = 1;
          while (count <= i) {
              System.out.print("*");
              count++;
              }
          System.out.println();
          i -= 2;
          }
      System.out.println("-----------------------------------------");
      
      i = 0;
      while(i<5) {
          if(i==3) {
              break;
          }
          System.out.println(i);
          i++;  
      }
      
      System.out.println("-----------------------------------------");
      
      i=0;
      while(i<5) {
          if(i == 3) {
              i++;
              continue;
          }
          System.out.println(i);
          i++;
      }
      
          System.out.println("-----------------------------------------");    
      
      i=1;
      label1: 
      while (i<=10) {
          int count = 1;
          while(count <= i) {
              System.out.print("*");
              if (count == 5) {
                  break label1;
              }
              count++;
          }
          System.out.println();
          i++;
          }
      
      System.out.println();
      System.out.println("-----------------------------------------"); 
     
      for(i=2; i<10; i++) {
          for(int p=1; p<10; p++)
              System.out.printf("%d%c%d%c%d\n",i,'*',p,'=',i*p);
              System.out.println("");
      }
      
      System.out.println("-----------------------------------------"); 
      
      int a = 2;
      while (a <=9) {
          int b = 1;
          while (b <= 9) {
              System.out.printf("%d * %d = %d\n",a,b,(a*b));
              b++;
          }
          a++;
      }

      System.out.println("-----------------------------------------");
      
      i=987654321;
      while(i > 0) {
          System.out.printf("%d",i%10);
          i /= 10;
      }
      
      System.out.println("");
      System.out.println("-----------------------------------------");
      
      i=4885323;
      int[] cnt = new int [10];
       while (i>0) {
           cnt[i%10]++;
           i/= 10;
       }
       int x = 0;
       while (x <cnt.length) {
           System.out.printf("%d = %d\n", x, cnt[x]);
           x++;
       }
      
      
    }
}