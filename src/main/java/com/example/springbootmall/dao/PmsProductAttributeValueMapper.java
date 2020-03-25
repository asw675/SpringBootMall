package com.example.springbootmall.dao;

import com.example.springbootmall.model.PmsProductAttributeValue;
import com.example.springbootmall.model.PmsProductAttributeValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductAttributeValueMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_value
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int countByExample(PmsProductAttributeValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_value
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int deleteByExample(PmsProductAttributeValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_value
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_value
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int insert(PmsProductAttributeValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_value
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int insertSelective(PmsProductAttributeValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_value
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    List<PmsProductAttributeValue> selectByExample(PmsProductAttributeValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_value
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    PmsProductAttributeValue selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_value
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int updateByExampleSelective(@Param("record") PmsProductAttributeValue record, @Param("example") PmsProductAttributeValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_value
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int updateByExample(@Param("record") PmsProductAttributeValue record, @Param("example") PmsProductAttributeValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_value
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int updateByPrimaryKeySelective(PmsProductAttributeValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_value
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int updateByPrimaryKey(PmsProductAttributeValue record);
}