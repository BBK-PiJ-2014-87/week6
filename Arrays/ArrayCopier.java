package Arrays;

/**
 * @author Vladimirs Ivanovs
 * 
 * This class allows user to copy content of one array into another.
 * 
 */
public class ArrayCopier {
	int[] src;
	int[] dst;

	/**
	 * @param src source array to be copied
	 * @param dst destination array for copy operation
	 *  
	 */
	public ArrayCopier(int[] src, int[] dst) {
		this.src = src;
		this.dst = dst;
	}

	public void run(){
		if (src.length<dst.length){
			int length = src.length;
			copySameLength(length);
			copyMoreLength();		
		}else{
			int length = dst.length;
			copySameLength(length);
			
		}
		
	}
	
	public int[] getNewArray(){
		return dst;
	}
	public void printResult(){
		System.out.println("Source array: ");
		for (int e : src){			
			System.out.print(e);
		}
		System.out.println();
		System.out.println("Destination array: ");
		for (int e : dst){			
			System.out.print(e);
		}
	}
	
	public void copySameLength(int length){		
		for(int i=0; i < length; i++){
			dst[i]=src[i];
		}
	}
	
	public void copyMoreLength(){
		for(int i=src.length; i < dst.length; i++){
			dst[i]=0;
		}
	}
}
