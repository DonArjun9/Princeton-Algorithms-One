package union;

import union.weightedquickunion.WeightedQuickUnion;

public class Test {

	public static void main(String[] args) {
		/*QuickFind qf = new QuickFind(10);
		for (int i = 0; i < qf.i ; i++) {
			System.out.print(qf.id[i]);
		}
		System.out.println();
		qf.union(3,6);
		for (int i = 0; i < qf.i ; i++) {
			System.out.print(qf.id[i]);
		}
		System.out.println();
		qf.union(3,8);
		for (int i = 0; i < qf.i ; i++) {
			System.out.print(qf.id[i]);
		}
		System.out.println(qf.connected(2, 3));
		System.out.println(qf.connected(3, 8));*/
		
		
		
//		QuickUnion qu = new QuickUnion(10);
//		for (int i = 0; i < qu.i ; i++) {
//			System.out.print(" "+qu.id[i]);
//		}
//		System.out.println();
//		
//		qu.union(3, 5);
//		for (int i = 0; i < qu.i ; i++) {
//			System.out.print(" "+qu.id[i]);
//		}
		
//		System.out.println();

//		System.out.println();
//		qu.union(5, 6);
//		for (int i = 0; i < qu.i ; i++) {
//			System.out.print(" "+qu.id[i]);
//		}
//		
//		System.out.println(qu.root(3));
//		qu.union(0, 1);
//		for (int i = 0; i < qu.i ; i++) {
//			System.out.print(" "+qu.id[i]);
//		}
//		
//		System.out.println(qu.connected(2, 6));
		
		
		WeightedQuickUnion wqu = new WeightedQuickUnion(10);
		for (int i = 0; i < wqu.i ; i++) {
			System.out.print(" "+wqu.id[i]);
		}System.out.println();
		for (int i = 0; i < wqu.i ; i++) {
			System.out.print(" "+wqu.size[i]);
		}
		
		System.out.println();
		wqu.union(3, 5);
		for (int i = 0; i < wqu.i ; i++) {
			System.out.print(" "+wqu.id[i]);
		}System.out.println();
		for (int i = 0; i < wqu.i ; i++) {
			System.out.print(" "+wqu.size[i]);
		}
		
		System.out.println();
		wqu.union(6, 5);
		for (int i = 0; i < wqu.i ; i++) {
			System.out.print(" "+wqu.id[i]);
		}System.out.println();
		for (int i = 0; i < wqu.i ; i++) {
			System.out.print(" "+wqu.size[i]);
		}
		
		System.out.println();
		System.out.println(wqu.connected(3, 5));
	}

}
