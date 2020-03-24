package com.example.springbootmall.dao;

import com.example.springbootmall.model.UmsIntegrationChangeHistory;
import com.example.springbootmall.model.UmsIntegrationChangeHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsIntegrationChangeHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_change_history
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int countByExample(UmsIntegrationChangeHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_change_history
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int deleteByExample(UmsIntegrationChangeHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_change_history
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_change_history
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int insert(UmsIntegrationChangeHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_change_history
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int insertSelective(UmsIntegrationChangeHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_change_history
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    List<UmsIntegrationChangeHistory> selectByExample(UmsIntegrationChangeHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_change_history
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    UmsIntegrationChangeHistory selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_change_history
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int updateByExampleSelective(@Param("record") UmsIntegrationChangeHistory record, @Param("example") UmsIntegrationChangeHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_change_history
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int updateByExample(@Param("record") UmsIntegrationChangeHistory record, @Param("example") UmsIntegrationChangeHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_change_history
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int updateByPrimaryKeySelective(UmsIntegrationChangeHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_change_history
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int updateByPrimaryKey(UmsIntegrationChangeHistory record);
}