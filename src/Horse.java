public class Horse extends ChessPiece{
    public Horse(String color){
        super (color);
    }
    @Override
    public String getColor(){
        return color;
    }
    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn){
        int [][] rules   =new int[][] {{-3,-1},{-3,1},{3,-1},{3,1},{-1,-3},{-1,3},{1,-3},{1,3}};
        for (int i = 0; i < rules.length; i++) {
            int pos1 = line + rules[i][0];


        }

        boolean result = true;
        return result;
    }
    @Override
    public String getSymbol(){
        return "h";
    }
}
