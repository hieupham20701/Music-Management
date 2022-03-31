package com.musicmanagement.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.musicmanagement.entity.Music;

@Repository
public class MusicDaoImpl implements MusicDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public List<Music> getListMusic() throws Exception{
		// TODO Auto-generated method stub
		List<Music> musics = new ArrayList<Music>();
		Session session = sessionFactory.getCurrentSession();
		
		musics = session.createNativeQuery("Select * from music", Music.class).getResultList();
		
		return musics;
	}

	@Override
	public void saveMusic(Music music) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateMusic(Music music) {
		// TODO Auto-generated method stub

	}

	@Override
	public Music getMusic(Music music) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMusic(Music music) {
		// TODO Auto-generated method stub

	}

}
