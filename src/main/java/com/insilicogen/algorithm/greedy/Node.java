package com.insilicogen.algorithm.greedy;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.http.codec.multipart.PartHttpMessageWriter;

import javax.swing.*;
import java.util.*;

@Getter
@Setter
@ToString
public class Node {
    private int value;
    private String name;
    private List<Node> childNodes;

    public Node(int value, String name) {
        this.value = value;
        this.name = name;
        this.childNodes = new ArrayList<>();
    }

    // 자식 추가
    public void addChildNode(Node childNode) {
        childNodes.add(childNode);
    }

    // 자식 탐색
    private Node getChildNode(int index) {
        return childNodes.get(index);
    }

    // 가장 큰 값을 가진 자식 탐색
    private Node getMaxChildNode() {
        return this.childNodes.stream().max(Comparator.comparingInt(Node::getValue)).orElse(null);
    }

    // 가장 작은 값을 가진 자식 탐색
    private Node getMinChildNode() {
        return this.childNodes.stream().min(Comparator.comparingInt(Node::getValue)).orElse(null);
    }

    // 최종 점수
    public int getGreedyScore(int score) {
        return score += score;
    }

    // 현재 노드의 최적 경로 (기준 : max값)
    public List<String> getGreedyPath(Node start) {

        List<String> greedyPath = new ArrayList<>();
        Node current = start;

        // 현재 노드부터 시작하여 각 단계에서 가장 높은 값을 가진 자식을 따라가게
        while (current != null) {
            greedyPath.add(current.getName()); // 현재 노드를 경로에 추가
            current = current.getMaxChildNode(); // 가장 큰 값을 가진 자식으로 이동
        }

        return greedyPath;
    }
    
    // 실행
    public int run(Node start, List<String> path) {
        int score = start.value;
        path.add(start.getName());
        if (!start.getChildNodes().isEmpty()) {
            score = getGreedyScore(start.value);
            run(start.getMaxChildNode(), path);
        }
        return score;
    }
}