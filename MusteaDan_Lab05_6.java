//Mustea Dumitru-Dan Lab05_6

public class MusteaDan_Lab05_6 {
    public static void main(String[] args){
    Pawn a = new Pawn();
    Rook b = new Rook();
    Bishop c = new Bishop();
    Knight d = new Knight();
    King e = new King();
    Queen f = new Queen();
    Coordinates currentPosition = new Coordinates();
    display(a.move(currentPosition, Direction.N));
    display(b.move(currentPosition, Direction.S));
    display(c.move(currentPosition, Direction.NE));
    display(d.move(currentPosition, Direction.NW));
    display(e.move(currentPosition, Direction.W));
    display(f.move(currentPosition, Direction.SE));
    }

    static void display(Coordinates aux){
        System.out.println(aux.x+":"+aux.y);
    }

}
enum Direction {N, S, E, W, NE, NW, SE, SW};

class Coordinates{
    public int x;
    public int y;
    Coordinates(){
        this.x=0;
        this.y=0;
    }

    // x - horizontal       0 -----> N
    // y - vertical         0 ^ N   
}


interface ChessPiece{
    public Coordinates move(Coordinates piece, Direction dirChosen);
}

class Pawn implements ChessPiece{
    public Coordinates move(Coordinates piece, Direction dirChosen){
        Coordinates aux = new Coordinates();
        switch(dirChosen) {
            case N:
                aux.x=piece.x;
                aux.y=piece.y+1;
                return aux;
            case NE:
                aux.x=piece.x+1;
                aux.y=piece.y+1;
            return aux;
            case NW:
                aux.x=piece.x-1;
                aux.y=piece.y+1;
                return aux;
            default:
                return aux;
        }
    }
}

class Rook implements ChessPiece{
    public Coordinates move(Coordinates piece, Direction dirChosen){
        Coordinates aux = new Coordinates();
        switch(dirChosen) {
            case N:
                aux.x=piece.x;
                aux.y=piece.y+1;
                return aux;
            case S:
                aux.x=piece.x;
                aux.y=piece.y-1;
            return aux;
            case E:
                aux.x=piece.x+1;
                aux.y=piece.y;
                return aux;
            case W:
                aux.x=piece.x-1;
                aux.y=piece.y;
                return aux;
            default:
                return aux;
        }
    }
}

class Bishop implements ChessPiece{
    public Coordinates move(Coordinates piece, Direction dirChosen){
        Coordinates aux = new Coordinates();
        switch(dirChosen) {
            case NE:
                aux.x=piece.x+1;
                aux.y=piece.y+1;
                return aux;
            case NW:
                aux.x=piece.x-1;
                aux.y=piece.y+1;
                return aux;
            case SE:
                aux.x=piece.x+1;
                aux.y=piece.y-1;
            case SW:
                aux.x=piece.x-1;
                aux.y=piece.y-1;
            default:
                return aux;
        }
    }
}

class Knight implements ChessPiece{
    /*
    Knight Move Pattern for each direction:

    X#         #X            #
    X   = N     X = NW     XXx = NE    ...
    X           X               
    */ 
    public Coordinates move(Coordinates piece, Direction dirChosen){
        Coordinates aux = new Coordinates();
        switch(dirChosen) {
            case N:
                aux.x=piece.x+1;
                aux.y=piece.y+2;
                return aux;
            case S:
                aux.x=piece.x-1;
                aux.y=piece.y-2;
            return aux;
            case E:
                aux.x=piece.x+2;
                aux.y=piece.y-1;
                return aux;
            case W:
                aux.x=piece.x-2;
                aux.y=piece.y+1;
                return aux;
            case NE:
                aux.x=piece.x+2;
                aux.y=piece.y+1;
                return aux;
            case NW:
                aux.x=piece.x-1;
                aux.y=piece.y+2;
                return aux;
            case SE:
                aux.x=piece.x+1;
                aux.y=piece.y-2;
            case SW:
                aux.x=piece.x-2;
                aux.y=piece.y-1;
            default:
                return aux;
        }
    }
}

class King implements ChessPiece{
    public Coordinates move(Coordinates piece, Direction dirChosen){
        Coordinates aux = new Coordinates();
        switch(dirChosen) {
            case N:
                aux.x=piece.x;
                aux.y=piece.y+1;
                return aux;
            case S:
                aux.x=piece.x;
                aux.y=piece.y-1;
            return aux;
            case E:
                aux.x=piece.x+1;
                aux.y=piece.y;
                return aux;
            case W:
                aux.x=piece.x-1;
                aux.y=piece.y;
                return aux;
            default:
                return aux;
        }
    }
}

class Queen implements ChessPiece{
    public Coordinates move(Coordinates piece, Direction dirChosen){
        Coordinates aux = new Coordinates();
        switch(dirChosen) {
            case N:
                aux.x=piece.x;
                aux.y=piece.y+1;
                return aux;
            case S:
                aux.x=piece.x;
                aux.y=piece.y-1;
            return aux;
            case E:
                aux.x=piece.x+1;
                aux.y=piece.y;
                return aux;
            case W:
                aux.x=piece.x-1;
                aux.y=piece.y;
                return aux;
            case NE:
                aux.x=piece.x+1;
                aux.y=piece.y+1;
                return aux;
            case NW:
                aux.x=piece.x-1;
                aux.y=piece.y+1;
                return aux;
            case SE:
                aux.x=piece.x+1;
                aux.y=piece.y-1;
            case SW:
                aux.x=piece.x-1;
                aux.y=piece.y-1;
            default:
                return aux;
        }
    }
}

