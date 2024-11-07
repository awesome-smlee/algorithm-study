package com.insilicogen.algorithm.greedy;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class Node2 {
    private final int value;
    private final String name;
    private final List<Node2> childNodes;
    private final List<String> greedyPath;

    public Node2(int value, String name) {
        this.value = value;
        this.name = name;
        this.childNodes = new ArrayList<>();
        this.greedyPath = new ArrayList<>();
    }

    public void addNode(Node2 node) {
        this.childNodes.add(node);
    }

    private Node2 getMaxChildNode(){
        if(!this.childNodes.isEmpty()){
            Node2 maxNode = this.childNodes.getFirst();
            for(Node2 targetNode : this.childNodes){
                System.out.println("targetNode : "+targetNode);
                if(targetNode.getValue() > maxNode.getValue()){
                    maxNode = targetNode;
                }
            }
            return maxNode;
        }
        return null;
    }

    public int maxScore(){
        this.greedyPath.clear();
        return maxScore(this.greedyPath);
    }

    private int maxScore(List<String> names) {
        int score = this.value;
        names.add(this.name);
        System.out.println("names : " + names);

        Node2 maxNode = getMaxChildNode();
        if(maxNode != null){
            score += maxNode.maxScore(names);
        }
        return score;
    }

    public void printGreedyInfo(){
        String name = this.name;
        String scoreMessage = "Greedy score:\t" + this.maxScore();
        String pathMessage = "Greedy path:\t" + String.join(" ->", this.greedyPath);

        System.out.println(name + "\t" + scoreMessage);
        System.out.println(name + "\t" + pathMessage + "\n");
    }

}

