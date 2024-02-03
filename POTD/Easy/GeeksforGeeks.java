import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	    Scanner in = new Scanner(System.in);
	    int t = in.nextInt();
	    while(t-- > 0){
	        int n = in.nextInt();
	        Queue<Integer> q = new LinkedList<>();
	        int i=1;
	        while(i<=n){
	            q.add(i++);
	        }
	        while(!q.isEmpty()){
	            int poll = q.poll();
	            if(q.isEmpty()){
	                System.out.println(poll);
	                break;
	            }
	            q.poll();
	            q.add(poll);
	        }
	        
	    }
	    
	 }
}
