package com.dao;

import com.entity.XiaofeixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaofeixinxiVO;
import com.entity.view.XiaofeixinxiView;


/**
 * 消费信息
 * 
 * @author 
 * @email 
 * @date 2021-04-23 15:32:08
 */
public interface XiaofeixinxiDao extends BaseMapper<XiaofeixinxiEntity> {
	
	List<XiaofeixinxiVO> selectListVO(@Param("ew") Wrapper<XiaofeixinxiEntity> wrapper);
	
	XiaofeixinxiVO selectVO(@Param("ew") Wrapper<XiaofeixinxiEntity> wrapper);
	
	List<XiaofeixinxiView> selectListView(@Param("ew") Wrapper<XiaofeixinxiEntity> wrapper);

	List<XiaofeixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<XiaofeixinxiEntity> wrapper);
	
	XiaofeixinxiView selectView(@Param("ew") Wrapper<XiaofeixinxiEntity> wrapper);
	
}
