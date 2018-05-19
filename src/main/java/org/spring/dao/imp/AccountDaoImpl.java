package org.spring.dao.imp;

import org.spring.dao.AccountDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao{

	/* 
	 * 转出
	 */
	@Override
	public void outMoney(String out, double money) {
 		String sql = "update account set money = money - ? where name = ?";
        this.getJdbcTemplate().update(sql, money, out);
	}
	
	/* 
	 * 转入
	 */
	@Override
	public void inMoney(String in, double money) {
		String sql = "update account set money = money + ? where name = ?";
        this.getJdbcTemplate().update(sql, money, in);
	}

}
