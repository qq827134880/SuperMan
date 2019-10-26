package com.neu.entity;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.ID
     *
     * @mbg.generated Wed Sep 04 08:55:20 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.UserName
     *
     * @mbg.generated Wed Sep 04 08:55:20 CST 2019
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.Password
     *
     * @mbg.generated Wed Sep 04 08:55:20 CST 2019
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.RealName
     *
     * @mbg.generated Wed Sep 04 08:55:20 CST 2019
     */
    private String realname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.UseType
     *
     * @mbg.generated Wed Sep 04 08:55:20 CST 2019
     */
    private Role role;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.DocTitleID
     *
     * @mbg.generated Wed Sep 04 08:55:20 CST 2019
     */
    private Integer doctitleid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.IsScheduling
     *
     * @mbg.generated Wed Sep 04 08:55:20 CST 2019
     */
    private String isscheduling;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.DeptID
     *
     * @mbg.generated Wed Sep 04 08:55:20 CST 2019
     */
    private Integer deptid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.RegistLeID
     *
     * @mbg.generated Wed Sep 04 08:55:20 CST 2019
     */
    private Integer registleid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.DelMark
     *
     * @mbg.generated Wed Sep 04 08:55:20 CST 2019
     */
    private Integer delmark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.ID
     *
     * @return the value of user.ID
     *
     * @mbg.generated Wed Sep 04 08:55:20 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.ID
     *
     * @param id the value for user.ID
     *
     * @mbg.generated Wed Sep 04 08:55:20 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.UserName
     *
     * @return the value of user.UserName
     *
     * @mbg.generated Wed Sep 04 08:55:20 CST 2019
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.UserName
     *
     * @param username the value for user.UserName
     *
     * @mbg.generated Wed Sep 04 08:55:20 CST 2019
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.Password
     *
     * @return the value of user.Password
     *
     * @mbg.generated Wed Sep 04 08:55:20 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.Password
     *
     * @param password the value for user.Password
     *
     * @mbg.generated Wed Sep 04 08:55:20 CST 2019
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.RealName
     *
     * @return the value of user.RealName
     *
     * @mbg.generated Wed Sep 04 08:55:20 CST 2019
     */
    public String getRealname() {
        return realname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.RealName
     *
     * @param realname the value for user.RealName
     *
     * @mbg.generated Wed Sep 04 08:55:20 CST 2019
     */
    public void setRealname(String realname) {
        this.realname = realname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.UseType
     *
     * @return the value of user.UseType
     *
     * @mbg.generated Wed Sep 04 08:55:20 CST 2019
     */
    public Role getRole() {
        return role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.UseType
     *
     * @param role the value for user.UseType
     *
     * @mbg.generated Wed Sep 04 08:55:20 CST 2019
     */
    public void setRole(Role role) {
        this.role = role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.DocTitleID
     *
     * @return the value of user.DocTitleID
     *
     * @mbg.generated Wed Sep 04 08:55:20 CST 2019
     */
    public Integer getDoctitleid() {
        return doctitleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.DocTitleID
     *
     * @param doctitleid the value for user.DocTitleID
     *
     * @mbg.generated Wed Sep 04 08:55:20 CST 2019
     */
    public void setDoctitleid(Integer doctitleid) {
        this.doctitleid = doctitleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.IsScheduling
     *
     * @return the value of user.IsScheduling
     *
     * @mbg.generated Wed Sep 04 08:55:20 CST 2019
     */
    public String getIsscheduling() {
        return isscheduling;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.IsScheduling
     *
     * @param isscheduling the value for user.IsScheduling
     *
     * @mbg.generated Wed Sep 04 08:55:20 CST 2019
     */
    public void setIsscheduling(String isscheduling) {
        this.isscheduling = isscheduling;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.DeptID
     *
     * @return the value of user.DeptID
     *
     * @mbg.generated Wed Sep 04 08:55:20 CST 2019
     */
    public Integer getDeptid() {
        return deptid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.DeptID
     *
     * @param deptid the value for user.DeptID
     *
     * @mbg.generated Wed Sep 04 08:55:20 CST 2019
     */
    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.RegistLeID
     *
     * @return the value of user.RegistLeID
     *
     * @mbg.generated Wed Sep 04 08:55:20 CST 2019
     */
    public Integer getRegistleid() {
        return registleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.RegistLeID
     *
     * @param registleid the value for user.RegistLeID
     *
     * @mbg.generated Wed Sep 04 08:55:20 CST 2019
     */
    public void setRegistleid(Integer registleid) {
        this.registleid = registleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.DelMark
     *
     * @return the value of user.DelMark
     *
     * @mbg.generated Wed Sep 04 08:55:20 CST 2019
     */
    public Integer getDelmark() {
        return delmark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.DelMark
     *
     * @param delmark the value for user.DelMark
     *
     * @mbg.generated Wed Sep 04 08:55:20 CST 2019
     */
    public void setDelmark(Integer delmark) {
        this.delmark = delmark;
    }
}