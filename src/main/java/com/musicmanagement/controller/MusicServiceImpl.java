package com.musicmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.musicmanagement.dao.MusicDao;
import com.musicmanagement.entity.Music;

public class MusicServiceImpl implements MusicService {

	@Autowired
	private MusicDao musicDao;
	@Override
	public List<Music> getListMusic() throws Exception {
		// TODO Auto-generated method stub
		return musicDao.getListMusic();
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
