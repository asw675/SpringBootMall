package com.example.springbootmall.dao;

import com.example.springbootmall.model.OmsCompanyAddress;
import com.example.springbootmall.model.OmsCompanyAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmsCompanyAddressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_company_address
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int countByExample(OmsCompanyAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_company_address
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int deleteByExample(OmsCompanyAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_company_address
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_company_address
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int insert(OmsCompanyAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_company_address
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int insertSelective(OmsCompanyAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_company_address
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    List<OmsCompanyAddress> selectByExample(OmsCompanyAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_company_address
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    OmsCompanyAddress selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_company_address
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int updateByExampleSelective(@Param("record") OmsCompanyAddress record, @Param("example") OmsCompanyAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_company_address
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int updateByExample(@Param("record") OmsCompanyAddress record, @Param("example") OmsCompanyAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_company_address
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int updateByPrimaryKeySelective(OmsCompanyAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_company_address
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int updateByPrimaryKey(OmsCompanyAddress record);
}