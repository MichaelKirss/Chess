public class Pawn extends ChessPiece{
    public Pawn (String color){
        super (color);
    }
    @Override
    public String getColor(){
        return color;
    }
    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn){
        int [][] rules = new int[][] {{1,0},{2,0}};
        int posLine;
        int posColumn;
        int board = 7;
        posLine = line + rules[0][0];
        posColumn = column + rules[0][1];
            if (posLine < 0 || posColumn < 0 ||
                    posLine > board || posColumn > board) {
                return false;
            }
            if (toLine == posLine && toColumn == posColumn) {
                return true;
            }
                return false;
    }
    @Override
    public String getSymbol(){
        return "P";
    }
}
