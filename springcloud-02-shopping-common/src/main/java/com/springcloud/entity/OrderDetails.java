package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * USERS表对应的实体类，用于封装一行订单明细信息
 * @author 吴丽琴
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetails implements java.io.Serializable{
    
	private static final long serialVersionUID = -6464103781453419950L;

	/**
	 * 订单明细编号
	 */
	private Integer orderDetailId;

	/**
	 * 订单编号
	 */
    private Integer orderId;


	/**
	 *商品编号
	 */
    private Integer goodsId;


	/**
	 * 商品名称
	 */
    private String goodsName;


	/**
	 * 成交价
	 */
    private Double goodsFinalPrice;


	/**
	 * 订单数
	 */
    private Integer goodsFinalNum;

    public Integer getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(Integer orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Double getGoodsFinalPrice() {
        return goodsFinalPrice;
    }

    public void setGoodsFinalPrice(Double goodsFinalPrice) {
        this.goodsFinalPrice = goodsFinalPrice;
    }

    public Integer getGoodsFinalNum() {
        return goodsFinalNum;
    }

    public void setGoodsFinalNum(Integer goodsFinalNum) {
        this.goodsFinalNum = goodsFinalNum;
    }
}