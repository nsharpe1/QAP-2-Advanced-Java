public class MyLine {
   private MyPoint begin;
   private MyPoint end;

   public MyLine(int x1, int y1, int x2, int y2)
   {
      this.begin = new MyPoint(x1,y1);
      this.end = new MyPoint(x2,y2);
   }
   public MyLine (MyPoint begin, MyPoint end)
   {
      this.begin = begin;
      this.end = end;
   }
   public MyPoint getBegin()
   {
      return begin;
   }
   public void setBegin(MyPoint begin)
   {
      this.begin = begin;
   }
   public MyPoint getEnd()
   {
      return end;
   }
   public void setEnd(MyPoint end)
   {
      this.end = end;
   }
   public int getBeginX()
   {
      return this.begin.getX();
   }
   public void setBeginX(int x)
   {
      this.begin.getX();
   }
   public int getBeginY()
   {
      return this.begin.getY();
   }
   public void setBeginY(int y)
   {
      this.begin.getY();
   }
   public int getEndX() 
   {
      return this.end.getX();
   }
   public void setEndX(int x)
   {
      this.end.getX();
   }
   public int getEndY()
   {
      return this.end.getY();
   }
   public void setEndY(int y)
   {
      this.end.getY();
   }
   public int[] getBeginXY()
   {
      int a[] = new int[2];
      a[0] = this.begin.getX();
      a[1] = this.begin.getY();

      return a;
   }
   public void setBeginXY(int x, int y)
   {
      this.begin.setXY(x, y);
   }
   public int[] getEndXY()
   {
      int b[] = new int[2];
      b[0] = this.end.getX();
      b[1] = this.end.getY();

      return b;
   }
   public void setEndXY(int x, int y)
   {
      this.end.setXY(x, y);
   }
   public double getLength()
   {
      return (begin.distance(end) + end.distance(begin));
   }
   public double getGradient()
   {
      
      int XDiff = this.end.getX() - this.begin.getX();
      int YDiff = this.end.getY() - this.begin.getY();
      return Math.atan2(YDiff,XDiff);
   }
   public String toString()
   {
      return ("MyLine[begin=" + begin + ",end=" + end + "]");
   }
}
