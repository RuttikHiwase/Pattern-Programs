public class pattern84 {
    public static void main(String[] args) {
        /*
  1	6	10	13	15
	2	7	11	14
		3	8	12
			4	9
				5

         */
        int n=5;
        int count=1;
        for(int i=n;i>=1;i--)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print("\t");
            }int c=count;
            for(int j=i;j>=1;j--)
            {
                System.out.print(c+"\t");
                c+=j;
            }count++;
            System.out.println();
        }
    }
}
