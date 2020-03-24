package com.example.springbootmall.dao;

import com.example.springbootmall.model.SmsHomeBrand;
import com.example.springbootmall.model.SmsHomeBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsHomeBrandMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_brand
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int countByExample(SmsHomeBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_brand
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int deleteByExample(SmsHomeBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_brand
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_brand
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int insert(SmsHomeBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_brand
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int insertSelective(SmsHomeBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_brand
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    List<SmsHomeBrand> selectByExample(SmsHomeBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_brand
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    SmsHomeBrand selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_brand
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int updateByExampleSelective(@Param("record") SmsHomeBrand record, @Param("example") SmsHomeBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_brand
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int updateByExample(@Param("record") SmsHomeBrand record, @Param("example") SmsHomeBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_brand
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int updateByPrimaryKeySelective(SmsHomeBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_brand
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int updateByPrimaryKey(SmsHomeBrand record);
}