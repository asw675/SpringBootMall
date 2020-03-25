package com.example.springbootmall.dao;

import com.example.springbootmall.model.UmsMemberStatisticsInfo;
import com.example.springbootmall.model.UmsMemberStatisticsInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberStatisticsInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_statistics_info
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int countByExample(UmsMemberStatisticsInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_statistics_info
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int deleteByExample(UmsMemberStatisticsInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_statistics_info
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_statistics_info
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int insert(UmsMemberStatisticsInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_statistics_info
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int insertSelective(UmsMemberStatisticsInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_statistics_info
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    List<UmsMemberStatisticsInfo> selectByExample(UmsMemberStatisticsInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_statistics_info
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    UmsMemberStatisticsInfo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_statistics_info
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int updateByExampleSelective(@Param("record") UmsMemberStatisticsInfo record, @Param("example") UmsMemberStatisticsInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_statistics_info
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int updateByExample(@Param("record") UmsMemberStatisticsInfo record, @Param("example") UmsMemberStatisticsInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_statistics_info
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int updateByPrimaryKeySelective(UmsMemberStatisticsInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_statistics_info
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int updateByPrimaryKey(UmsMemberStatisticsInfo record);
}