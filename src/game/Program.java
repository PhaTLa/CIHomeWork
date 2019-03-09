package game;

import javax.swing.*;
import java.awt.*;

/**
 * Created by huynq on 7/4/17.
 */
public class Program {


    public static void main(String[] args) {//alt+enter ===> sua loi
        GameWindow window = new GameWindow();// fn+shift+f6  ===> sua ten
        window.setTitle("TouHou");//ctrl+alt+L  ====> can chinh
        //window.setSize(, 600);
        window.setResizable(false);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        GamePanel panel = new GamePanel();
        panel.setPreferredSize(new Dimension(Settings.GAME_WIDTH,Settings.GAME_HEIGHT));
        panel.setBackground(Color.RED);

        window.add(panel);
        window.pack();//phai co
        window.setVisible(true);
        //setup xong


        panel.gameLoop();

//        ArrayList<game.Vector2D> vectors=new ArrayList<>();
//        vectors.add(new game.Vector2D(1,1));
//        vectors.add(new game.Vector2D(2,3));
//        vectors.add(new game.Vector2D(2,4));
//
//        game.Vector2D vmax=new game.Vector2D(0,0);
//
//        for(game.Vector2D v:vectors){
//            if(vmax.getLength()<v.getLength()){
//                vmax.set(v.x,v.y);
//            }
//        }
//        System.out.println("vector dai nhat: x="+vmax.x+" y="+vmax.y);
    }
}
