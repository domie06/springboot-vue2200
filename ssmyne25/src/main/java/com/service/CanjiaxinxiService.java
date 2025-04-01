package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CanjiaxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CanjiaxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CanjiaxinxiView;


/**
 * 参加信息
 *
 * @author 
 * @email 
 * @date 2021-04-23 15:32:08
 */
public interface CanjiaxinxiService extends IService<CanjiaxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CanjiaxinxiVO> selectListVO(Wrapper<CanjiaxinxiEntity> wrapper);
   	
   	CanjiaxinxiVO selectVO(@Param("ew") Wrapper<CanjiaxinxiEntity> wrapper);
   	
   	List<CanjiaxinxiView> selectListView(Wrapper<CanjiaxinxiEntity> wrapper);
   	
   	CanjiaxinxiView selectView(@Param("ew") Wrapper<CanjiaxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CanjiaxinxiEntity> wrapper);
   	
}

