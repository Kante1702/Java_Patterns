package behavioralPatterns.Strategy.Sorting;

public class SortingStrategyPatternDemo {
    public static void main(String[] args) {

        SortingContext sortingContext = new SortingContext(new BubbleSortStrategy());
        int[] array1 = {5, 2, 9, 1, 5};
        sortingContext.performSorting(array1);
        //sorting using bubble sort

        sortingContext.setSortingStrategy(new MergeSortStrategy());
        int[] array2 = {8, 3, 7, 4, 2};
        sortingContext.performSorting(array2);
        //sorting using merge sort

        sortingContext.setSortingStrategy(new QuickSortStrategy());
        int[] array3 = {6, 1, 3, 9, 5};
        sortingContext.performSorting(array3);
        //sorting using quick sort
    }
}
