package com.neu.entity;

import java.util.List;

public class Role {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.id
     *
     * @mbg.generated Tue Sep 03 16:38:57 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.name
     *
     * @mbg.generated Tue Sep 03 16:38:57 CST 2019
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.id
     *
     * @return the value of role.id
     *
     * @mbg.generated Tue Sep 03 16:38:57 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.id
     *
     * @param id the value for role.id
     *
     * @mbg.generated Tue Sep 03 16:38:57 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.name
     *
     * @return the value of role.name
     *
     * @mbg.generated Tue Sep 03 16:38:57 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.name
     *
     * @param name the value for role.name
     *
     * @mbg.generated Tue Sep 03 16:38:57 CST 2019
     */
    public void setName(String name) {
        this.name = name;
    }
    
    private List<RoleMenuKey> roleMenuList;

	public List<RoleMenuKey> getRoleMenuList() {
		return roleMenuList;
	}

	public void setRoleMenuList(List<RoleMenuKey> roleMenuList) {
		this.roleMenuList = roleMenuList;
	}
}