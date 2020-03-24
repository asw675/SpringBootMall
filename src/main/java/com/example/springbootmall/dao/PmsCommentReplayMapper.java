package com.example.springbootmall.dao;

import com.example.springbootmall.model.PmsCommentReplay;
import com.example.springbootmall.model.PmsCommentReplayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsCommentReplayMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment_replay
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int countByExample(PmsCommentReplayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment_replay
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int deleteByExample(PmsCommentReplayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment_replay
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment_replay
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int insert(PmsCommentReplay record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment_replay
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int insertSelective(PmsCommentReplay record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment_replay
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    List<PmsCommentReplay> selectByExample(PmsCommentReplayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment_replay
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    PmsCommentReplay selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment_replay
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int updateByExampleSelective(@Param("record") PmsCommentReplay record, @Param("example") PmsCommentReplayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment_replay
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int updateByExample(@Param("record") PmsCommentReplay record, @Param("example") PmsCommentReplayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment_replay
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int updateByPrimaryKeySelective(PmsCommentReplay record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment_replay
     *
     * @mbggenerated Tue Mar 24 18:19:38 CST 2020
     */
    int updateByPrimaryKey(PmsCommentReplay record);
}