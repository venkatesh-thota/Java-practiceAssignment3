public class  AddTwoMatrices{

    public int[][] SumofMatrices(int rows,int columns,int row[][],int column[][]){
            int result[][]=new int[rows][columns];
            for(int i=0;i<rows;i++)
            {
                for(int j=0;j<columns;j++)
                {
                    result[i][j] =0;
                }
            }
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                result[i][j] +=row[i][j]+column[i][j];
            }
        }
        return result;
    }
}