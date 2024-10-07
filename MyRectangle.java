public class MyRectangle {
    private MyPoint topleft;
    private MyPoint bottomright;

    public MyRectangle(MyPoint topleft, MyPoint bottomright)
    {
       this.topleft = topleft;
       this.bottomright = bottomright; 
    }
    public MyPoint getTopLeft()
    {
        return this.topleft;
    }
    public void setTopLeft(MyPoint topleft)
    {
        this.topleft = topleft;
    }
    public MyPoint getBottomRight()
    {
        return this.bottomright;
    }
    public void setBottomRight(MyPoint bottomright)
    {
        this.bottomright = bottomright;
    }
    public double Area()
    {
        return (this.topleft.getX() * this.bottomright.getY());
    }
    public double getPerimeter()
    {
        return (topleft.getX() + topleft.getY() + bottomright.getX() + bottomright.getY());
    }
    public String toString()
    {
        return ("MyRectangle[topleft=(" + this.topleft + "),bottomright=(" + this.bottomright + ")]");
    }
}
