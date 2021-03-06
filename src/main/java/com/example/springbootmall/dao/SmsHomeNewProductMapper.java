package com.example.springbootmall.dao;

import com.example.springbootmall.model.SmsHomeNewProduct;
import com.example.springbootmall.model.SmsHomeNewProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsHomeNewProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_new_product
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int countByExample(SmsHomeNewProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_new_product
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int deleteByExample(SmsHomeNewProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_new_product
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_new_product
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int insert(SmsHomeNewProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_new_product
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int insertSelective(SmsHomeNewProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_new_product
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    List<SmsHomeNewProduct> selectByExample(SmsHomeNewProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_new_product
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    SmsHomeNewProduct selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_new_product
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int updateByExampleSelective(@Param("record") SmsHomeNewProduct record, @Param("example") SmsHomeNewProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_new_product
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int updateByExample(@Param("record") SmsHomeNewProduct record, @Param("example") SmsHomeNewProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_new_product
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int updateByPrimaryKeySelective(SmsHomeNewProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_new_product
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int updateByPrimaryKey(SmsHomeNewProduct record);
}