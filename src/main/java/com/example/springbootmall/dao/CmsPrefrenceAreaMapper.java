package com.example.springbootmall.dao;

import com.example.springbootmall.model.CmsPrefrenceArea;
import com.example.springbootmall.model.CmsPrefrenceAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsPrefrenceAreaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int countByExample(CmsPrefrenceAreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int deleteByExample(CmsPrefrenceAreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int insert(CmsPrefrenceArea record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int insertSelective(CmsPrefrenceArea record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    List<CmsPrefrenceArea> selectByExampleWithBLOBs(CmsPrefrenceAreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    List<CmsPrefrenceArea> selectByExample(CmsPrefrenceAreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    CmsPrefrenceArea selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int updateByExampleSelective(@Param("record") CmsPrefrenceArea record, @Param("example") CmsPrefrenceAreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int updateByExampleWithBLOBs(@Param("record") CmsPrefrenceArea record, @Param("example") CmsPrefrenceAreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int updateByExample(@Param("record") CmsPrefrenceArea record, @Param("example") CmsPrefrenceAreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int updateByPrimaryKeySelective(CmsPrefrenceArea record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int updateByPrimaryKeyWithBLOBs(CmsPrefrenceArea record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int updateByPrimaryKey(CmsPrefrenceArea record);
}