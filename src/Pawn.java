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
        int [][] rules = new int[][] {{1,0},{2,0},{-1,0},{-2,0}};
        int posLine = 0;
        int posColumn = 0;
        int board = 7;
        if (line == toLine) {
            return false;
        }
        if (getColor()=="White") {
            if (line == 1) {
                posLine = line + rules[1][0];
                if (toLine == posLine) {
                    return true;
                }
            }
            posLine = line + rules[0][0];
            posColumn = column;
            if (posLine > board) {
                return false;
            }
        } else if (getColor()=="Black") {
            if (line == 6) {
                posLine = line + rules[3][0];
                if (toLine == posLine) {
                    return true;
                }
            }
            posLine = line + rules[2][0];
            posColumn = column;
            if (posLine < 0 ) {
                return false;
            }
                }

        if (toLine == posLine  && toColumn == posColumn) {
            return true;
        }
        return false;
    }
    @Override
    public String getSymbol(){
        return "P";
    }

}