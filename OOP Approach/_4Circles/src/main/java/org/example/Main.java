package org.example;
import processing.core.PApplet;
public class Main extends PApplet{
    public static final int HEIGHT=480;
    public static final int WIDTH=640;
    public static final int diameter=20;
    public static final int numberOfBalls=4;
    public class drawBall{
        int startPositionOnXAxis;
        int startPositionOnYAxis;
        int diameter;
        int ballSpeed;
        public drawBall(int startPositionOnXAxis,int startPositionOnYAxis,int diameter,int ballSpeed){
            this.startPositionOnXAxis=startPositionOnXAxis;
            this.startPositionOnYAxis=startPositionOnYAxis;
            this.diameter=diameter;
            this.ballSpeed=ballSpeed;
        }
        public void displayBall(){
            ellipse(startPositionOnXAxis,startPositionOnYAxis,diameter,diameter);
            startPositionOnXAxis=startPositionOnXAxis+ballSpeed;
        }
    }
    drawBall[] Balls=new drawBall[numberOfBalls];

    @Override
    public void settings() {
        size(WIDTH,HEIGHT);

    }

    @Override
    public void setup(){
        super.setup();
        for(int i=0;i<numberOfBalls;i++)
        {
            Balls[i]=new drawBall(0,(HEIGHT/numberOfBalls+1)*(i+1),diameter,i+1);
        }
    }

    @Override
    public void draw() {

        for(int i=0;i<numberOfBalls;i++)
        {
            Balls[i].displayBall();
        }

    }
    public static void main(String[] args) {PApplet.main("org.example.Main",args);}
}