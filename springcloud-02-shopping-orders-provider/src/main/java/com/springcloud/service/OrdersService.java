package com.springcloud.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.springcloud.entity.Orders;

/**
 * 	����ģ�Ͳ�Ľӿڣ����ڶ��嶩��ģ��ķ���
 * @author ������
 *
 */
public interface OrdersService {

	/**
	 * ��ѯ���������Ķ�����Ϣ����ҳ���ܣ�
	 * @param orders
	 * @param pageNumber
	 * @return
	 */
	public abstract PageInfo<Orders> selectOrders(Orders orders,Integer pageNumber);
	
	/**
	 * �޸�ָ����Ŷ���״̬
	 * @param orders	�޸ĵĶ�����Ϣ
	 * @return	�ɹ����ش���0�����������򷵻�С�ڵ���0 ������
	 */
	public abstract Integer updateOrdersStatus(Orders orders);
	
	/**
	 * 	��ѯָ�����ڷ�Χ�ڵ����۶�
	 * @param orders	��ѯ����
	 * @return
	 */
	public abstract List<Orders> selectGroup(Orders orders);
}
