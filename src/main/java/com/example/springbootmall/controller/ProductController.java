package com.example.springbootmall.controller;

import com.example.springbootmall.common.CommonResult;
import com.example.springbootmall.model.PmsProduct;
import com.example.springbootmall.model.PmsProductCategory;
import com.example.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/productsByParentId",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<List<PmsProductCategory>> getProductsByParentId(Long parentId){
        if (productService.getProductsByParentId(parentId)!=null){
            return CommonResult.success(productService.getProductsByParentId(parentId));
        }else {
            return CommonResult.failed("没找到");
        }
    }

    @RequestMapping(value = "/allProductCategory",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<List<PmsProductCategory>> getAllProductCategory(){
        List<PmsProductCategory> pmsProductCategoryList = productService.getAllProductsByParentId();
        if (pmsProductCategoryList!=null){
            return CommonResult.success(pmsProductCategoryList);
        }else {
            return CommonResult.failed("没找到");
        }
    }

    @RequestMapping(value = "/productsByCategoryId",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<List<PmsProduct>> getProductsByCategoryId(Long categoryId){
        if (productService.getProductByCategoryId(categoryId)!=null){
            return CommonResult.success(productService.getProductByCategoryId(categoryId));
        }else {
            return CommonResult.failed("没找到");
        }
    }
}
