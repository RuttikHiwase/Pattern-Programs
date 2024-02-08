public class pattern83 {
    public static void main(String[] args) {
        /*
 11	12	13	14	15
	7	8	9	10
		4	5	6
			2	3
				1

         */
        int n=5;
        int count =(n*(n+1)/2)-n+1;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print("\t");
            }int c=count;
            for(int j=i;j<=n;j++)
            {
                System.out.print(c+"\t");
                c++;
            }count-=n-i;
            System.out.println();
        }
    }
}
