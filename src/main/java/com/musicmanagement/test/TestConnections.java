package com.musicmanagement.test;

import java.util.List;

import com.musicmanagement.dao.MusicDao;
import com.musicmanagement.dao.MusicDaoImpl;
import com.musicmanagement.entity.Music;

public class TestConnections {
	
	public static void main(String[] args) throws Exception {
		MusicDao musicDao = new MusicDaoImpl();
		
		List<Music> musics = musicDao.getListMusic();
		musics.forEach(music ->{
			System.out.println(music.toString());
		});
		
		
	}
}
