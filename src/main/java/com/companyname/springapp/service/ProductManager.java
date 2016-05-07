package com.companyname.springapp.service;

/**
 * Created by pepesan on 7/5/16.
 */
import java.io.Serializable;
import java.util.List;

import com.companyname.springapp.domain.Product;

public interface ProductManager extends Serializable {

    public void increasePrice(int percentage);

    public List<Product> getProducts();

}
