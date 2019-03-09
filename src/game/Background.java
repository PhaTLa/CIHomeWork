package game;

import tklibs.SpriteUtils;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Background extends GameObject {

    public Background(){
        image = SpriteUtils.loadImage("assets/images/background/0.png");//xem SpriteUtils
//        position =new Vector2D(0,600- image.getHeight());
        position.set(0,Settings.GAME_HEIGHT-image.getHeight());
        velocity.set(0,3);
    }

    @Override
    public void run(){
        super.run();//position.add(velocity.x,velocity.y);
        if(position.y>0){
            position.set(position.x,0);//dung lai khi den dinh background
        }
    }


}
