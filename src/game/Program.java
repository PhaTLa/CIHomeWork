package game;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by huynq on 7/4/17.
 */
public class Program {
    public static void main(String[] args) {
        GameWindow window = new GameWindow();
        window.setTitle("Game Touhou");
        window.setResizable(false);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        GamePanel panel = new GamePanel();
        panel.setPreferredSize(new Dimension(Settings.GAME_WIDTH, Settings.GAME_HEIGHT));
        panel.setBackground(Color.CYAN);

        window.add(panel);
        window.pack();

        window.setVisible(true);

        panel.gameLoop();

//        String[] arr={"a","b","d","c"};
//        java.util.List<String> list= Arrays.asList(arr);
//
//
//        list.add("a");
//        list.add("b");
//        list.add("c");
//        list.add("d");
//        list.add("e");
//        //trong java
//        list.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                //int <0=> o1<o2
//                //int =0: o1=o2
//                //int >0: o1>o2
//                return -o1.compareTo(o2);
//            }
//        });
//
//        for(String s: list){
//            System.out.println(s);
//        }


        // strings.add(); // them phan tu vao mang
        // strings.get(); // lay ra phan tu o index truyen vao
        // strings.size(); // lay ra kich thuoc mang
//        ArrayList<game.Vector2D> vectors = new ArrayList<>();
//        vectors.add(new game.Vector2D(1, 1));
//        vectors.add(new game.Vector2D(3, 7));
//        vectors.add(new game.Vector2D(3, 1));
//        // TODO: tim vector co length max
//        game.Vector2D maxLengthVector = null;
//        double maxLength = 0;
//        for (int i = 0; i < vectors.size(); i++) {
//            game.Vector2D vector = vectors.get(i);
//            if(vector.getLength() > maxLength) {
//                maxLengthVector = vector;
//                maxLength = vector.getLength();
//            }
//        }
//        System.out.println(maxLengthVector.x + " " + maxLengthVector.y);
    }
}
