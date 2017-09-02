module packt.sort.javasort {
    
    requires packt.sortutil;
    provides packt.util.SortUtil with packt.util.impl.javasort.JavaSortUtilImpl;
}