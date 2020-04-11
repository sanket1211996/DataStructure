package builder.array.bt;

public class ABinaryTree {
	int[] bTreeArr;
	static int lastIndex;
	

	public static int getLastIndex() {
		return lastIndex;
	}
	
	public static void incLastIndex() {
		lastIndex++;
	}
	
	public static void decLastIndex() {
		lastIndex--;
	}

	public static void setLastIndex(int lastIndex) {
		ABinaryTree.lastIndex = lastIndex;
	}

	public ABinaryTree(int bTreeSize) {
		bTreeArr =  new int[bTreeSize];
		setLastIndex(0);
	}
	
	public void insert(int data) {
		if(getLastIndex()+1<bTreeArr.length) {
			incLastIndex();
			bTreeArr[getLastIndex()] = data;
			loggerln("Data Inserted:" + data);
		}
	}
	
	public void remove(int data) {
		if(getLastIndex() == 0) {
			loggerln("ABinary Tree Empty");
			return;
		}

		for(int nIndex = 1;nIndex <bTreeArr.length-1;nIndex++) {
			if(bTreeArr[nIndex] == data) {
				bTreeArr[nIndex] =  bTreeArr[getLastIndex()];
				decLastIndex();
				loggerln(data +" :Node Removed");
				return;
			}
		}
		loggerln("Data not found");
	}
	
	public void bfsTraverse() {
		if(getLastIndex() == 0 ) {
			loggerln("ABinary Tree Empty");
			return;
		}
			
		logger("\n BFS Traverse:[");
		for(int nIndex = 1;nIndex <=getLastIndex();nIndex++) {
			logger(bTreeArr[nIndex] + ",");
		}
		loggerln("]");
	}
	
	public void inOrder(int iterator) {
		if(iterator > bTreeArr.length-1)
			return;
		inOrder(2*iterator);
		logger(bTreeArr[iterator] + ",");
		inOrder(2*iterator+1);
	}
	
	public void preOrder(int iterator) {
		if(iterator > bTreeArr.length-1)
			return;
		logger(bTreeArr[iterator] + ",");
		preOrder(2*iterator);
		preOrder(2*iterator+1);
	}
	
	public void postOrder(int iterator) {
		if(iterator > bTreeArr.length-1)
			return;
		postOrder(2*iterator);
		postOrder(2*iterator+1);
		logger(bTreeArr[iterator] + ",");
	}
	
	public void loggerln(String msg) {
		System.out.println(msg); //NOSONAR
	}
	
	public void logger(String msg) {
		System.out.print(msg); //NOSONAR
	}
}
