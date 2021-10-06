package com.company;


public class GameCharacter {
    private String name;
    private int lifePoint = 100;
    private int attackHitPoint;
    private int attackKickPoint;


    public GameCharacter(String name, int attackHitPoint, int attackKickPoint) {
        this.name = name;
        this.attackHitPoint = attackHitPoint;
        this.attackKickPoint = attackKickPoint;
    }

    public String getname() {
        return name;
    }

    public int getlifePoint() {
        return lifePoint;
    }

    public void setlifePoint (int lifePoint) {
        this.lifePoint = lifePoint;
    }

    public void kick (GameCharacter character) {
        character.setlifePoint(character.getlifePoint()-this.attackKickPoint);
    }

    public void hit (GameCharacter character) {
        character.setlifePoint(character.getlifePoint()-this.attackHitPoint);
    }

    public void compare(GameCharacter character){
        int result = Integer.compare(this.lifePoint, character.getlifePoint());
        if (result>0) {
            System.out.println(this.name + " is winner!");
        }else if (result<0) {
            System.out.println(character.getname() + " is winner!");
        }else{
            System.out.println(" draw ");
        }
    }
}