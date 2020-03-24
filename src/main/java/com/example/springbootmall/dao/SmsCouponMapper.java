package com.example.springbootmall.dao;

import com.example.springbootmall.model.SmsCoupon;
import com.example.springbootmall.model.SmsCouponExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsCouponMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int countByExample(SmsCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int deleteByExample(SmsCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int insert(SmsCoupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int insertSelective(SmsCoupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    List<SmsCoupon> selectByExample(SmsCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    SmsCoupon selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int updateByExampleSelective(@Param("record") SmsCoupon record, @Param("example") SmsCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int updateByExample(@Param("record") SmsCoupon record, @Param("example") SmsCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int updateByPrimaryKeySelective(SmsCoupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int updateByPrimaryKey(SmsCoupon record);
}