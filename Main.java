import java.util.ArrayList;
import java.util.List;

class Coliders{
    public int x,y,width,height;

    public Coliders(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    /// should run in every times that update func run
    public void show(){
        // write your JavaFx codes to show Ball in Window
    }
}

class Ball{
    public int x,y,velocity_X,velocity_Y,ball_Radius;
    // UP LEFT DOWN RIGHT
    public int[] moveAbility = {1,1,1,1};

    public Ball(int x, int y, int velocity_X, int velocity_Y, int ball_Radius) {
        this.x = x;
        this.y = y;
        this.velocity_X = velocity_X;
        this.velocity_Y = velocity_Y;
        this.ball_Radius = ball_Radius;
    }
    /// should run in every times that update func run
    public void setAbilityMoves(java.util.List<Coliders> coliders){
        for(int i=0;i<coliders.size();i++){
            //check move right ability
            if(coliders.get(i).y<this.y && this.y<coliders.get(i).y+coliders.get(i).height && (coliders.get(i).x - this.x)<=this.ball_Radius)
                this.moveAbility[3] = 0;
            else
                this.moveAbility[3] = 1;
            //check move left ability
            if(coliders.get(i).y<this.y && this.y<coliders.get(i).y+coliders.get(i).height && (coliders.get(i).x+coliders.get(i).width)-this.x<=this.ball_Radius)
                this.moveAbility[1] = 0;
            else
                this.moveAbility[1] = 1;
            //check move down ability
            if(coliders.get(i).x<this.x && this.x<coliders.get(i).x+coliders.get(i).width && this.y-(coliders.get(i).y)<=this.ball_Radius)
                this.moveAbility[2] = 0;
            else
                this.moveAbility[2] = 1;
            //check move up ability
            if(coliders.get(i).x<this.x && this.x<coliders.get(i).x+coliders.get(i).width && (coliders.get(i).y+coliders.get(i).height)-this.y<=this.ball_Radius)
                this.moveAbility[0] = 0;
            else
                this.moveAbility[0] = 1;
        }
    }
    /// should run in every times that update func run
    public void show(){
        // write your JavaFx codes to show Ball in Window
    }

    public void moveRight(){
        if(this.moveAbility[3]){
            this.x += this.velocity_X;
        }
    }
    public void moveLeft(){
        if(this.moveAbility[1]){
            this.x -= this.velocity_X;
        }
    }
    public void moveUp(){
        if(this.moveAbility[0]){
            this.y -= this.velocity_Y;
        }
    }
    public void moveDown(){
        if(this.moveAbility[2]){
            this.y += this.velocity_Y;
        }

    }

}



public class Main {
    public static void main(String[] args){

    }
}
