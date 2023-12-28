
package org.example;
import processing.core.PApplet;
public class Main extends PApplet{
    public static final int HEIGHT=480;
    public static final int WIDTH=640;
    int firstCircle=0;
    int secondCircle=0;
    int thirdCircle=0;
    int fourthCircle=0;
    public static void main(String[] args) {PApplet.main("org.example.Main",args);}

    @Override
    public void settings(){
        super.settings();
        size(WIDTH,HEIGHT);
    }
    @Override
    public void setup(){}
    @Override
    public void draw() {
        ellipse(firstCircle++,(HEIGHT/5)*1,20,20);
        ellipse(secondCircle,(HEIGHT/5)*2,20,20);
        ellipse(thirdCircle,(HEIGHT/5)*3,20,20);
        ellipse(fourthCircle,(HEIGHT/5)*4,20,20);
        secondCircle+=2;
        thirdCircle+=3;
        fourthCircle+=4;
    }
}