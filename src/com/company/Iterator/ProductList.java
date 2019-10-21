package com.company.Iterator;

import java.util.List;

public class ProductList extends AbstractObjectList {
    public ProductList(List products) {
        super(products);
    }

    @Override
    public ProductIterator createIterator() {
        return new ProductIterator(this);
    }
}
