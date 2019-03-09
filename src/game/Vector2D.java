package game;

public class Vector2D {
    public double x;
    public double y;
//nen viet ham tao day du truoc ,roi chen cac ham tao khuyet sau len truoc va su dung vu phap nhu duoi
    public Vector2D() {
        this(0,0);
    }

    public Vector2D (Vector2D other){
        this(other.x,other.y);
    }

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void add(Vector2D other){
        this.add(other.x,other.y);
    }

    public void add(double x,double y){
        this.x+=x;
        this.y+=y;
    }

    public void subtract(Vector2D other){
        this.subtract(other.x,other.y);
    }
    public void subtract(double x,double y){
        this.x-=x;
        this.y-=y;
    }

    public void scale(double rate){
        this.x*=rate;
        this.y*=rate;
    }

    public void set(Vector2D other){
        this.set(other.x,other.y);
    }

    public void set(double x,double y){
        this.x=x;
        this.y=y;
    }

    public Vector2D clone(){
        Vector2D v2 = new Vector2D();
        v2.x=this.x;
        v2.y=this.y;

        return v2;
        //or return new Vetctor2D(this.x,this.y);
    }

    public double getLength(){
        return(Math.sqrt(this.x*this.x+this.y*this.y));
    }

    public void setLength(double length){
        double currentLength=this.getLength();
        if(currentLength!=0){
            this.x=this.x*(length/currentLength);
            this.y=this.y*(length/currentLength);
        }
    }

    public double getAngle(){
        return(Math.atan(this.x/this.y));
    }

    public void setAngle(double Angle){
        double length=this.getLength();
        if(length!=0){
            this.x=length*Math.cos(Angle);
            this.y=length*Math.sin(Angle);
        }

    }

    //test



}
