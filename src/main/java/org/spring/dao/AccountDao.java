package org.spring.dao;

/**
 * @author Administrator
 *转账操作dao层
 */
public interface AccountDao {
	/**
     *
     * @param out
     *              转出账户
     * @param money
     *              转出金额
     */
    void outMoney(String out, double money);
     
    /**
     * 转入
     *
     * @param int
     *              转入账户
     * @param money
     *              转出金额
     */
    void inMoney(String in, double money);
}
