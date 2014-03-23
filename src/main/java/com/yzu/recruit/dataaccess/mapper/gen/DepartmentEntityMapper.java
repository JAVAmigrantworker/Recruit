package com.yzu.recruit.dataaccess.mapper.gen;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yzu.recruit.dataaccess.model.gen.DepartmentEntity;
import com.yzu.recruit.dataaccess.model.gen.DepartmentEntityExample;

public interface DepartmentEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Department
     *
     * @mbggenerated Sun Mar 23 11:29:29 CST 2014
     */
    int countByExample(DepartmentEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Department
     *
     * @mbggenerated Sun Mar 23 11:29:29 CST 2014
     */
    int deleteByExample(DepartmentEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Department
     *
     * @mbggenerated Sun Mar 23 11:29:29 CST 2014
     */
    int deleteByPrimaryKey(Integer departmentid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Department
     *
     * @mbggenerated Sun Mar 23 11:29:29 CST 2014
     */
    int insert(DepartmentEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Department
     *
     * @mbggenerated Sun Mar 23 11:29:29 CST 2014
     */
    int insertSelective(DepartmentEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Department
     *
     * @mbggenerated Sun Mar 23 11:29:29 CST 2014
     */
    List<DepartmentEntity> selectByExampleWithBLOBs(DepartmentEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Department
     *
     * @mbggenerated Sun Mar 23 11:29:29 CST 2014
     */
    List<DepartmentEntity> selectByExample(DepartmentEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Department
     *
     * @mbggenerated Sun Mar 23 11:29:29 CST 2014
     */
    DepartmentEntity selectByPrimaryKey(Integer departmentid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Department
     *
     * @mbggenerated Sun Mar 23 11:29:29 CST 2014
     */
    int updateByExampleSelective(@Param("record") DepartmentEntity record, @Param("example") DepartmentEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Department
     *
     * @mbggenerated Sun Mar 23 11:29:29 CST 2014
     */
    int updateByExampleWithBLOBs(@Param("record") DepartmentEntity record, @Param("example") DepartmentEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Department
     *
     * @mbggenerated Sun Mar 23 11:29:29 CST 2014
     */
    int updateByExample(@Param("record") DepartmentEntity record, @Param("example") DepartmentEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Department
     *
     * @mbggenerated Sun Mar 23 11:29:29 CST 2014
     */
    int updateByPrimaryKeySelective(DepartmentEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Department
     *
     * @mbggenerated Sun Mar 23 11:29:29 CST 2014
     */
    int updateByPrimaryKeyWithBLOBs(DepartmentEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Department
     *
     * @mbggenerated Sun Mar 23 11:29:29 CST 2014
     */
    int updateByPrimaryKey(DepartmentEntity record);
}