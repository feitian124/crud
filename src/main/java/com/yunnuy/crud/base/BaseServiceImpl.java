package com.yunnuy.crud.base;

import java.util.List;

import org.beetl.sql.core.SQLManager;
import org.beetl.sql.core.db.KeyHolder;
import org.beetl.sql.core.engine.PageQuery;
import org.beetl.sql.core.mapper.BaseMapper;
import org.beetl.sql.core.query.LambdaQuery;
import org.beetl.sql.core.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseServiceImpl<T> implements BaseService<T> {
	
	@Autowired
	protected BaseMapper<T> baseMapper;

	@Override
	public void insert(T entity) {
		baseMapper.insert(entity);
	}

	@Override
	public void insert(T entity, boolean autDbAssignKey) {
		baseMapper.insert(entity, autDbAssignKey);
	}

	@Override
	public void insertTemplate(T entity) {
		baseMapper.insert(entity);
	}

	@Override
	public void insertTemplate(T entity, boolean autDbAssignKey) {
		baseMapper.insert(entity, autDbAssignKey);
	}

	@Override
	public void insertBatch(List<T> list) {
		baseMapper.insertBatch(list);
	}

	@Override
	public KeyHolder insertReturnKey(T entity) {
		return baseMapper.insertReturnKey(entity);
	}

	@Override
	public int updateById(T entity) {
		return baseMapper.updateById(entity);
	}

	@Override
	public int updateTemplateById(T entity) {
		return baseMapper.updateTemplateById(entity);
	}

	@Override
	public int deleteById(Object key) {
		return baseMapper.deleteById(key);
	}

	@Override
	public T unique(Object key) {
		return baseMapper.unique(key);
	}

	@Override
	public T single(Object key) {
		return baseMapper.single(key);
	}

	@Override
	public T lock(Object key) {
		return baseMapper.lock(key);
	}

	@Override
	public List<T> all() {
		return baseMapper.all();
	}

	@Override
	public List<T> all(int start, int size) {
		return baseMapper.all(start, size);
	}

	@Override
	public long allCount() {
		return baseMapper.allCount();
	}

	@Override
	public List<T> template(T entity) {
		return baseMapper.template(entity);
	}

	@Override
	public T templateOne(T entity) {
		return baseMapper.templateOne(entity);
	}

	@Override
	public List<T> template(T entity, int start, int size) {
		return baseMapper.template(entity, start, size);
	}

	@Override
	public void templatePage(PageQuery<T> query) {
		baseMapper.templatePage(query);
	}

	@Override
	public long templateCount(T entity) {
		return baseMapper.templateCount(entity);
	}

	@Override
	public List<T> execute(String sql, Object... args) {
		return baseMapper.execute(sql, args);
	}

	@Override
	public int executeUpdate(String sql, Object... args) {
		return baseMapper.executeUpdate(sql, args);
	}

	@Override
	public SQLManager getSQLManager() {
		return baseMapper.getSQLManager();
	}

	@Override
	public Query<T> createQuery() {
		return baseMapper.createQuery();
	}

	@Override
	public LambdaQuery<T> createLambdaQuery() {
		return baseMapper.createLambdaQuery();
	}

}
