package com.neu.mapper;

import com.neu.entity.RegistLevel;
import com.neu.entity.RegistLevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegistLevelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registlevel
     *
     * @mbg.generated
     */
    long countByExample(RegistLevelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registlevel
     *
     * @mbg.generated
     */
    int deleteByExample(RegistLevelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registlevel
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registlevel
     *
     * @mbg.generated
     */
    int insert(RegistLevel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registlevel
     *
     * @mbg.generated
     */
    int insertSelective(RegistLevel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registlevel
     *
     * @mbg.generated
     */
    List<RegistLevel> selectByExample(RegistLevelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registlevel
     *
     * @mbg.generated
     */
    RegistLevel selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registlevel
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") RegistLevel record, @Param("example") RegistLevelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registlevel
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") RegistLevel record, @Param("example") RegistLevelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registlevel
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(RegistLevel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registlevel
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(RegistLevel record);
}