public class pattern89 {
    public static void main(String[] args) {
        /*
 15	14	12	9	5
	13	11	8	4
		10	7	3
			6	2
				1
*/
        int n=5;
        int count=(n*(n+1)/2);
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("\t");
            }
            int c=count;
            for(int j=i;j<=n;j++)
            {
                System.out.print(c+"\t");
                c-=j;
            }count-=i+1;
            System.out.println();
        }
    }
}
