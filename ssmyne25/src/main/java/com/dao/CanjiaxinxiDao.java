package com.dao;

import com.entity.CanjiaxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CanjiaxinxiVO;
import com.entity.view.CanjiaxinxiView;


/**
 * 参加信息
 * 
 * @author 
 * @email 
 * @date 2021-04-23 15:32:08
 */
public interface CanjiaxinxiDao extends BaseMapper<CanjiaxinxiEntity> {
	
	List<CanjiaxinxiVO> selectListVO(@Param("ew") Wrapper<CanjiaxinxiEntity> wrapper);
	
	CanjiaxinxiVO selectVO(@Param("ew") Wrapper<CanjiaxinxiEntity> wrapper);
	
	List<CanjiaxinxiView> selectListView(@Param("ew") Wrapper<CanjiaxinxiEntity> wrapper);

	List<CanjiaxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<CanjiaxinxiEntity> wrapper);
	
	CanjiaxinxiView selectView(@Param("ew") Wrapper<CanjiaxinxiEntity> wrapper);
	
}
