package com.Graph;

/**
 * @author evans
 * @create 2019-06-18 2019/6/18
 * --
 **/
public class Edge {
    public int weight;
    public Node from;
    public Node to;

    public Edge(int weight, Node from, Node to) {
        this.weight = weight;
        this.from = from;
        this.to = to;
    }
}
