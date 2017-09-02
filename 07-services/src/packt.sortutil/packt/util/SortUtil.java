package packt.util;

import java.util.List;
import java.util.Comparator;


import java.util.ServiceLoader;
import java.util.ServiceLoader.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public interface SortUtil {

     public <T extends Comparable> List<T> sortList(List<T> list);

     public int getIdealMaxInputLength();

     public static Iterable<SortUtil> getAllProviders() {
          return ServiceLoader.load(SortUtil.class);
        }
     
     public static SortUtil getProviderInstance(int listSize) {
        Iterable<SortUtil> sortUtils = ServiceLoader.load(SortUtil.class);
        for (SortUtil sortUtil : sortUtils) {
            if (listSize < sortUtil.getIdealMaxInputLength()) {
                return sortUtil;
            }
        }
        return null;
     }


     public static SortUtil getProviderInstanceLazy() {
        Stream<Provider<SortUtil>> providers = ServiceLoader.load(SortUtil.class)
            .stream()
            .sorted(Comparator.comparing(p -> p.type().getName()));
            
            SortUtil util = providers.map(Provider::get)
                         .findAny()
                         .orElse(null);
            return util;
     }




}