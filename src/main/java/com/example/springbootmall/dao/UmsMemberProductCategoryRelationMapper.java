package com.example.springbootmall.dao;

import com.example.springbootmall.model.UmsMemberProductCategoryRelation;
import com.example.springbootmall.model.UmsMemberProductCategoryRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberProductCategoryRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_product_category_relation
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int countByExample(UmsMemberProductCategoryRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_product_category_relation
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int deleteByExample(UmsMemberProductCategoryRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_product_category_relation
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_product_category_relation
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int insert(UmsMemberProductCategoryRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_product_category_relation
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int insertSelective(UmsMemberProductCategoryRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_product_category_relation
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    List<UmsMemberProductCategoryRelation> selectByExample(UmsMemberProductCategoryRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_product_category_relation
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    UmsMemberProductCategoryRelation selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_product_category_relation
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int updateByExampleSelective(@Param("record") UmsMemberProductCategoryRelation record, @Param("example") UmsMemberProductCategoryRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_product_category_relation
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int updateByExample(@Param("record") UmsMemberProductCategoryRelation record, @Param("example") UmsMemberProductCategoryRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_product_category_relation
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int updateByPrimaryKeySelective(UmsMemberProductCategoryRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_product_category_relation
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int updateByPrimaryKey(UmsMemberProductCategoryRelation record);
}