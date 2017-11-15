package br.com.baseproject.baseproject.Models;

import com.stfalcon.chatkit.commons.models.IUser;

/**
 * Created by mvenosa on 15/11/17.
 */

public class Author implements IUser {

    private String id;
    private String name;
    private String avatar;
    private boolean online;

    public Author(String id, String name, String avatar, boolean online) {
        this.id = id;
        this.name = name;
        this.avatar = avatar;
        this.online = online;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAvatar() {
        return avatar;
    }

    public boolean isOnline() {
        return online;
    }

}