/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.home.hibernatejsf.service;

import com.home.hibernatejsf.model.Music;
import com.home.hibernatejsf.model.MusicType;
import java.util.List;

/**
 *
 * @author Mike
 */
public interface MusicService {
    List<Music> getMusicListByMusicType(MusicType mt);
    Music getMusicById(Long id);
}
