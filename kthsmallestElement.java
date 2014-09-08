
class kthsmallestElement{
	static int kthSmallest(int[] array1, int[] array2, int k){
		int j=0;
		int index=1;
		for(int i=0;i<array1.length;){
			if(j<array2.length){
				if(array1[i]<array2[j]){
	///				System.out.println(array1[i]);
					if(index==k){
						return array1[i];
					}
					index++;
					i++;
				}else{
	//				System.out.println(array2[j]);
					if(index==k){
						return array2[j];
					}
					index++;
					j++;
				}
			}
			else{
				if(index==k){
						return array1[i];
					}
					index++;
					i++;
			}	
		}
		if(j<array2.length){
			for(j=j;j<array2.length;){
								if(index==k){
						return array2[j];
					}
					index++;
					j++;
			}
		}
	return -1;	
}
	public static void main(String[] args) {
		int[] array1={1,5,5,5,9};
		int[] array2={2,5,6,8};
	 	System.out.println("Kth Smallest Element is--"+kthSmallest(array1,array2,6)); 
		 			
	}
}