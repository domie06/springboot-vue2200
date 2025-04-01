package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.HuiyuancanjiaDao;
import com.entity.HuiyuancanjiaEntity;
import com.service.HuiyuancanjiaService;
import com.entity.vo.HuiyuancanjiaVO;
import com.entity.view.HuiyuancanjiaView;

@Service("huiyuancanjiaService")
public class HuiyuancanjiaServiceImpl extends ServiceImpl<HuiyuancanjiaDao, HuiyuancanjiaEntity> implements HuiyuancanjiaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuiyuancanjiaEntity> page = this.selectPage(
                new Query<HuiyuancanjiaEntity>(params).getPage(),
                new EntityWrapper<HuiyuancanjiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuiyuancanjiaEntity> wrapper) {
		  Page<HuiyuancanjiaView> page =new Query<HuiyuancanjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuiyuancanjiaVO> selectListVO(Wrapper<HuiyuancanjiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuiyuancanjiaVO selectVO(Wrapper<HuiyuancanjiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuiyuancanjiaView> selectListView(Wrapper<HuiyuancanjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuiyuancanjiaView selectView(Wrapper<HuiyuancanjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
