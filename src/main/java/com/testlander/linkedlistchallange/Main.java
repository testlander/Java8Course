package com.testlander.linkedlistchallange;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
        Album album = new Album("Master of Puppets", "Metallica");
        album.addSong("Master of Puppets", 4.8);
        album.addSong("Orion", 9.2);
        album.addSong("Fade to Black", 7.6);
        album.addSong("One", 8.3);
        album.addSong("Unforgiven", 5.8);
        album.addSong("Harvester of Sorrow", 4.2);
        albums.add(album);

        album = new Album("Ages High", "Iron Maiden");
        album.addSong("Ages High", 4.5);
        album.addSong("666", 4.1);
        album.addSong("Two Minutes to Midnight", 4.4);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<>();
        albums.get(0).addToPlayList("Orion", playList);
        albums.get(0).addToPlayList("One", playList);
        albums.get(0).addToPlayList("555", playList); //Does not exist
        albums.get(0).addToPlayList(5, playList);
        albums.get(1).addToPlayList(1, playList);
        albums.get(1).addToPlayList(9, playList); //There is no track 9

        play(playList);

    }

    private static void play(LinkedList<Song> playList) {
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("No songs in playlist");
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
        }

    }
}
