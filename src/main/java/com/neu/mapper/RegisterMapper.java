package com.neu.mapper;

import com.neu.entity.Register;
import com.neu.entity.RegisterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegisterMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table register
	 * @mbg.generated
	 */
	long countByExample(RegisterExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table register
	 * @mbg.generated
	 */
	int deleteByExample(RegisterExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table register
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table register
	 * @mbg.generated
	 */
	int insert(Register record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table register
	 * @mbg.generated
	 */
	int insertSelective(Register record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table register
	 * @mbg.generated
	 */
	List<Register> selectByExample(RegisterExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table register
	 * @mbg.generated
	 */
	Register selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table register
	 * @mbg.generated
	 */
	int updateByExampleSelective(@Param("record") Register record, @Param("example") RegisterExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table register
	 * @mbg.generated
	 */
	int updateByExample(@Param("record") Register record, @Param("example") RegisterExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table register
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(Register record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table register
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Register record);
}