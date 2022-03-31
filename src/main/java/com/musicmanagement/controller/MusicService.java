package com.musicmanagement.controller;

import java.util.List;

import com.musicmanagement.entity.Music;

public interface MusicService {
	public List<Music> getListMusic() throws Exception;

	public void saveMusic(Music music);

	public void updateMusic(Music music);

	public Music getMusic(Music music);

	public void deleteMusic(Music music);
}
