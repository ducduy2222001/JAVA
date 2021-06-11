package Do_an;

import java.awt.Color;
import java.awt.Graphics;

public class Stack {
	private Block headBlock;

	public Block getHeadLock() {
		return headBlock;
	}

	public void setHeadBlock(Block headBlock) {
		this.headBlock = headBlock;
	}
	// add blocks
	public void push(Block block) {
		if (headBlock == null)
			headBlock = block;
		else {
			Block currentBlock = headBlock;
			while (currentBlock.getNext() != null) {
				currentBlock = currentBlock.getNext();
				System.out.println("0" + currentBlock);
				System.out.println("1." + headBlock);
			}
			System.out.println("2" + currentBlock);
			System.out.println("3." + headBlock);
			currentBlock.setNext(block);
		}
	}
	// remove block
	public Block pop() {
		Block popBlock = null;
		if (count() == 1) {
			popBlock = headBlock;
			headBlock = null;
		} else if (count() > 1) {
			Block currentBlock = headBlock;
			for (int i = 1; i < count() - 1; i++)
				currentBlock = currentBlock.getNext();

			popBlock = currentBlock.getNext();
			currentBlock.setNext(null);
		}
		return popBlock;
	}

	// get block
	public Block peek() {
		if (count() > 0) {
			Block currentBlock = headBlock;
			while (currentBlock.getNext() != null)
				currentBlock = currentBlock.getNext();

			return currentBlock;

		} else
			return null;
	}

	// count of blocks in a stack
	public int count() {
		int ctr = 0;
		Block currentBlock = headBlock;
		while (currentBlock != null) {
			ctr++;
			currentBlock = currentBlock.getNext();
		}
		return ctr;
	}

	public void drawBlocks(Graphics g, int x) {
		Color c[] = { Color.yellow, Color.red, Color.blue, Color.pink, Color.cyan, Color.magenta, Color.green,
				Color.orange, Color.lightGray };
		Block currentBlock = headBlock;
		for (int i = 0; i < count(); i++) {

			int xPos = x + (200 - currentBlock.getLength()) / 2;
			int yPos = 380 - (i * 40);
			g.setColor(c[i]);
			g.fillRect(xPos, yPos, currentBlock.getLength(), 38);
			currentBlock = currentBlock.getNext();
		}
	}
}
