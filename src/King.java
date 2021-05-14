import javax.swing.*;

public class King extends Piece {
    boolean hasmoved;
    public King(boolean isWhite){
        super(isWhite);
        hasmoved = false;
        if(isWhite){
            icon = new ImageIcon("Images/wk.png");
        }
        else{
            icon = new ImageIcon("Images/bk.png");
        }
        image = new JLabel(icon);
    }

    public King(King k){
        super(k);
        hasmoved = k.hasmoved;
    }
    public boolean canMove(Board b, Square start, Square end) {

        // If piece with same color
        if(end.piece != null){
            if (end.piece.getColor() == this.getColor()) {
                return false;
            }
        }
        // Can only move to a neighboring square
        if (Math.abs(end.position.x-start.position.x) > 1 || Math.abs(end.position.y-start.position.y) > 1)
            return false;

        return true;
    }



}
