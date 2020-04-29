package com.myproject.datastructures.graphs.traversals.bfs;

import com.myproject.datastructures.graphs.GraphNode;

import java.util.LinkedList;
import java.util.List;

public class BFSAdjacentMatrix {

    List<GraphNode> list;
    int[][] adjacencyMatrix;

    BFSAdjacentMatrix(List<GraphNode> list){
        this.list = list;
        int size = list.size();
        adjacencyMatrix = new int[size][size];
    }




    public void addUndirectedEdge(int i, int j) {

        i--;
        j--;

        adjacencyMatrix[i][j] = 1;
        adjacencyMatrix[j][i] = 1;

    }

    public void bfs() {
        for(GraphNode node:list){
            if(!node.isVisited()){
                bfsVisited(node);
            }
        }
    }

    private void bfsVisited(GraphNode node) {

        LinkedList<GraphNode> queue = new LinkedList();
        queue.add(node);

        while(!queue.isEmpty()){
           GraphNode graphNode = queue.remove(0);
           graphNode.setVisited(true);
           System.out.print(graphNode.getName()+" ");

           for(GraphNode neighbors: graphNode.getNeighborsList()){
               if(!neighbors.isVisited()){
                   neighbors.setVisited(true);
                   queue.add(neighbors);
               }
           }
        }
    }
}
