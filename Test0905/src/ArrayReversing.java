

	
		
		
		public class ArrayReversing {
			public static void main(String a[]){
			int arr[]={ 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8  };
			int temp;
			int as = arr.length;
			int k = as-1;

			System.out.println("Array Before Reversing");
			printArray(arr);//method used to print array on screen

			ArrayReverse://using loops with title
			for(int i = 0; i < arr.length/2 ; i++){
			temp = arr[k];// swaping
			arr[k] = arr[i];
			arr[i] = temp;

			k--;
			}
			System.out.println("Array After Reversing");
			printArray(arr); // calling the method printArray to print the elements of array
			}

			static void printArray(int ar[]){
			PrintArray:
			for(int l:ar)
			System.out.println(l);
			}

			}

	