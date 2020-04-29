package com.myproject.datastructures.graphs.traversals.bfs;

import com.myproject.datastructures.graphs.GraphNode;

import java.util.ArrayList;
import java.util.List;

public class BFSAdjacentMatrixDemo {

    public static void main(String args[]){

        List<GraphNode> list = new ArrayList<>();

        for(int i = 1;i<=10;i++){
            list.add(new GraphNode("V"+i,i-1));
        }

        BFSAdjacentMatrix graph = new BFSAdjacentMatrix(list);
        graph.addUndirectedEdge(1,2);
        graph.addUndirectedEdge(1,4);
        graph.addUndirectedEdge(2,3);
        graph.addUndirectedEdge(2,5);
        graph.addUndirectedEdge(3,6);
        graph.addUndirectedEdge(3,10);
        graph.addUndirectedEdge(4,7);
        graph.addUndirectedEdge(5,8);
        graph.addUndirectedEdge(6,9);
        graph.addUndirectedEdge(7,8);
        graph.addUndirectedEdge(8,9);
        graph.addUndirectedEdge(9,10);

        graph.bfs();



    }
}
