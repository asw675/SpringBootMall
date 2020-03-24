package com.example.springbootmall.dao;

import com.example.springbootmall.model.UmsRole;
import com.example.springbootmall.model.UmsRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int countByExample(UmsRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int deleteByExample(UmsRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int insert(UmsRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int insertSelective(UmsRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    List<UmsRole> selectByExample(UmsRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    UmsRole selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int updateByExampleSelective(@Param("record") UmsRole record, @Param("example") UmsRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int updateByExample(@Param("record") UmsRole record, @Param("example") UmsRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int updateByPrimaryKeySelective(UmsRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int updateByPrimaryKey(UmsRole record);
}