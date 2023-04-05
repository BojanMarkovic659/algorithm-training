import test.dynamicstructures.DynamicStackTest;
import test.dynamicstructures.SinglyLinkedListTest;
import test.searchalgorithms.SearchAlgorithmsTest;
import test.sorting.SortingAlgorithmsTest;
import test.staticstructures.StaticStackGenericsTest;
import test.staticstructures.StaticStackTest;

public class Test {

    public static void main(String[] args) {
        SinglyLinkedListTest singlyLinkedListTest = new SinglyLinkedListTest();
        singlyLinkedListTest.testAll();
        SearchAlgorithmsTest searchAlgorithmsTest = new SearchAlgorithmsTest();
        searchAlgorithmsTest.testAll();
        SortingAlgorithmsTest sortingAlgorithmsTest = new SortingAlgorithmsTest();
        sortingAlgorithmsTest.testAll();
        StaticStackTest staticStackTest = new StaticStackTest();
        staticStackTest.testAll();
        StaticStackGenericsTest staticStackGenericsTest = new StaticStackGenericsTest();
        staticStackGenericsTest.testAll();
        DynamicStackTest dynamicStackTest = new DynamicStackTest();
        dynamicStackTest.testAll();

    }
}


