package com.example.springbootmall.dao;

import com.example.springbootmall.model.UmsMemberMemberTagRelation;
import com.example.springbootmall.model.UmsMemberMemberTagRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberMemberTagRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_member_tag_relation
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int countByExample(UmsMemberMemberTagRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_member_tag_relation
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int deleteByExample(UmsMemberMemberTagRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_member_tag_relation
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_member_tag_relation
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int insert(UmsMemberMemberTagRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_member_tag_relation
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int insertSelective(UmsMemberMemberTagRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_member_tag_relation
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    List<UmsMemberMemberTagRelation> selectByExample(UmsMemberMemberTagRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_member_tag_relation
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    UmsMemberMemberTagRelation selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_member_tag_relation
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int updateByExampleSelective(@Param("record") UmsMemberMemberTagRelation record, @Param("example") UmsMemberMemberTagRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_member_tag_relation
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int updateByExample(@Param("record") UmsMemberMemberTagRelation record, @Param("example") UmsMemberMemberTagRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_member_tag_relation
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int updateByPrimaryKeySelective(UmsMemberMemberTagRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_member_tag_relation
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int updateByPrimaryKey(UmsMemberMemberTagRelation record);
}