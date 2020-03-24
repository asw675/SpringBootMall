package com.example.springbootmall.dao;

import com.example.springbootmall.model.OmsOrderSetting;
import com.example.springbootmall.model.OmsOrderSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmsOrderSettingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_setting
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int countByExample(OmsOrderSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_setting
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int deleteByExample(OmsOrderSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_setting
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_setting
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int insert(OmsOrderSetting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_setting
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int insertSelective(OmsOrderSetting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_setting
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    List<OmsOrderSetting> selectByExample(OmsOrderSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_setting
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    OmsOrderSetting selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_setting
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int updateByExampleSelective(@Param("record") OmsOrderSetting record, @Param("example") OmsOrderSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_setting
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int updateByExample(@Param("record") OmsOrderSetting record, @Param("example") OmsOrderSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_setting
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int updateByPrimaryKeySelective(OmsOrderSetting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_setting
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int updateByPrimaryKey(OmsOrderSetting record);
}