//package com.insilicogen.algorithm.greedyJK;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class GreedyAlgorithm {
//    // tree 초기화
//    public static Node initTree() {
//        Node root = new Node(5);
//
//        Node node_1 = new Node(7);
//        Node node_2 = new Node(10);
//        Node node_3 = new Node(8);
//
//        root.addChild(node_1);
//        root.addChild(node_2);
//        root.addChild(node_3);
//
//        Node node_1_1 = new Node(7);
//        Node node_1_2 = new Node(5);
//        Node node_1_3 = new Node(9);
//
//        node_1.addChild(node_1_1);
//        node_1.addChild(node_1_2);
//        node_1.addChild(node_1_3);
//
//        Node node_2_1 = new Node(4);
//        Node node_2_2 = new Node(3);
//
//        node_2.addChild(node_2_1);
//        node_2.addChild(node_2_2);
//
//        Node node_3_1 = new Node(4);
//        Node node_3_2 = new Node(5);
//
//        node_3.addChild(node_3_1);
//        node_3.addChild(node_3_2);
//
//        return root;
//    }
//
//    // 탐색 (isMaxPath 에 따라 큰 값 찾기(true), 작은 값 (false) 찾기)
//    public static List<Node> search(Node node, boolean isMaxPath, List<Node> path) {
//        path.add(node);
//        Node searchNode = isMaxPath ? node.getHighestChild() : node.getLowestChild();
//        if(searchNode != null) {
//            // 재귀 호출
//            return search(searchNode, isMaxPath, path);
//        } else {
//            return path;
//        }
//    }
//
//    public static void main(String[] args) {
//        Node root = initTree();
//        List<Node> path = search(root, true, new ArrayList<Node>());
//        System.out.println("경로 : " + path.stream().map(Node::getValue).toList());
//        System.out.println("점수 : " + path.stream().mapToInt(Node::getValue).sum());
//    }
//
//}
