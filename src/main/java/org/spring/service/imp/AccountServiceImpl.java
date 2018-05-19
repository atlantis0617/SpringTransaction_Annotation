package org.spring.service.imp;

import org.spring.dao.AccountDao;
import org.spring.service.AccoutService;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @ClassName:  AccountServiceImpl   
 * @Description:转账操作业务层实现类  
 * @author: 华洋科技 
 * @date:   2018年5月19日 下午12:10:57   
 *     
 * @Copyright: 2018 www.yhy.com Inc. All rights reserved. 
 */
@Transactional
public class AccountServiceImpl implements AccoutService{
	
	private AccountDao accountDao;
	
	public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
	
	/**   
	 * <p>Title: transfer</p>   
	 * <p>Description: </p>   
	 * @param out
	 * @param in
	 * @param money   
	 * @see org.spring.service.AccoutService#transfer(java.lang.String, java.lang.String, double)   
	 * 转账
	 */
	@Override
	public void transfer(String out, String in, double money) {
		accountDao.outMoney(out, money);
        accountDao.inMoney(in, money);
	}

}
