package com.neuq.info.dao;

import com.neuq.info.entity.CustomerUser;

public interface CustomerUserDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_CustomerUser
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long userId);


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_CustomerUser
     *
     * @mbggenerated
     */
    int insertSelective(CustomerUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_CustomerUser
     *
     * @mbggenerated
     */
    CustomerUser selectByPrimaryKey(Long userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_CustomerUser
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CustomerUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_CustomerUser
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CustomerUser record);



    /**
     * 新增user
     *
     * @param record
     * @return
     */
    int insert(CustomerUser record);


    /**
     * 根据用户id查询user
     *
     * @param userId
     * @return
     */
    CustomerUser queryUserById(long userId);

    /**
     * 根据openid查询user
     *
     * @param openid
     * @return
     */
    CustomerUser queryUserByOpenId(String openid);

    /**
     * 根据unionid查询user
     *
     * @param unionId
     * @return
     */
    CustomerUser queryUserByUnionId(String unionId);

    /**
     * 更新用户信息根据openId
     *
     * @param record
     * @return
     */
    int updateUser(CustomerUser record);
}