package com.entity.vo;

import com.entity.XiaofeixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 消费信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-23 15:32:08
 */
public class XiaofeixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 会员账号
	 */
	
	private String huiyuanzhanghao;
		
	/**
	 * 会员姓名
	 */
	
	private String huiyuanxingming;
		
	/**
	 * 金额
	 */
	
	private Integer jine;
		
	/**
	 * 消费名称
	 */
	
	private String xiaofeimingcheng;
		
	/**
	 * 消费日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date xiaofeiriqi;
				
	
	/**
	 * 设置：会员账号
	 */
	 
	public void setHuiyuanzhanghao(String huiyuanzhanghao) {
		this.huiyuanzhanghao = huiyuanzhanghao;
	}
	
	/**
	 * 获取：会员账号
	 */
	public String getHuiyuanzhanghao() {
		return huiyuanzhanghao;
	}
				
	
	/**
	 * 设置：会员姓名
	 */
	 
	public void setHuiyuanxingming(String huiyuanxingming) {
		this.huiyuanxingming = huiyuanxingming;
	}
	
	/**
	 * 获取：会员姓名
	 */
	public String getHuiyuanxingming() {
		return huiyuanxingming;
	}
				
	
	/**
	 * 设置：金额
	 */
	 
	public void setJine(Integer jine) {
		this.jine = jine;
	}
	
	/**
	 * 获取：金额
	 */
	public Integer getJine() {
		return jine;
	}
				
	
	/**
	 * 设置：消费名称
	 */
	 
	public void setXiaofeimingcheng(String xiaofeimingcheng) {
		this.xiaofeimingcheng = xiaofeimingcheng;
	}
	
	/**
	 * 获取：消费名称
	 */
	public String getXiaofeimingcheng() {
		return xiaofeimingcheng;
	}
				
	
	/**
	 * 设置：消费日期
	 */
	 
	public void setXiaofeiriqi(Date xiaofeiriqi) {
		this.xiaofeiriqi = xiaofeiriqi;
	}
	
	/**
	 * 获取：消费日期
	 */
	public Date getXiaofeiriqi() {
		return xiaofeiriqi;
	}
			
}
