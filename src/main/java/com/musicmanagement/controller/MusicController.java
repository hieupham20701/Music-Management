package com.musicmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.musicmanagement.entity.Music;

@Controller
@RequestMapping("/")
public class MusicController {

	@Autowired
	private MusicService musicService;
	
	@GetMapping("/")
	public String listMusic(Model theModel) throws Exception {
		List<Music> list = musicService.getListMusic();
		theModel.addAttribute("musics",list);
		
		return "home-page";
	}

}
