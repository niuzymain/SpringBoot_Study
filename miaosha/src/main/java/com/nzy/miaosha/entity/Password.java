package com.nzy.miaosha.entity;

public class Password {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column password.id
     *
     * @mbg.generated Mon Jun 17 11:12:04 GMT+08:00 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column password.password
     *
     * @mbg.generated Mon Jun 17 11:12:04 GMT+08:00 2019
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column password.user_id
     *
     * @mbg.generated Mon Jun 17 11:12:04 GMT+08:00 2019
     */
    private Integer userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column password.id
     *
     * @return the value of password.id
     *
     * @mbg.generated Mon Jun 17 11:12:04 GMT+08:00 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column password.id
     *
     * @param id the value for password.id
     *
     * @mbg.generated Mon Jun 17 11:12:04 GMT+08:00 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column password.password
     *
     * @return the value of password.password
     *
     * @mbg.generated Mon Jun 17 11:12:04 GMT+08:00 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column password.password
     *
     * @param password the value for password.password
     *
     * @mbg.generated Mon Jun 17 11:12:04 GMT+08:00 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column password.user_id
     *
     * @return the value of password.user_id
     *
     * @mbg.generated Mon Jun 17 11:12:04 GMT+08:00 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column password.user_id
     *
     * @param userId the value for password.user_id
     *
     * @mbg.generated Mon Jun 17 11:12:04 GMT+08:00 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}