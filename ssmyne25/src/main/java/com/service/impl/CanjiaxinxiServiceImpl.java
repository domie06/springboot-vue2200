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


import com.dao.CanjiaxinxiDao;
import com.entity.CanjiaxinxiEntity;
import com.service.CanjiaxinxiService;
import com.entity.vo.CanjiaxinxiVO;
import com.entity.view.CanjiaxinxiView;

@Service("canjiaxinxiService")
public class CanjiaxinxiServiceImpl extends ServiceImpl<CanjiaxinxiDao, CanjiaxinxiEntity> implements CanjiaxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CanjiaxinxiEntity> page = this.selectPage(
                new Query<CanjiaxinxiEntity>(params).getPage(),
                new EntityWrapper<CanjiaxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CanjiaxinxiEntity> wrapper) {
		  Page<CanjiaxinxiView> page =new Query<CanjiaxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CanjiaxinxiVO> selectListVO(Wrapper<CanjiaxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CanjiaxinxiVO selectVO(Wrapper<CanjiaxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CanjiaxinxiView> selectListView(Wrapper<CanjiaxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CanjiaxinxiView selectView(Wrapper<CanjiaxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
