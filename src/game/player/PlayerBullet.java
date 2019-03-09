package game.player;

import game.GameObject;
import game.Vector2D;
import game.enemy.Enemy;
import tklibs.SpriteUtils;

import java.awt.*;
import java.awt.image.BufferedImage;


public class PlayerBullet extends GameObject {


    public PlayerBullet(){
        image = SpriteUtils.loadImage("assets/images/enemies/bullets/cyan.png");
//        velocity=new Vector2D(0,-20);
        velocity.set(0,-20);
    }


    @Override
    public void run(){
        super.run();
//        Enemy enemy = GameObject.find(Enemy.class);
//            if(enemy != null){
//                Vector2D bulletToEnemy = enemy.position.clone();
//                bulletToEnemy.subtract(this.position);
//                bulletToEnemy.setLength(20);
//                this.velocity.set(bulletToEnemy);
//            }

    }

}
//homework: dan duoi hinh vong cung