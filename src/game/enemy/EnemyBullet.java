package game.enemy;

import game.GameObject;
import game.Vector2D;
import tklibs.SpriteUtils;

public class EnemyBullet extends GameObject {
    public EnemyBullet(){
        image= SpriteUtils.loadImage("assets/images/player-bullets/a/1.png");
        velocity=new Vector2D(0,5);
    }

    @Override
    public void run() {
        super.run();
    }

}
