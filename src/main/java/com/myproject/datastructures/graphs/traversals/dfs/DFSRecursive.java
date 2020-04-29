package com.myproject.datastructures.graphs.traversals.dfs;

import com.myproject.datastructures.graphs.GraphNode;

import java.util.List;

public class DFSRecursive {

    List<GraphNode> list;



    public DFSRecursive(List<GraphNode> list) {
        this.list = list;
    }

    public void addUndirectedEdge(int i, int j) {
       GraphNode first = list.get(i-1);
       GraphNode second = list.get(j-1);

       first.getNeighborsList().add(second);
       second.getNeighborsList().add(first);
    }

    public void dfs() {

        for(GraphNode node :list){
            if(!node.isVisited()){
                dfsVisit(node);
            }
        }
    }

    private void dfsVisit(GraphNode node) {

        node.setVisited(true);
        System.out.println(node.getName()+" ");
        for(GraphNode graphNode:node.getNeighborsList()){

            if(!graphNode.isVisited()){
               dfsVisit(graphNode);
            }
        }
    }
}
