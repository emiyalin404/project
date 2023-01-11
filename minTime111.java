import java.util.ArrayList;
import java.util.List;

public class minTime111 {
    public static void main(String[] args){
        int n=7;
        int[][] edges={{0,1},{0,2},{1,4},{1,5},{2,3},{2,6}};        
        List<Boolean> hasApple =new ArrayList<Boolean>();
        hasApple.add(false);
        hasApple.add(false);
        hasApple.add(true);
        hasApple.add(false);
        hasApple.add(true);
        hasApple.add(true);
        hasApple.add(false);
        System.out.println(minTime(n,edges,hasApple));
    }
   public static int minTime(int n,int[][] edges,List<Boolean> hasApple){        
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
for(int[] edge:edges){
    adj.get(edge[0]).add(edge[1]);
    adj.get(edge[1]).add(edge[0]);
}
return minTimeToCollectApples(0,adj,hasApple,0);
    } 
    static int minTimeToCollectApples(int index,List<List<Integer>> adj,List<Boolean> hasApple,int parent){
        int total=0;
        for(int nbr:adj.get(index)){
            if(nbr==parent)
            continue;
            total +=minTimeToCollectApples(nbr, adj, hasApple, index);
        }
        if(index !=0&&(hasApple.get(index)||total>0))
            total +=2;
            return total;
    }
}
