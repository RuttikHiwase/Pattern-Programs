public class pattern74 {
    public static void main(String[] args) {
        /*
                15
			10	14
		6	9	13
	3	5	8	12
1	2	4	7	11

         */
        int n=5;
        int count=(n*(n+1)/2);
        for(int i=n;i>=1;i--)
        {
            for(int j=i;j>1;j--)
            {
                System.out.print("\t");
            }int c=count;
            for(int j=i;j<=n;j++)
            {
                System.out.print(c+"\t");
                c+=j;
            }count-=i;
            System.out.println();
        }
    }
}
