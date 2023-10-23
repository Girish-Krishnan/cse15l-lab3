

public class ArrayExamples {

  // Changes the input array to be in reversed order
  static void reverseInPlace(int[] arr) {
    int[] arrTemp = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      arrTemp[i] = arr[i];
    }

    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = arrTemp[arr.length - i - 1];
    }
  }

  // Returns a *new* array with all the elements of the input array in reversed
  // order
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      newArray[i] = arr[arr.length - i - 1];
    }
    return newArray;
  }

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowest(double[] arr) {
    if(arr.length < 2) { return 0.0; }
    int lowestIdx = 0;
    for(int i = 1; i < arr.length; i += 1) {
      if(arr[i] < arr[lowestIdx]) { lowestIdx = i; }
    }

    double sum = 0;
    for(int i = 0; i < arr.length; i += 1) {
      if(i != lowestIdx) { sum += arr[i]; }
    }

    return sum / (arr.length - 1);
  }


}

