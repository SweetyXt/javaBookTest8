public class Point {
    int x,y;
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public String toString(){
        return "x为："+x+"y为"+y;
    }
    public Point(){
        x=0;
        y=0;
    }
    public Point(int xx,int yy){
        x=xx;
        y=yy;
    }
}
