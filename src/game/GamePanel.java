package game;

import game.enemy.Enemy;
import game.player.Player;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;


public class GamePanel extends JPanel {//tap trung code chinh

//    BufferedImage image;
//    Vector2D position;
    Player player;
    Background background;
    ArrayList<Enemy> enemies;


    public GamePanel() {//load anh va khoi tao vi tri
        player=new Player();
        background=new Background();
        enemies=new ArrayList<>();

    }

    @Override//ko thich dung ham paint mac dinh thi dung tn
    public void paint(Graphics g) {//tu dong override===>cai nay eclipse ko co
        //System.out.println("paint");se dc goi moi khi cso thay doi
        background.render(g);
        player.render(g);

        for(int i=0;i<enemies.size();i++){
            Enemy enemy=enemies.get(i);
            enemy.render(g);
        }

    }

    public void gameLoop(){//de lam ra fps
        long lastloop=0;
        long delay=1000/60;
        while(true){
            long currentTime=System.currentTimeMillis();//thoi diem hien tai bang mili sec tinh tu nam 1970 den nay
            if(currentTime-lastloop > delay){
               runAll();//alt+enter
               renderAll();
                lastloop=currentTime;
            }
        }
    }

    private void renderAll() {//goi lai ham paint
        repaint();//goi lai ham paint = repaint(co san trong thu vien)
    }

    private void runAll() {//chuyen dong
        background.run();
        player.run();
        summonEnemy();
        enemiesRun();

    }

    private void enemiesRun() {
        for(int i=0;i<enemies.size();i++){
            Enemy enemy=enemies.get(i);
            enemy.run();
        }
    }

    int summonCount;
    int waveCount;
    int enemyCount;
    Random random =new Random();
    int enemyX=100+random.nextInt(200);

    private void summonEnemy() {
        waveCount++;
        if(waveCount>240){
            summonCount++;
            if(summonCount >30){
                Enemy enemy=new Enemy();
                enemy.position.set(enemyX,-100);
                enemy.velocity.setAngle(Math.PI/9);
                enemies.add(enemy);
                enemyCount++;
                summonCount=0;

                if(enemyCount>4){
                    waveCount=0;
                    enemyCount=0;
                    enemyX=100+random.nextInt(200);
                }
            }
        }
//note: if hell
    }

    //TODO: remove









}
