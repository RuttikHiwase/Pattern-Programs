public class pattern78 {
    public static void main(String[] args) {
        /*
                15
			14	10
		13	9	6
	12	8	5	3
11	7	4	2	1

         */
        int n=5;
        int count=(n*(n+1)/2);
        for(int i=n;i>=1;i--)
        {
            for(int j=i;j>1;j--)
            {
                System.out.print("\t");
            }int c=count--;
            for(int j=n;j>=i;j--)
            {
                System.out.print(c+"\t");
                c-=j-1;
            }
            System.out.println();
        }
    }
}
