package com.nou.lc.dfs;

import java.util.*;

public class LC399 {

    // 图里的目标节点
    class Edge {

        private String dest;
        private double value ;

        public Edge(String key, double value){

            this.dest = key;
            this.value = value;

        }

        public String getDest() {
            return dest;
        }

        public void setDest(String dest) {
            this.dest = dest;
        }

        public double getValue() {
            return value;
        }

        public void setValue(double value) {
            this.value = value;
        }
    }

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {

        // 1. buildGraph

        Map<String,List<Edge>> graph = buildGraph(equations,values);

        // 2. dfs traverse


        double[] result = new double[queries.size()];

        for(int i=0;i<queries.size();i++){

            result[i] = dfs(queries.get(i).get(0),queries.get(i).get(1),new HashSet<>(),graph);

        }
        return result;
    }


    public double dfs(String src, String dest, Set<String> visitedSet, Map<String,List<Edge>> graph){

        if(!graph.containsKey(src) || !graph.containsKey(dest)){
            return  -1.0;
        }
        if(src.equals(dest)){

            return 1;

        }
        // 这个地方判断很关键，否则会死循环
        visitedSet.add(src);

        List<Edge> edgeList = graph.get(src);

        for(Edge edge:edgeList){

            // 这个地方判断很关键，否则会死循环
            if(visitedSet.contains(edge.getDest())){
                continue;
            }

            double subResult = dfs(edge.getDest(),dest,visitedSet,graph);
            if(subResult!=-1){
                return subResult*edge.getValue();
            }

        }
        return -1.0;
    }


    // build the structure
    public Map<String,List<Edge>> buildGraph(List<List<String>> equations, double[] values){

        Map<String,List<Edge>> result = new HashMap<>();

        int size = equations.size();

        for(int i=0;i<size;i++){

            List<String> equation = equations.get(i);

            String first = equation.get(0);
            String second = equation.get(1);
            result.putIfAbsent(first,new ArrayList<>());
            result.putIfAbsent(second,new ArrayList<>());

            Edge firstEdge = new Edge(second,values[i]);
            result.get(first).add(firstEdge);

            Edge secondEdge = new Edge(first,1/values[i]);
            result.get(second).add(secondEdge);

        }
        return  result;
    }


}
