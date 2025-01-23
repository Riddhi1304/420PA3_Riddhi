package com.modelClass;
import java.util.ArrayList;
import java.util.List;

public class Players {
    private String name;
    private String position;

    public Players(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }
    public class Team {
        private String teamName;
        private List<Players> players;

        public Team(String teamName) {
            this.teamName = teamName;
            this.players = new ArrayList<>();
        }
    }
}
