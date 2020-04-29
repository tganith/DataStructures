package com.myproject.datastructures.graphs.traversals.bfs;

import com.myproject.datastructures.graphs.GraphNode;

import java.util.LinkedList;
import java.util.List;

public class BFSAdjacentList {

    List<GraphNode> list;

    public BFSAdjacentList(List<GraphNode> list) {
        this.list = list;
    }


    public void addUndirectedEdge(int i, int j) {
        GraphNode first = list.get(i-1);
        GraphNode second = list.get(j-1);

        first.getNeighborsList().add(second);
        second.getNeighborsList().add(first);
    }

    public void bfs() {
        for(GraphNode graphNode:list){
            if(!graphNode.isVisited()){
                bfsVisit(graphNode);
            }
        }
    }

    private void bfsVisit(GraphNode graphNode) {

        List<GraphNode> queue = new LinkedList<>();
        queue.add(graphNode);

        while(!queue.isEmpty()){
            GraphNode presentNode = queue.remove(0);
            presentNode.setVisited(true);

            System.out.println(presentNode.getName()+" ");

            for(GraphNode neibors:presentNode.getNeighborsList()){
                if(!neibors.isVisited()){
                    queue.add(neibors);
                    neibors.setVisited(true);
                }
            }
        }
    }
}
