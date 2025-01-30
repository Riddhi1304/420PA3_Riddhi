package com.assiegnment2;

public class ishootable {
    public interface IShootable{
        void onHit(int damage);
    }
    public class Player implements IShootable {
        private int health;

        public Player(int health) {
            this.health = health;
        }

        @Override
        public void onHit(int damage) {
            health -= damage;
            System.out.println("Player hit! Health reduced by " + damage + ". Current health: " + health);
        }
    }

    public class Wall implements IShootable {
        private int durability;

        public Wall(int durability) {
            this.durability = durability;
        }

        @Override
        public void onHit(int damage) {
            durability -= damage;
            System.out.println("Wall hit! Durability reduced by " + damage + ". Current durability: " + durability);
        }
    }
}
