package Do_an;

import java.awt.Color;

import javax.swing.JFrame;

public class Block{
	private int length;
	private Block next;
	public int getLength()
	{
		return length;
	}
	
	public void setLength(int length)
	{
		this.length=length;
	}
	
	public Block getNext()
	{
		return next;
	}
	
	public void setNext(Block next)
	{
		this.next=next;
	}
	
	public Block(int length)
	{
		super();
		this.length=length;
		this.next=null;
	}
	
}
