public class Queen extends ChessPiece {
    public Queen(String color){
        super (color);
    }
    @Override
    public String getColor(){
        return color;
    }
    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn){
        int board = 7;
        int decLine = Math.abs(toLine - line);
        int decColumn = Math.abs(toColumn - column);
        if (toLine == line && toColumn == column){
            return false;
        }
        if (toLine > board || toColumn > board ||
                toLine < 0     || toColumn < 0){
            return false;
        }
        if (decLine == decColumn){
            return true;
        }
        if (toLine == line && toColumn != column) {
            return true;
        } else if (toLine != line && toColumn == column) {
            return true;
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
        return "Q";
    }
}
