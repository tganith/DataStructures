package com.myproject.datastructures.graphs;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {

    private String name;
    private boolean isVisited;
    private List<GraphNode> neighborsList = new ArrayList<>();
    private GraphNode parent;
    private int index;

    public GraphNode(String name){
        this.name = name;
    }

    public GraphNode(String name,int index){
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public List<GraphNode> getNeighborsList() {
        return neighborsList;
    }

    public void setNeighborsList(List<GraphNode> neighborsList) {
        this.neighborsList = neighborsList;
    }

    public GraphNode getParent() {
        return parent;
    }

    public void setParent(GraphNode parent) {
        this.parent = parent;
    }
}
