package com.companyname.springapp.repository;

/**
 * Created by pepesan on 7/5/16.
 */
import java.util.List;

import com.companyname.springapp.domain.Product;

public interface ProductDao {

    public List<Product> getProductList();

    public void saveProduct(Product prod);

}