public class pattern86 {
    public static void main(String[] args) {
        /*15	10	6	3	1    *************Q7*****************COMPLETED
	          14	9	5	2
		          13	8	4
		              12	7
		                   11*/


         int n=5;
         int count=(n*(n+1)/2);
         for(int i=n;i>=1;i--)
         {
             for(int j=i;j<=n;j++)
             {
                 System.out.print("\t");
             }int c=count;
             for(int j=i;j>=1;j--)
             {
                 System.out.print(c+"\t");
                 c-=j;
             }count--;
             System.out.println();
         }


    }
}
