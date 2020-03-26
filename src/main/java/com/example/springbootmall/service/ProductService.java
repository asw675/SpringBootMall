package com.example.springbootmall.service;

import com.example.springbootmall.model.PmsProduct;
import com.example.springbootmall.model.PmsProductCategory;

import java.util.List;

public interface ProductService {

    List<PmsProductCategory> getProductsByParentId(Long parentId);

    List<PmsProductCategory> getAllProductsByParentId();

    List<PmsProduct> getProductByCategoryId(Long categoryId);
}
