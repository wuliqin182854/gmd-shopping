package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TYPE_ONE表对应的实体类,用于保存表中一行二级类别信息
 * @author 吴丽琴
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TypeTwo {
	/**
	 * 	二级类别编号
	 */
    private Integer typeTwoId;

    /**
     * 	二级类别名称
     */
    private String typeTwoName;


    /**
	 * 	序号
	 */
    private Integer typeOneId;

    /**
	 * 	备注
	 */
    private String typeTwoRemark;

   
}