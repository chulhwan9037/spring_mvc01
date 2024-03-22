package com.ict.guestbook.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

public class GuestBookDAO {
	private SqlSessionTemplate sqlSessionTemplate;

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	
	public List<GuestBookVO> guestBookList() {
		try {
			List<GuestBookVO> list = null;
			list = sqlSessionTemplate.selectList("guestbook.list");
			return list;
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
	// 삽입
	public int guestBookInsert(GuestBookVO gvo) {
		try {
			int result = 0;
			result = sqlSessionTemplate.insert("guestbook.insert", gvo);
			return result;
		} catch (Exception e) {
			System.out.println(e);
		}
		return -1; // 업데이트가 0개 인지 실패한건지 알기위해 음수를 준다.
	}
	
	// 상세보기
	public GuestBookVO guestBookDetail(String idx) {
		try {
			GuestBookVO gvo = sqlSessionTemplate.selectOne("guestbook.detail", idx);
			return gvo;
		} catch (Exception e) {
			System.out.println("ggggg");
			System.out.println(e);
		}
		return null;
	}
	
	// 삭제하기
	public int guestBookDelete(String idx) {
		try {
			int result = 0;
			result = sqlSessionTemplate.delete("guestbook.delete", idx);
			return result;
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return -1;
	}
	
	// 수정하기
	public int guestBookUpdate(GuestBookVO gvo) {
		try {
			int result = 0;
			result = sqlSessionTemplate.update("guestbook.update", gvo);
			return result;
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return -1;
	}
	
	
	
	
	
	
	
	
	
	
	
}
