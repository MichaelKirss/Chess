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
        int [][] rules   =new int[][] {{-2,-1},{-2,1},{2,-1},{2,1},{-1,-2},{-1,2},{1,-2},{1,2}};
        int posLine;
        int posColumn;
        int board = 7;
        for (int i = 0; i < rules.length; i++) {
            posLine = line + rules[i][0];
            posColumn = column + rules[i][1];
            if (posLine < 0 || posColumn < 0 ||
                posLine > board || posColumn > board){
                return false;
            }
            if (toLine == posLine && toColumn == posColumn){
                return true;
            }
        }
        if (chessBoard.board[toLine][toColumn] == null){
            return true;
        }
        if (chessBoard.nowPlayerColor().equals("White")) {
            if (chessBoard.board[toLine][toColumn] != null && chessBoard.board.equals(this.getColor().equals("Black")) ){
                return true;
            }
        }
        if (chessBoard.nowPlayerColor().equals("Black")) {
            if (chessBoard.board[toLine][toColumn] != null && chessBoard.board.equals(this.getColor().equals("White")) ){
                return true;
            }
        }
        return false;
    }
    @Override
    public String getSymbol(){
        return "H";
    }
}
