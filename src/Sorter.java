public class Sorter {
    int[] unsortedList;

    public Sorter(int[] unsortedArgs) {
        unsortedList = unsortedArgs;
    }

    public int[] toSort() {
        int[] sortedList=this.unsortedList;
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < sortedList.length - 1; i++) {
                if (sortedList[i] > sortedList[i+1]) {
                    temp = sortedList[i];
                    sortedList[i] = sortedList[i+1];
                    sortedList[i+1] = temp;
                    sorted = false;
                }
            }
        }
        return sortedList;
    }


}
