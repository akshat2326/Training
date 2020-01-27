package com.robomq.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.robomq.pojo.Mobile;
import com.robomq.pojo.MobileMapper;

@Component
public class MobileDAOImpl implements MobileDAO{


	JdbcTemplate jdbcTemplate;
	
	private final String SQL_FIND_MOBILE = "select * from mobile where id = ?";
	private final String SQL_DELETE_MOBILE = "delete from mobile where id = ?";
	private final String SQL_UPDATE_MOBILE = "update mobile set `name` = ?, `price` = ?, `qty`  = ?, `desc` = ? where `id` = ?";
	private final String SQL_GET_ALL = "select * from mobile";
	private final String SQL_INSERT_MOBILE = "insert into mobile(id, name, price, qty, `desc`) values(?,?,?,?,?)";
	
	
	@Autowired
	public MobileDAOImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	public Mobile getMobileById(int id) {
		
		return jdbcTemplate.queryForObject(SQL_FIND_MOBILE	, new Object[] { id }, new MobileMapper());
	}
	public List<Mobile> getAllMobile() {
		
		return jdbcTemplate.query(SQL_GET_ALL, new MobileMapper());
	}
	public boolean deleteMobile(Mobile mobile) {
	
		return jdbcTemplate.update(SQL_DELETE_MOBILE, mobile.getId()) > 0;
	}
	public boolean updateMobile(Mobile mobile) {
		
		return jdbcTemplate.update(SQL_UPDATE_MOBILE, mobile.getName(), mobile.getPrice(), mobile.getQty(),
				mobile.getDesc(), mobile.getId()) > 0;
	}
	//id, name, price, qty, desc
	public boolean createMobile(Mobile mobile) {
		return jdbcTemplate.update(SQL_INSERT_MOBILE, mobile.getId(), mobile.getName(), mobile.getPrice(), mobile.getQty(),
				mobile.getDesc()) > 0; 
	}
	


}
