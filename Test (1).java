// Write a Java program to find the maximum element in a Java array.

class Test {
  public static void main (String[]args){
    
    int arr[]={1,0,45,-1,33,6,88,886,3};
    int temp=0;
    int largest=0;
    // for largest element 
    for(int i=0;i<arr.length;i++){
      
      for(int j=0;j<arr.length;j++){
        
        if(arr[i]<arr[j]){
          temp=arr[j];
          
        }
      }
      largest=temp;
    }
    System.out.println(" largest " + largest);
    // for smallest element
    int temp1=0;
    int smallest=0;
     for(int i=0;i<arr.length;i++){
      
      for(int j=0;j<arr.length;j++){
        
        if(arr[i]>arr[j]){
          temp1=arr[j];
          
        }
      }
      smallest=temp1;
    }
    System.out.println(" smallest " + smallest);
  }
}
