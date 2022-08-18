package com.baiyun.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baiyun.dao.PropertyTypeMapper;
import com.baiyun.model.PropertyType;
import com.baiyun.service.IPropertyTypeService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PropertyTypeServiceImpl extends ServiceImpl<PropertyTypeMapper, PropertyType> implements IPropertyTypeService {

    @Override
    public IPage<PropertyType> findListByPage(Integer page, Integer pageCount){
        IPage<PropertyType> wherePage = new Page<>(page, pageCount);
        PropertyType where = new PropertyType();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }



    @Override
    public int add(PropertyType propertyType){
        return baseMapper.insert(propertyType);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(PropertyType propertyType){
        return baseMapper.updateById(propertyType);
    }

    @Override
    public PropertyType findById(Long id){
        return  baseMapper.selectById(id);
    }

    @Override
    public List<PropertyType> findAll() {
        return baseMapper.selectList(null);
    }
}
