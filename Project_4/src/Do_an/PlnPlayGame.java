package Do_an;

import java.awt.*;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PlnPlayGame extends JPanel {
	int block = 0;
	Stack tower1 = new Stack();
	Stack tower2 = new Stack();
	Stack tower3 = new Stack();
	boolean isSelectorTower1 = true;
	boolean isSelectorTower2 = false;
	boolean isSelectorTower3 = false;

	Block carriedBlock = null;

	public PlnPlayGame(int n) {
		block = n;
		addKeyListener(new ControlAdapter());
		setFocusable(true);
		for (int i = n - 1; i >= 0; i--) {
			tower1.push(new Block(60 + i * 40));
		}

	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		// Draw the object
		// Towers
		g.setColor(Color.lightGray);
		// Tower 1
		g.fillRect(140, 100, 40, 320);
		// Tower 2
		g.fillRect(460, 100, 40, 320);
		// Tower 3
		g.fillRect(780, 100, 40, 320);

		// blocks

		tower1.drawBlocks(g, 60);
		tower2.drawBlocks(g, 380);
		tower3.drawBlocks(g, 700);

		// carried block
		if (carriedBlock != null) {
			int xPos = 0;
			if (isSelectorTower1) {
				xPos = 70 + (200 - carriedBlock.getLength()) / 2;
			} else if (isSelectorTower2)
				xPos = 380 + (200 - carriedBlock.getLength()) / 2;
			else if (isSelectorTower3)
				xPos = 700 + (200 - carriedBlock.getLength()) / 2;

			g.fillRect(xPos, 40, carriedBlock.getLength(), 38);
		}

		// selector
		g.setColor(Color.blue);
		if (isSelectorTower1)
			g.drawRect(2, 40, 158 * 2, 380);
		else if (isSelectorTower2)
			g.drawRect(161 * 2, 40, 158 * 2, 380);
		else if (isSelectorTower3)
			g.drawRect(321 * 2, 40, 158 * 2, 380);
	}

	private void checkMove() {
		if (tower2.count() == block || tower3.count() == block) {
			JOptionPane.showMessageDialog(PlnPlayGame.this, "You win!");
		}
	}

	public class ControlAdapter extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {

			int key = e.getKeyCode();

			if (key == KeyEvent.VK_RIGHT) {
				if (isSelectorTower1) {
					isSelectorTower2 = true;
					isSelectorTower1 = false;
				} else if (isSelectorTower2) {
					isSelectorTower3 = true;
					isSelectorTower2 = false;
				}
			}

			if (key == KeyEvent.VK_LEFT) {
				if (isSelectorTower2) {
					isSelectorTower1 = true;
					isSelectorTower2 = false;
				} else if (isSelectorTower3) {
					isSelectorTower2 = true;
					isSelectorTower3 = false;
				}
			}

			if (key == KeyEvent.VK_UP) {
				if (carriedBlock == null) {
					if (isSelectorTower1)
						carriedBlock = tower1.pop();
					else if (isSelectorTower2)
						carriedBlock = tower2.pop();
					else if (isSelectorTower3)
						carriedBlock = tower3.pop();
				}
			}

			if (key == KeyEvent.VK_DOWN) {
				if (carriedBlock != null) {
					if (isSelectorTower1) {
						if (tower1.peek() == null || tower1.peek().getLength() > carriedBlock.getLength()) {
							tower1.push(carriedBlock);
							carriedBlock = null;
						}
					} else if (isSelectorTower2) {
						if (tower2.peek() == null || tower2.peek().getLength() > carriedBlock.getLength()) {
							tower2.push(carriedBlock);
							carriedBlock = null;
						}
					} else if (isSelectorTower3) {
						if (tower3.peek() == null || tower3.peek().getLength() > carriedBlock.getLength()) {
							tower3.push(carriedBlock);
							carriedBlock = null;
						}
					}
				}
			}
			checkMove();
			repaint();
		}
	}
}