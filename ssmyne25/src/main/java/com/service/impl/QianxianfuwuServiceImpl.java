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


import com.dao.QianxianfuwuDao;
import com.entity.QianxianfuwuEntity;
import com.service.QianxianfuwuService;
import com.entity.vo.QianxianfuwuVO;
import com.entity.view.QianxianfuwuView;

@Service("qianxianfuwuService")
public class QianxianfuwuServiceImpl extends ServiceImpl<QianxianfuwuDao, QianxianfuwuEntity> implements QianxianfuwuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QianxianfuwuEntity> page = this.selectPage(
                new Query<QianxianfuwuEntity>(params).getPage(),
                new EntityWrapper<QianxianfuwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QianxianfuwuEntity> wrapper) {
		  Page<QianxianfuwuView> page =new Query<QianxianfuwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QianxianfuwuVO> selectListVO(Wrapper<QianxianfuwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QianxianfuwuVO selectVO(Wrapper<QianxianfuwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QianxianfuwuView> selectListView(Wrapper<QianxianfuwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QianxianfuwuView selectView(Wrapper<QianxianfuwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
