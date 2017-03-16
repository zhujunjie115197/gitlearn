package com.sdb.common.sequence.dao;

import org.springframework.dao.DataAccessException;

import com.sdb.common.sequence.model.Sequence;

/**
 * 通过代码实现类似Oracle的Sequence的功能。
 * mysql、sqlserver数据库的自增长字段和oracle的Sequence均通过该功能实现。
 * 该功能需要数据库表的支持。
 * 表名：SEQ
 * 字段：
 * seqName	varchar(50) not null
 * currVal  number(20) not null
 * increment int  not null
 * @author halley.w
 *
 */
public interface SequenceDao {
	public Sequence nextVal(String SEQName,int cache) throws DataAccessException;
}
