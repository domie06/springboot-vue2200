package com.dao;

import com.entity.HuiyuancanjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyuancanjiaVO;
import com.entity.view.HuiyuancanjiaView;


/**
 * 会员参加
 * 
 * @author 
 * @email 
 * @date 2021-04-23 15:32:08
 */
public interface HuiyuancanjiaDao extends BaseMapper<HuiyuancanjiaEntity> {
	
	List<HuiyuancanjiaVO> selectListVO(@Param("ew") Wrapper<HuiyuancanjiaEntity> wrapper);
	
	HuiyuancanjiaVO selectVO(@Param("ew") Wrapper<HuiyuancanjiaEntity> wrapper);
	
	List<HuiyuancanjiaView> selectListView(@Param("ew") Wrapper<HuiyuancanjiaEntity> wrapper);

	List<HuiyuancanjiaView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyuancanjiaEntity> wrapper);
	
	HuiyuancanjiaView selectView(@Param("ew") Wrapper<HuiyuancanjiaEntity> wrapper);
	
}
