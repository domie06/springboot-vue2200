package com.entity.view;

import com.entity.XiaofeixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 消费信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-23 15:32:08
 */
@TableName("xiaofeixinxi")
public class XiaofeixinxiView  extends XiaofeixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaofeixinxiView(){
	}
 
 	public XiaofeixinxiView(XiaofeixinxiEntity xiaofeixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, xiaofeixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
