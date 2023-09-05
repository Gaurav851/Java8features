package com.javapractise.java8.incubation26jul;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Graph {

        List<Subgraph> subgraphList;

    public List<Subgraph> getSubgraphList() {
        return subgraphList;
    }

    public void setSubgraphList(List<Subgraph> subgraphList) {
        this.subgraphList = subgraphList;
    }

    public static void main(String[] args) {
        Graph g= new Graph();

        List<Subgraph> subgraphList= new ArrayList<>();




    }
    }


    class Subgraph{
        List<vertex> vertexList;

        public List<vertex> getVertexList() {
            return vertexList;
        }

        public void setVertexList(List<vertex> vertexList) {
            this.vertexList = vertexList;
        }
    }

    class vertex{
        int id;
        String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }


