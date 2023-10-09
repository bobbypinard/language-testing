public class ChaosSearch{
  public static void main(String args[]){
    int[] ray = setArray(100);
    int count = 0;
    boolean bool = isSorted(ray);
      
    for(int element: ray){
      System.out.print(element);
      System.out.print(' ');
    }
    System.out.println();

    while(bool == false){
      count++;
      ray = sort(ray);      
      bool = isSorted(ray);
      if(bool){
        break;
      }
    }

      for(int element: ray){
        System.out.print(element);
        System.out.print(' ');
      }
      System.out.println();
    System.out.println("It's sorted in " + count + " steps.");
  }

  static int[] setArray(int arrayMax){
    int[] ar = new int[arrayMax];
    
    for(int i = 0; i < ar.length; i++){
      ar[i] = (int)Math.floor(Math.random() * (10000 - 1) + 1);
    }
    return ar;
  }

  static int[] sort(int[] unsortedArray){
    int[] sortedArray = unsortedArray;
    int placeholder;
    for(int i = sortedArray.length-1; i >= 0; i--){
      int randInt = (int) ((Math.random() * (i - 0)) + 0);
      placeholder = sortedArray[randInt];
      sortedArray[randInt] = sortedArray[i];
      sortedArray[i] = placeholder;
    }
    return sortedArray;
  }

  public static boolean isSorted(int[] schrodingersArray){
    for(int i = 0; i < schrodingersArray.length - 1; i++){
      if(schrodingersArray[i] > schrodingersArray[i + 1]){
        return false; 
      }
    }
    return true;
  }
}
