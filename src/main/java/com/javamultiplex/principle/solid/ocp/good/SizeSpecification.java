package com.javamultiplex.principle.solid.ocp.good;

import com.javamultiplex.principle.solid.ocp.Product;
import com.javamultiplex.principle.solid.ocp.Size;

/**
 * @author Rohit Agarwal on 16/08/20 2:40 pm
 * @copyright www.javamultiplex.com
 */
public class SizeSpecification implements Specification<Product> {

    private final Size size;

    public SizeSpecification(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return size == item.getSize();
    }
}
