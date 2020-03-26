package com.example.springbootmall.service.impl;

import com.example.springbootmall.dao.PmsProductCategoryMapper;
import com.example.springbootmall.dao.PmsProductMapper;
import com.example.springbootmall.model.PmsProduct;
import com.example.springbootmall.model.PmsProductCategory;
import com.example.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    PmsProductCategoryMapper pmsProductCategorymapper;

    @Autowired
    PmsProductMapper pmsProductMapper;

    @Override
    public List<PmsProductCategory> getProductsByParentId(Long parentId) {
        return pmsProductCategorymapper.selectByParentId(parentId);
    }

    @Override
    public List<PmsProductCategory> getAllProductsByParentId() {
        return getALL(getProductsByParentId(0L));
    }

    @Override
    public List<PmsProduct> getProductByCategoryId(Long categoryId) {
        return pmsProductMapper.selectByCategoryId(categoryId);
    }

    public List<PmsProductCategory> getALL(List<PmsProductCategory> pmsProductCategoryList) {
        for (int i = 0; i < pmsProductCategoryList.size(); i++) {
            if (pmsProductCategorymapper.selectByParentId(pmsProductCategoryList.get(i).getId()) != null) {
                List<PmsProductCategory> pmsProductCategories
                        = pmsProductCategorymapper.selectByParentId(pmsProductCategoryList.get(i).getId());
                pmsProductCategoryList.get(i)
                        .setPmsProductCategoryList(pmsProductCategories);
                getALL(pmsProductCategories);
            }
        }
        return pmsProductCategoryList;
    }
}
