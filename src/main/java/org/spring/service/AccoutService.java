package org.spring.service;
/**   
 * @ClassName:  AccoutService   
 * @Description:转账服务层接口
 * @author: 华洋科技 
 * @date:   2018年5月19日 下午12:07:27   
 * @Copyright: 2018 www.yhy.com Inc. All rights reserved. 
 * 
 */
public interface AccoutService {
	
    /**   
     * @Title: transfer   
     * @Description: 转账   
     * @param: @param out 转出账户
     * @param: @param in  转入账户
     * @param: @param money 转账金额     
     * @return: void      
     * @throws   
     */
    void transfer(String out, String in, double money);
}
