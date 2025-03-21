package jc.entites; 

public class Horse

{
public Horse(String name)
{
    this.mName = name; 
    this.mPosX = 30;
    this.mPosY= 30;
   
}

public void move(int x, final int y)
{
   
    this.mPosX = x; 
    this.mPosY= y; 
    System.out.println("L'animal se deplace (x = "+this.mPosX+", Y =is.mPosY+")");
 }
    protected String mName;
    protected String mPosX;
    
    protected String mPosY; 
    
 }