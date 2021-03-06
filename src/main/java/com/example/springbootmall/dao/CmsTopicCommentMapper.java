package com.example.springbootmall.dao;

import com.example.springbootmall.model.CmsTopicComment;
import com.example.springbootmall.model.CmsTopicCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsTopicCommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_comment
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int countByExample(CmsTopicCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_comment
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int deleteByExample(CmsTopicCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_comment
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_comment
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int insert(CmsTopicComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_comment
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int insertSelective(CmsTopicComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_comment
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    List<CmsTopicComment> selectByExample(CmsTopicCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_comment
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    CmsTopicComment selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_comment
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int updateByExampleSelective(@Param("record") CmsTopicComment record, @Param("example") CmsTopicCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_comment
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int updateByExample(@Param("record") CmsTopicComment record, @Param("example") CmsTopicCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_comment
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int updateByPrimaryKeySelective(CmsTopicComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_comment
     *
     * @mbggenerated Wed Mar 25 12:21:05 CST 2020
     */
    int updateByPrimaryKey(CmsTopicComment record);
}