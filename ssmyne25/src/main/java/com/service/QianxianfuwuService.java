package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QianxianfuwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QianxianfuwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QianxianfuwuView;


/**
 * 签线服务
 *
 * @author 
 * @email 
 * @date 2021-04-23 15:32:08
 */
public interface QianxianfuwuService extends IService<QianxianfuwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QianxianfuwuVO> selectListVO(Wrapper<QianxianfuwuEntity> wrapper);
   	
   	QianxianfuwuVO selectVO(@Param("ew") Wrapper<QianxianfuwuEntity> wrapper);
   	
   	List<QianxianfuwuView> selectListView(Wrapper<QianxianfuwuEntity> wrapper);
   	
   	QianxianfuwuView selectView(@Param("ew") Wrapper<QianxianfuwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QianxianfuwuEntity> wrapper);
   	
}

