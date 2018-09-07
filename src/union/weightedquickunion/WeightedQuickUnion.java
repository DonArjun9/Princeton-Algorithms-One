package union.weightedquickunion;

public class WeightedQuickUnion {
	
	public int[] id;
	public int[] size;
	public int i;
	
	
	public WeightedQuickUnion(int n) {
		i = n;
		id = new int[n];
		size = new int[n];
		for (int i = 0; i < n; i++) {
			id[i]=i;
			size[i]=1;
		}
	}
	
	public int root(int i) {
		while(i != id[i]) {
			i = id[i];
		}
		return i;	
	}
	
	public void union(int p, int q) {
		int i =root(p);
		int j =root(q);
		if(i == j) {
			return;
		}
		if(size[i] < size[j]) {
			id[i] = j;
			size[j] = size[i]+1;
			
		}else {
			id[j] = i;
			size[i] = size[j]+1;
			
		}
		
	}
	
	public boolean connected(int p, int q) {
		if(root(p)==root(q)) {return true;}
		return false;
		
	}
	
	

}
