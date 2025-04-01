package com.dao;

import com.entity.QianxianfuwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QianxianfuwuVO;
import com.entity.view.QianxianfuwuView;


/**
 * 签线服务
 * 
 * @author 
 * @email 
 * @date 2021-04-23 15:32:08
 */
public interface QianxianfuwuDao extends BaseMapper<QianxianfuwuEntity> {
	
	List<QianxianfuwuVO> selectListVO(@Param("ew") Wrapper<QianxianfuwuEntity> wrapper);
	
	QianxianfuwuVO selectVO(@Param("ew") Wrapper<QianxianfuwuEntity> wrapper);
	
	List<QianxianfuwuView> selectListView(@Param("ew") Wrapper<QianxianfuwuEntity> wrapper);

	List<QianxianfuwuView> selectListView(Pagination page,@Param("ew") Wrapper<QianxianfuwuEntity> wrapper);
	
	QianxianfuwuView selectView(@Param("ew") Wrapper<QianxianfuwuEntity> wrapper);
	
}
