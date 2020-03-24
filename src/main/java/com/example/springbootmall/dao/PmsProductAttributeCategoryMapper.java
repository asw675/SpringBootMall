package com.example.springbootmall.dao;

import com.example.springbootmall.model.PmsProductAttributeCategory;
import com.example.springbootmall.model.PmsProductAttributeCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductAttributeCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_category
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int countByExample(PmsProductAttributeCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_category
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int deleteByExample(PmsProductAttributeCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_category
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_category
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int insert(PmsProductAttributeCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_category
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int insertSelective(PmsProductAttributeCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_category
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    List<PmsProductAttributeCategory> selectByExample(PmsProductAttributeCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_category
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    PmsProductAttributeCategory selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_category
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int updateByExampleSelective(@Param("record") PmsProductAttributeCategory record, @Param("example") PmsProductAttributeCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_category
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int updateByExample(@Param("record") PmsProductAttributeCategory record, @Param("example") PmsProductAttributeCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_category
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int updateByPrimaryKeySelective(PmsProductAttributeCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_category
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int updateByPrimaryKey(PmsProductAttributeCategory record);
}