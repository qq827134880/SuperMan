package com.neu.entity;

public class Menu {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.id
     *
     * @mbg.generated Tue Sep 03 16:38:57 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.title
     *
     * @mbg.generated Tue Sep 03 16:38:57 CST 2019
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.parent_id
     *
     * @mbg.generated Tue Sep 03 16:38:57 CST 2019
     */
    private Menu parentMenu;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.order_No
     *
     * @mbg.generated Tue Sep 03 16:38:57 CST 2019
     */
    private Integer orderNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.url
     *
     * @mbg.generated Tue Sep 03 16:38:57 CST 2019
     */
    private String url;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.id
     *
     * @return the value of menu.id
     *
     * @mbg.generated Tue Sep 03 16:38:57 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.id
     *
     * @param id the value for menu.id
     *
     * @mbg.generated Tue Sep 03 16:38:57 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.title
     *
     * @return the value of menu.title
     *
     * @mbg.generated Tue Sep 03 16:38:57 CST 2019
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.title
     *
     * @param title the value for menu.title
     *
     * @mbg.generated Tue Sep 03 16:38:57 CST 2019
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.parent_id
     *
     * @return the value of menu.parent_id
     *
     * @mbg.generated Tue Sep 03 16:38:57 CST 2019
     */
    public Menu getParentMenu() {
        return parentMenu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.parent_id
     *
     * @param parentMenu the value for menu.parent_id
     *
     * @mbg.generated Tue Sep 03 16:38:57 CST 2019
     */
    public void setParentMenu(Menu parentMenu) {
        this.parentMenu = parentMenu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.order_No
     *
     * @return the value of menu.order_No
     *
     * @mbg.generated Tue Sep 03 16:38:57 CST 2019
     */
    public Integer getOrderNo() {
        return orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.order_No
     *
     * @param orderNo the value for menu.order_No
     *
     * @mbg.generated Tue Sep 03 16:38:57 CST 2019
     */
    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.url
     *
     * @return the value of menu.url
     *
     * @mbg.generated Tue Sep 03 16:38:57 CST 2019
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.url
     *
     * @param url the value for menu.url
     *
     * @mbg.generated Tue Sep 03 16:38:57 CST 2019
     */
    public void setUrl(String url) {
        this.url = url;
    }
}