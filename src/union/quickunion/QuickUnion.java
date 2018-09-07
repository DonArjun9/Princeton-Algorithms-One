package union.quickunion;

public class QuickUnion {

	public int id[];
	public int i;
	
	public QuickUnion(int size) {
		i=size;
		id = new int[size];
		for (int i = 0; i < size; i++) {
			id[i] = i;
		}	
	}
	
	
	public int root(int i) {
		while(i != id[i]) {
			i= id[i];
		}
		return i;
	}
	
	public void union(int p, int q) {
		int i = root(p);
		int j = root(q);
		id[i] = j;	
	}
	
	public boolean connected(int p, int q) {
		if(root(p) == root(q)) {return true;}
		return false;
		
	}
	
}
