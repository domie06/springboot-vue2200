package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyuancanjiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiyuancanjiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyuancanjiaView;


/**
 * 会员参加
 *
 * @author 
 * @email 
 * @date 2021-04-23 15:32:08
 */
public interface HuiyuancanjiaService extends IService<HuiyuancanjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyuancanjiaVO> selectListVO(Wrapper<HuiyuancanjiaEntity> wrapper);
   	
   	HuiyuancanjiaVO selectVO(@Param("ew") Wrapper<HuiyuancanjiaEntity> wrapper);
   	
   	List<HuiyuancanjiaView> selectListView(Wrapper<HuiyuancanjiaEntity> wrapper);
   	
   	HuiyuancanjiaView selectView(@Param("ew") Wrapper<HuiyuancanjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyuancanjiaEntity> wrapper);
   	
}

