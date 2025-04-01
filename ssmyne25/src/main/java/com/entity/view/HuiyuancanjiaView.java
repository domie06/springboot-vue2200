package com.entity.view;

import com.entity.HuiyuancanjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 会员参加
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-23 15:32:08
 */
@TableName("huiyuancanjia")
public class HuiyuancanjiaView  extends HuiyuancanjiaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuiyuancanjiaView(){
	}
 
 	public HuiyuancanjiaView(HuiyuancanjiaEntity huiyuancanjiaEntity){
 	try {
			BeanUtils.copyProperties(this, huiyuancanjiaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
