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


import com.dao.XiaofeixinxiDao;
import com.entity.XiaofeixinxiEntity;
import com.service.XiaofeixinxiService;
import com.entity.vo.XiaofeixinxiVO;
import com.entity.view.XiaofeixinxiView;

@Service("xiaofeixinxiService")
public class XiaofeixinxiServiceImpl extends ServiceImpl<XiaofeixinxiDao, XiaofeixinxiEntity> implements XiaofeixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaofeixinxiEntity> page = this.selectPage(
                new Query<XiaofeixinxiEntity>(params).getPage(),
                new EntityWrapper<XiaofeixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaofeixinxiEntity> wrapper) {
		  Page<XiaofeixinxiView> page =new Query<XiaofeixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaofeixinxiVO> selectListVO(Wrapper<XiaofeixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaofeixinxiVO selectVO(Wrapper<XiaofeixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaofeixinxiView> selectListView(Wrapper<XiaofeixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaofeixinxiView selectView(Wrapper<XiaofeixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
