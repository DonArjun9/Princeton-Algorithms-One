package union.quickfind;

public class QuickFind {

	public int[] id;
	int i;
	
	public QuickFind(int size) {
		i=size;
		id = new int[size];
		for (int i = 0; i < size; i++) {
			id[i] = i;
		}
	}

	
	public void union(int p, int q) { 
		int pid = id[p];
		int qid = id[q];
		for (int i = 0; i < id.length; i++) {
			if ( pid == id[i]) {
				id[i] =  qid;
			}
		}
	}
	
	public boolean connected(int p, int q) {
		if(id[p]==id[q]) {return true;}
		return false;
		
	}

	
	
}
