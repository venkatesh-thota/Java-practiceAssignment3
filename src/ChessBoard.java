class ChessBoard {

    public String[][] chessBoardPattern() {
        String[][] pattern = new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0)
                        pattern[i][j] = "WW|";
                    else
                        pattern[i][j] = "BB|";
                } else {
                    if (j % 2 == 0)
                        pattern[i][j] = "BB|";
                    else
                        pattern[i][j] = "WW|";
                }
            }
        }
        return pattern;/*
        for(int i=0;i<8;i++) {
            for (int j = 0; j < 8; j++) {

            System.out.print(pattern[i][j]);
            }
            System.out.println();
        }

        return pattern;
    }
    public  static void main(String[]args){
        chessBoardPattern();
    }*/
    }
}