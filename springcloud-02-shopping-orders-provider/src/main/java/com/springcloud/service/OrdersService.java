package com.springcloud.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.springcloud.entity.Orders;

/**
 * 	订单模型层的接口，用于定义订单模块的方法
 * @author 吴丽琴
 *
 */
public interface OrdersService {

	/**
	 * 查询满足条件的订单信息（分页功能）
	 * @param orders
	 * @param pageNumber
	 * @return
	 */
	public abstract PageInfo<Orders> selectOrders(Orders orders,Integer pageNumber);
	
	/**
	 * 修改指定编号订单状态
	 * @param orders	修改的订单信息
	 * @return	成功返回大于0的整数，否则返回小于等于0 的整数
	 */
	public abstract Integer updateOrdersStatus(Orders orders);
	
	/**
	 * 	查询指定日期范围内的销售额
	 * @param orders	查询条件
	 * @return
	 */
	public abstract List<Orders> selectGroup(Orders orders);
}
