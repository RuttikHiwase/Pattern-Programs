public class pattern100 {
    public static void main(String[] args) {
        /*5 ERROR
          54
          543
          5432
          54321
          5432
          543
          54
          5
         */
        int n=5;
       for(int i=1;i<=(n*2)-1;i++)
       {
           if(i<=n)
           {
               for(int j=1;j>=i;j--)
               {
                   System.out.print(j);}
           }
           else
               for(int j=((n*2)-i);j>=1;j--)
               {
                   System.out.print(j);
               }
           System.out.println();
       }
    }
}
