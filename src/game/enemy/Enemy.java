package game.enemy;

import game.GameObject;
import game.Settings;
import tklibs.SpriteUtils;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;


public class Enemy extends GameObject {
    ArrayList<EnemyBullet> enemybullets;

    public Enemy(){
        image= SpriteUtils.loadImage("assets/images/enemies/level0/pink/0.png");
//        velocity=new Vector2D(0,4);
        velocity.set(0,3);
        enemybullets=new ArrayList<>();
    }

    @Override
    public void render(Graphics g) {
        super.render(g);
        for(int i=0;i<enemybullets.size();i++){
            EnemyBullet ebullet=enemybullets.get(i);
            ebullet.render(g);
        }
    }

    @Override
    public void run(){
        super.run();
        changeDirection();
        Efire();
        EBrun();
    }

    private void EBrun() {
        for(int i=0;i<enemybullets.size();i++){
            EnemyBullet ebullet=enemybullets.get(i);
            ebullet.run();
        }
    }

    int EframeCount;
    private void Efire() {
        EframeCount++;
        if(this.position.y>0 && this.position.y<Settings.GAME_HEIGHT && EframeCount>80){
            EnemyBullet ebullet= new EnemyBullet();
            ebullet.position.set(position.x,position.y);
            enemybullets.add(ebullet);
            EframeCount=0;
        }
    }

    private void changeDirection() {
        if(position.x> Settings.BACKGROUND_WIDTH-28 && velocity.x>0){
            velocity.set(-velocity.x,velocity.y);
        }
        if(position.x<0 && velocity.x<0){
            velocity.set(-velocity.x,velocity.y);
        }
    }


}
