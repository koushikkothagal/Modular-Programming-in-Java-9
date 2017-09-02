module packt.sort.bubblesort {
    
    requires packt.sortutil;
    provides packt.util.SortUtil with packt.util.impl.bubblesort.BubbleSortUtilImpl;
}