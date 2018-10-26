package com.bell.b11.day1.day16;

import java.util.Objects;

public class Hospital2 {
        String name;
        String RoomType;
        String Servies;


    public Hospital2(String name, String roomType, String servies) {
        this.name = name;
        RoomType = roomType;
        Servies = servies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoomType() {
        return RoomType;
    }

    public void setRoomType(String roomType) {
        RoomType = roomType;
    }

    public String getServies() {
        return Servies;
    }

    public void setServies(String servies) {
        Servies = servies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hospital2 hospital2 = (Hospital2) o;
        return Objects.equals(name, hospital2.name) &&
                Objects.equals(RoomType, hospital2.RoomType) &&
                Objects.equals(Servies, hospital2.Servies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, RoomType, Servies);
    }
}
