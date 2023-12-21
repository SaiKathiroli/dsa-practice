class Solution {
    List<List<Integer>> arr = new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) 
    {
        int[] X = graph[0];
        for(int V:X)
        {
            List<Integer> xrr = new ArrayList<>();
            xrr.add(0);
            xrr.add(V);
            helper(graph,xrr);
        }
        return arr;
    }

    public void helper(int[][] graph,List<Integer> xrr)
    {
        if(xrr.get(xrr.size()-1) == graph.length-1)
        {
            arr.add(xrr);
            return;
        }
        int index = xrr.get(xrr.size()-1);
        int[] X  = graph[index];
        for(int V:X)
        {
            List<Integer> zrr = new ArrayList<>();
            zrr.addAll(xrr);
            zrr.add(V);
            helper(graph,zrr);
        }
    }
}