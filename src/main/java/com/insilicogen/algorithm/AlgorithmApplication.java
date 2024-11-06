package com.insilicogen.algorithm;

import com.insilicogen.algorithm.greedy.Node;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class AlgorithmApplication {

    public static void main(String[] args) {
//        SpringApplication.run(AlgorithmApplication.class, args);

        // root Node
        Node root = new Node(5, "root");

        // middle Node
        Node node_1 = new Node(7, "node_1");
        Node node_2 = new Node(10, "node_2");
        Node node_3 = new Node(8, "node_3");

        // leaf Node
        Node node_1_1 = new Node(7, "node_1_1");
        Node node_1_2 = new Node(5, "node_1_2");
        Node node_1_3 = new Node(9, "node_1_3");

        Node node_2_1 = new Node(4, "node_2_1");
        Node node_2_2 = new Node(3, "node_2_2");

        Node node_3_1 = new Node(4, "node_3_1");
        Node node_3_2 = new Node(5, "node_3_2");

        // root Node에 자식 추가
        root.addChildNode(node_1);
        root.addChildNode(node_2);
        root.addChildNode(node_3);

        // middle Node에 자식 추가
        node_1.addChildNode(node_1_1);
        node_1.addChildNode(node_1_2);
        node_1.addChildNode(node_1_3);

        node_2.addChildNode(node_2_1);
        node_2.addChildNode(node_2_2);

        node_3.addChildNode(node_3_1);
        node_3.addChildNode(node_3_2);


        List<String> path = new ArrayList<>();
        int maxScore = root.run(root, path);

        System.out.println("최종 점수 : " + maxScore);
        System.out.println("전체 경로 : " + path);

        // 특정 노드의 자식 노드까지 확인하기 (최적 경로 적용되있음)
        System.out.println("현재 경로 : " + root.getGreedyPath(node_1_1));

    }
}
