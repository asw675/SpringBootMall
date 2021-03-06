package com.example.springbootmall.dao;

import com.example.springbootmall.model.PmsProductCategory;
import com.example.springbootmall.model.PmsProductCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int countByExample(PmsProductCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int deleteByExample(PmsProductCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int insert(PmsProductCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int insertSelective(PmsProductCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    List<PmsProductCategory> selectByExampleWithBLOBs(PmsProductCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    List<PmsProductCategory> selectByExample(PmsProductCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    PmsProductCategory selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int updateByExampleSelective(@Param("record") PmsProductCategory record, @Param("example") PmsProductCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int updateByExampleWithBLOBs(@Param("record") PmsProductCategory record, @Param("example") PmsProductCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int updateByExample(@Param("record") PmsProductCategory record, @Param("example") PmsProductCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int updateByPrimaryKeySelective(PmsProductCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int updateByPrimaryKeyWithBLOBs(PmsProductCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int updateByPrimaryKey(PmsProductCategory record);

    List<PmsProductCategory> selectByParentId(Long parentId);

}