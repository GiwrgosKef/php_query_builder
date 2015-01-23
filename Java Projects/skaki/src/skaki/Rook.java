package skaki;

import java.awt.Point;
import java.util.ArrayList;

public class Rook extends Piece{

    public Rook(String color, Point position) {
        super(color, "Rook", position);
    }

    @Override
    public ArrayList<Point> getPossibleMovements(Board b) {
        ArrayList<Point> moves = new ArrayList<Point>();
        if(this.getColor().equals("Black")){
            for (int i = this.getPosition().x, j = this.getPosition().y + 1;j < 8;j++) {
                if(b.findPieceAtPosition(new Point(i,j)) == null){
                    moves.add(new Point(i,j));
                }else{
                    if(b.findPieceAtPosition(new Point(i,j)).getColor().equals(this.getColor()) == false){
                        moves.add(new Point(i,j));
                    }
                    break;
                }                
            }
            
            for (int i = this.getPosition().x, j = this.getPosition().y - 1;j >= 0;j--) {
                if(b.findPieceAtPosition(new Point(i,j)) == null){
                    moves.add(new Point(i,j));
                }else{
                    if(b.findPieceAtPosition(new Point(i,j)).getColor().equals(this.getColor()) == false){
                        moves.add(new Point(i,j));
                    }
                    break;
                }                
            }
            
            for (int i = this.getPosition().x - 1, j = this.getPosition().y;i >= 0;i--) {
                if(b.findPieceAtPosition(new Point(i,j)) == null){
                    moves.add(new Point(i,j));
                }else{
                    if(b.findPieceAtPosition(new Point(i,j)).getColor().equals(this.getColor()) == false){
                        moves.add(new Point(i,j));
                    }
                    break;
                }                
            }
            
            for (int i = this.getPosition().x + 1, j = this.getPosition().y;i < 8;i++) {
                if(b.findPieceAtPosition(new Point(i,j)) == null){
                    moves.add(new Point(i,j));
                }else{
                    if(b.findPieceAtPosition(new Point(i,j)).getColor().equals(this.getColor()) == false){
                        moves.add(new Point(i,j));
                    }
                    break;
                }                
            }
        }else{
            for (int i = this.getPosition().x, j = this.getPosition().y + 1;j < 8;j++) {
                if(b.findPieceAtPosition(new Point(i,j)) == null){
                    moves.add(new Point(i,j));
                }else{
                    if(b.findPieceAtPosition(new Point(i,j)).getColor().equals(this.getColor()) == false){
                        moves.add(new Point(i,j));
                    }
                    break;
                }                
            }
            
            for (int i = this.getPosition().x, j = this.getPosition().y - 1;j >= 0;j--) {
                if(b.findPieceAtPosition(new Point(i,j)) == null){
                    moves.add(new Point(i,j));
                }else{
                    if(b.findPieceAtPosition(new Point(i,j)).getColor().equals(this.getColor()) == false){
                        moves.add(new Point(i,j));
                    }
                    break;
                }                
            }
            
            for (int i = this.getPosition().x - 1, j = this.getPosition().y;i >= 0;i--) {
                if(b.findPieceAtPosition(new Point(i,j)) == null){
                    moves.add(new Point(i,j));
                }else{
                    if(b.findPieceAtPosition(new Point(i,j)).getColor().equals(this.getColor()) == false){
                        moves.add(new Point(i,j));
                    }
                    break;
                }                
            }
            
            for (int i = this.getPosition().x + 1, j = this.getPosition().y;i < 8;i++) {
                if(b.findPieceAtPosition(new Point(i,j)) == null){
                    moves.add(new Point(i,j));
                }else{
                    if(b.findPieceAtPosition(new Point(i,j)).getColor().equals(this.getColor()) == false){
                        moves.add(new Point(i,j));
                    }
                    break;
                }                
            }
            
        }
        return moves;
    }
    
}