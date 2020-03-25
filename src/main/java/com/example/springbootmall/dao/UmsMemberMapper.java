package com.example.springbootmall.dao;

import com.example.springbootmall.model.UmsMember;
import com.example.springbootmall.model.UmsMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int countByExample(UmsMemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int deleteByExample(UmsMemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int insert(UmsMember record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int insertSelective(UmsMember record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    List<UmsMember> selectByExample(UmsMemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    UmsMember selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int updateByExampleSelective(@Param("record") UmsMember record, @Param("example") UmsMemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int updateByExample(@Param("record") UmsMember record, @Param("example") UmsMemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int updateByPrimaryKeySelective(UmsMember record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int updateByPrimaryKey(UmsMember record);

    UmsMember selectByUsername(String username);
}