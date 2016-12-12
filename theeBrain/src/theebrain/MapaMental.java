package theebrain;
import java.util.ArrayList;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
class MapaMental {
   
    Graph grafo;

    public MapaMental(Graph grafo) {
        this.grafo = grafo;
    }

    public Graph getGrafo() {
        return grafo;
    }

    public void setGrafo(Graph grafo) {
        this.grafo = grafo;
    }
    
    @Override
    public String toString() {
        return "MapaMental{" + '}';
    }
    
}
