package com.neu.entity;

import java.math.BigDecimal;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table registlevel
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class RegistLevel {
    /**
     * Database Column Remarks:
     *   ID主键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column registlevel.ID
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   号别编码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column registlevel.RegistCode
     *
     * @mbg.generated
     */
    private String code;

    /**
     * Database Column Remarks:
     *   号别名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column registlevel.RegistName
     *
     * @mbg.generated
     */
    private String name;

    /**
     * Database Column Remarks:
     *   显示顺序号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column registlevel.SequenceNo
     *
     * @mbg.generated
     */
    private Integer sSequenceNo;

    /**
     * Database Column Remarks:
     *   挂号费
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column registlevel.RegistFee
     *
     * @mbg.generated
     */
    private BigDecimal registFee;

    /**
     * Database Column Remarks:
     *   挂号限额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column registlevel.RegistQuota
     *
     * @mbg.generated
     */
    private Integer registQuota;

    /**
     * Database Column Remarks:
     *   删除标记
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column registlevel.DelMark
     *
     * @mbg.generated
     */
    private Integer delMark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column registlevel.ID
     *
     * @return the value of registlevel.ID
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column registlevel.ID
     *
     * @param id the value for registlevel.ID
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column registlevel.RegistCode
     *
     * @return the value of registlevel.RegistCode
     *
     * @mbg.generated
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column registlevel.RegistCode
     *
     * @param code the value for registlevel.RegistCode
     *
     * @mbg.generated
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column registlevel.RegistName
     *
     * @return the value of registlevel.RegistName
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column registlevel.RegistName
     *
     * @param name the value for registlevel.RegistName
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column registlevel.SequenceNo
     *
     * @return the value of registlevel.SequenceNo
     *
     * @mbg.generated
     */
    public Integer getsSequenceNo() {
        return sSequenceNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column registlevel.SequenceNo
     *
     * @param sSequenceNo the value for registlevel.SequenceNo
     *
     * @mbg.generated
     */
    public void setsSequenceNo(Integer sSequenceNo) {
        this.sSequenceNo = sSequenceNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column registlevel.RegistFee
     *
     * @return the value of registlevel.RegistFee
     *
     * @mbg.generated
     */
    public BigDecimal getRegistFee() {
        return registFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column registlevel.RegistFee
     *
     * @param registFee the value for registlevel.RegistFee
     *
     * @mbg.generated
     */
    public void setRegistFee(BigDecimal registFee) {
        this.registFee = registFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column registlevel.RegistQuota
     *
     * @return the value of registlevel.RegistQuota
     *
     * @mbg.generated
     */
    public Integer getRegistQuota() {
        return registQuota;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column registlevel.RegistQuota
     *
     * @param registQuota the value for registlevel.RegistQuota
     *
     * @mbg.generated
     */
    public void setRegistQuota(Integer registQuota) {
        this.registQuota = registQuota;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column registlevel.DelMark
     *
     * @return the value of registlevel.DelMark
     *
     * @mbg.generated
     */
    public Integer getDelMark() {
        return delMark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column registlevel.DelMark
     *
     * @param delMark the value for registlevel.DelMark
     *
     * @mbg.generated
     */
    public void setDelMark(Integer delMark) {
        this.delMark = delMark;
    }
}