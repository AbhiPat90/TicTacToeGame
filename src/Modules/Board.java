package src.Modules;


import java.util.LinkedList;
import java.util.List;

public class Board {
    private List<List<Cell>> cells;
    public List<List<Cell>> getCells() {
        return cells;
    }

    public void setCells(List<List<Cell>> cells) {
        this.cells = cells;
    }

    Board(int dimension){
        this.cells = new LinkedList<>();
        for(int i = 0; i<dimension; i++){
            this.cells.add(new LinkedList<>());
            for(int j = 0; j < dimension; j++){
                this.cells.get(i).add(new Cell(i, j));
            }
        }
    }

}
