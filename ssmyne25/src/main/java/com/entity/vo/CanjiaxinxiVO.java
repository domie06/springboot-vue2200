package com.entity.vo;

import com.entity.CanjiaxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 参加信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-23 15:32:08
 */
public class CanjiaxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 活动名称
	 */
	
	private String huodongmingcheng;
		
	/**
	 * 活动类型
	 */
	
	private String huodongleixing;
		
	/**
	 * 活动地址
	 */
	
	private String huodongdizhi;
		
	/**
	 * 活动日期
	 */
	
	private String huodongriqi;
		
	/**
	 * 个人账号
	 */
	
	private String gerenzhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 申请日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shenqingriqi;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：活动名称
	 */
	 
	public void setHuodongmingcheng(String huodongmingcheng) {
		this.huodongmingcheng = huodongmingcheng;
	}
	
	/**
	 * 获取：活动名称
	 */
	public String getHuodongmingcheng() {
		return huodongmingcheng;
	}
				
	
	/**
	 * 设置：活动类型
	 */
	 
	public void setHuodongleixing(String huodongleixing) {
		this.huodongleixing = huodongleixing;
	}
	
	/**
	 * 获取：活动类型
	 */
	public String getHuodongleixing() {
		return huodongleixing;
	}
				
	
	/**
	 * 设置：活动地址
	 */
	 
	public void setHuodongdizhi(String huodongdizhi) {
		this.huodongdizhi = huodongdizhi;
	}
	
	/**
	 * 获取：活动地址
	 */
	public String getHuodongdizhi() {
		return huodongdizhi;
	}
				
	
	/**
	 * 设置：活动日期
	 */
	 
	public void setHuodongriqi(String huodongriqi) {
		this.huodongriqi = huodongriqi;
	}
	
	/**
	 * 获取：活动日期
	 */
	public String getHuodongriqi() {
		return huodongriqi;
	}
				
	
	/**
	 * 设置：个人账号
	 */
	 
	public void setGerenzhanghao(String gerenzhanghao) {
		this.gerenzhanghao = gerenzhanghao;
	}
	
	/**
	 * 获取：个人账号
	 */
	public String getGerenzhanghao() {
		return gerenzhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：申请日期
	 */
	 
	public void setShenqingriqi(Date shenqingriqi) {
		this.shenqingriqi = shenqingriqi;
	}
	
	/**
	 * 获取：申请日期
	 */
	public Date getShenqingriqi() {
		return shenqingriqi;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
