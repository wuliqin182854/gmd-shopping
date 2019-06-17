package com.springcloud.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.springcloud.entity.Goods;

public interface GoodsService {
	/**
	 * 	����µ���Ʒ��Ϣ
	 * @param goods	����Ʒ��Ϣ
	 * @return	�ɹ����ش���0�����������򷵻�0
	 */
	public abstract Integer insert(Goods goods);
	
	/**
	 * ��ѯ������������Ʒ��Ϣ����ҳ���ܣ�
	 * @param goods	��ѯ����
	 * @param pageNumber	ҳ��
	 * @return	�ɹ�����com.github.pagehelper.PageInfo<Goods>����ʵ�������򷵻�null
	 */
	

	public abstract PageInfo<Goods> select(Goods goods,Integer pageNumber);
		
	/**
    * 	根据条件修改商品信息
    * @param goods	修稿商品信息
    * @return	成功返回大于0的整数，否则返回小于等于0的整数
    */
   public abstract Integer updateGoodsById(Goods goods);
   
   /**
    * 	修改指定编号商品的信息
    * @param goods	修改的商品信息
    * @return	成功返回大于0的整数，否则返回小于等于0的整数
    */
   public abstract Integer update(Goods goods);
   
   /**
    * 查询销售前十的商品信息
    * @return	成功返回java.util.List类型实例，否则返回null
    */
   public abstract List<Goods> selectGroup();

}
