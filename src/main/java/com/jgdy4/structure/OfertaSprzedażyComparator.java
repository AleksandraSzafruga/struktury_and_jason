package com.jgdy4.structure;

import java.util.Comparator;


public class OfertaSprzedażyComparator implements Comparator<OfertaSprzedaży> {

    boolean sortowanie;

    public OfertaSprzedażyComparator(boolean sortowanie) {
        this.sortowanie = sortowanie;
    }
    @Override
    public int compare(OfertaSprzedaży o1, OfertaSprzedaży o2) {
        if (sortowanie){
            return Double.compare(o1.getCena(), o2.getCena());
        } else {
            return Double.compare(o2.getCena(), o1.getCena());
        }
    }
}
