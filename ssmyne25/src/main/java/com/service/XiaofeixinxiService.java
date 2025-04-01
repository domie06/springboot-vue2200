package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaofeixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaofeixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaofeixinxiView;


/**
 * 消费信息
 *
 * @author 
 * @email 
 * @date 2021-04-23 15:32:08
 */
public interface XiaofeixinxiService extends IService<XiaofeixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaofeixinxiVO> selectListVO(Wrapper<XiaofeixinxiEntity> wrapper);
   	
   	XiaofeixinxiVO selectVO(@Param("ew") Wrapper<XiaofeixinxiEntity> wrapper);
   	
   	List<XiaofeixinxiView> selectListView(Wrapper<XiaofeixinxiEntity> wrapper);
   	
   	XiaofeixinxiView selectView(@Param("ew") Wrapper<XiaofeixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaofeixinxiEntity> wrapper);
   	
}

