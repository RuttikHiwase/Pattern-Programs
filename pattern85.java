public class pattern85 {
    public static void main(String[] args) {
        /*
  5	9	12	14	15
	4	8	11	13
		3	7	10
			2	6
				1
*/
        int n=5;
        int count=n;
        for(int i=n;i>=1;i--)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print("\t");
            }
            int c=count;
            for(int j=i;j>=1;j--)
            {
                System.out.print(c+"\t");
                c+=j-1;
            }count--;
            System.out.println();
        }

    }

}
