package com.insilicogen.algorithm.greedyJK;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//@Getter
//@Setter
//@ToString
//public class Node {
//
//    private int value;
//    private List<Node> childNodes;
//
//    public Node(int value) {
//        this.value = value;
//        this.childNodes = new ArrayList<>();
//    }
//
//    public void addChild(Node node) {
//        childNodes.add(node);
//    }
//
//    // 자식 탐색
//    public Node getChild(int index) {
//        return this.childNodes.get(index);
//    }
//
//    // 가장 큰 값을 가진 자식 탐색
//    public Node getHighestChild() {
//        return this.childNodes.stream().max(Comparator.comparingInt(Node::getValue)).orElse(null);
//    }
//
//    // 가장 큰 값을 작은 자식 탐색
//    public Node getLowestChild() {
//        return this.childNodes.stream().min(Comparator.comparingInt(Node::getValue)).orElse(null);
//    }
//
//}
