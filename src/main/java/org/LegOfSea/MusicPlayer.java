package org.LegOfSea;/*
 *
 * @author Artem Kuchinskii
 *
 */

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();

    private String name;
    private int Volume;


    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return Volume;
    }

    public void setVolume(int volume) {
        Volume = volume;
    }

    public MusicPlayer() {}

    public void setClassicMusic(Music music)
    {
        this.musicList.add(music);
    }

    public void setRockMusic(Music music)
    {
        this.musicList.add(music);
    }

    public void setJazzMusic(Music music)
    {
        this.musicList.add(music);
    }

    public void playMusic()
    {
        for (int i=0;i<musicList.size();i++) {
            System.out.println("Playing: " + musicList.get(i).getSong() + " " + musicList.get(i).getTime());
        }
    }
}
