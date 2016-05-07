package com.companyname.springapp.repository;

/**
 * Created by pepesan on 7/5/16.
 */
import java.util.List;

import com.companyname.springapp.domain.Product;

public class InMemoryProductDao implements ProductDao {

    private List<Product> productList;

    public InMemoryProductDao(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void saveProduct(Product prod) {
    }

}
