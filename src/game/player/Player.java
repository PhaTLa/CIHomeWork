package game.player;

import game.GameObject;
import game.GameWindow;
import game.Settings;
import tklibs.SpriteUtils;

import java.awt.*;
import java.util.ArrayList;

public class Player extends GameObject {
    ArrayList<PlayerBullet> bullets;
    public Player(){
        image = SpriteUtils.loadImage("assets/images/players/straight/0.png");//relative path
        position.set(200,500);
        bullets=new ArrayList<>();
    }
    @Override
    public void render(Graphics g){
//        g.drawImage(image,(int) position.x,(int) position.y,null);//ve sau khi ve background
        super.render(g);
        for(int i=0;i<bullets.size();i++){
            PlayerBullet bullet=bullets.get(i);
            bullet.render(g);
        }
    }
    @Override
    public void run(){
        super.run();
        move();
        fire();
        bulletRun();

    }

    int frameCount;
    private void fire() {
        frameCount++;
        if(GameWindow.isFirePress && frameCount>10){
            //thaay bang mot vong for
            for(double i=-3*Math.PI/4;i<=-Math.PI/4;i+=Math.PI/20){
                PlayerBullet bullet1=new PlayerBullet();
                bullet1.position.set(position.x,position.y);
                bullet1.velocity.setAngle(i);
                bullets.add(bullet1);
            }
            frameCount=0;
        }
    }

    private void move() {
        int playerSpeed=10;
        int vx=0;
        int vy=0;
        if(GameWindow.isUpPress){
            vy-=playerSpeed;
            if(position.y<0){
                position.set(position.x,0);
            }
        }

        if(GameWindow.isDownPress){
            vy+=playerSpeed;
            if(position.y> Settings.GAME_HEIGHT - image.getHeight()){
                position.set(position.x,Settings.GAME_HEIGHT- image.getHeight());
            }
        }
        if(GameWindow.isLeftPress){
            vx-=playerSpeed;
            if(position.x<=0){
                position.set(0, position.y);
            }
        }
        if(GameWindow.isRightPress){
            vx+=playerSpeed;
            if(position.x >= Settings.BACKGROUND_WIDTH - image.getWidth()){
                position.set(Settings.BACKGROUND_WIDTH - image.getWidth(), position.y);
            }

        }
        velocity.set(vx,vy);
        velocity.setLength(playerSpeed);
    }
    private void bulletRun() {

        for(int i=0;i<bullets.size();i++){
            PlayerBullet bullet=bullets.get(i);
            bullet.run();
        }
    }
}
//nang cap ban dan
