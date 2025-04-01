package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 会员参加
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-23 15:32:08
 */
@TableName("huiyuancanjia")
public class HuiyuancanjiaEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HuiyuancanjiaEntity() {
		
	}
	
	public HuiyuancanjiaEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 活动编号
	 */
					
	private String huodongbianhao;
	
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
	 * 会员账号
	 */
					
	private String huiyuanzhanghao;
	
	/**
	 * 会员姓名
	 */
					
	private String huiyuanxingming;
	
	/**
	 * 申请日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：活动编号
	 */
	public void setHuodongbianhao(String huodongbianhao) {
		this.huodongbianhao = huodongbianhao;
	}
	/**
	 * 获取：活动编号
	 */
	public String getHuodongbianhao() {
		return huodongbianhao;
	}
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
