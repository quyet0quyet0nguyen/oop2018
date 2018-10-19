package week5_6;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import java.util.ArrayList;
import java.util.Random;

public class Diagram{
	private JFrame mainFrame;
	private Layer layer;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Diagram frame = new Diagram();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Diagram() {
		constructor();
	}
	
	private void constructor() {
		layer = new Layer();
		layer.setShapeCount(5);
		mainFrame = new JFrame();
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(600,600);
		mainFrame.setLayout(new BorderLayout());
		mainFrame.add(layer);
		mainFrame.addKeyListener(new KeyListener() {
	        @Override
	        public void keyTyped(KeyEvent e) {
	            // TODO Auto-generated method stub
	        }
	        @Override
	        public void keyReleased(KeyEvent e) {
	            // TODO Auto-generated method stub
	        }
	        @Override
	        public void keyPressed(KeyEvent e) {
	            if (e.getKeyCode() == KeyEvent.VK_SPACE) {
	                layer.addShape();
	            } 
	        }
	    });
		this.deleteCircle();
		layer.startAnimation();
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setVisible(true);
	}

	
	public void deleteCircle() {
		layer.deleteCircle();
	}
}

class Layer extends JPanel implements ActionListener{
    private ArrayList<Shape> shapes = new ArrayList<Shape>();
    private Timer timer = new Timer(40, this);
    public void setShapeCount(int count){
        for (int i = 0; i < count; i++) {
            Shape shape = new Circle();
            shapes.add(shape);
        }
        
    }
    
    public void addShape() {
    	Shape shape = new Circle();
    	shapes.add(shape);
    }
    
    @Override
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      for (Shape shape: shapes){
          shape.draw(g);
      }
      
  }

    public void startAnimation(){
    		timer.start();
    }
    
    public void actionPerformed(ActionEvent e){
    	for (Shape shape : shapes){
            shape.move(this);
        }
        repaint();
    }
    
    public void deleteTriangle() {
    	int i = 0;
    	while (i < shapes.size()) {
    		if (shapes.get(i) instanceof Triangle) {
    			shapes.remove(i);
    		} else i++;
    	}
    }
    
    public void deleteCircle() {
    	int i = 0;
    	while (i < shapes.size()) {
    		if (shapes.get(i) instanceof Circle) {
    			shapes.remove(i);
    		} else i++;
    	}
    }
    
}

class Shape{
	protected int x;
    protected int y;
    protected int xDelta;
    protected int yDelta;
    protected Random rd;
    protected Color randomColor;
    
    private void Random() {
    	rd = new Random();
    	x = rd.nextInt(595);
    	y = rd.nextInt(595);
    	xDelta = rd.nextInt(5)+1;
    	yDelta = rd.nextInt(5)+1;
    	int red = rd.nextInt(256);
		int green = rd.nextInt(256);
		int blue = rd.nextInt(256);
		randomColor = new Color(red,green,blue);
    }
    
	public Shape() {
		Random();
	}
	
	public Shape(boolean bool) {
		if (bool = true) Random();
	}
	
	public void move(JPanel jpanel) {};
	public void draw(Graphics g) {};
	
}

class Circle  extends Shape{
	protected int radius;
	
	public Circle() {
		radius = rd.nextInt(50);
	}
	
	@Override
	public void move(JPanel jpanel) {
		x += xDelta;
		y += yDelta;
		if ( x + (radius *2) > jpanel.getWidth()) {
			x = (int) (jpanel.getWidth() - (radius *2));
			xDelta *= -1;
		} else if (x<0) {
			x = 0;
			xDelta *= -1;
		} else if (y + (radius *2) >jpanel.getHeight()) {
			y = (int) (jpanel.getHeight() - (radius *2));
			yDelta *= -1;
		} else if (y<0) {
			y = 0;
			yDelta *= -1;
		}
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(randomColor);
		g.fillOval(x, y, radius * 2, radius * 2);
	}
}

class Square extends Circle{
	@Override
	public void draw(Graphics g) {
		g.setColor(randomColor);
		g.fillRect(x, y, radius * 2, radius * 2);
	}
}

class Rectangle extends Shape{
	protected int weight;
	protected int height;
	
	public Rectangle(){
		weight = rd.nextInt(100)+20;
		height = rd.nextInt(100)+20;
	}
	
	@Override
	public void move(JPanel jpanel) {
		x += xDelta;
		y += yDelta;
		if ( x + weight > jpanel.getWidth()) {
			x = (int) (jpanel.getWidth() - weight);
			xDelta *= -1;
		} else if (x<0) {
			x = 0;
			xDelta *= -1;
		} else if (y + height >jpanel.getHeight()) {
			y = (int) (jpanel.getHeight() -height);
			yDelta *= -1;
		} else if (y<0) {
			y = 0;
			yDelta *= -1;
		}
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(randomColor);
		g.fillRect(x, y, weight, height);
	}
}

class Triangle extends Shape{
	protected int xValues[]= {0,0,0};
	protected int yValues[]= {0,0,0};
	
	public Triangle() {
		xValues[0]=x; yValues[0]=y;
		xValues[1]=x+10; yValues[1]=y+20;
		xValues[2]=x+20; yValues[2]=y+10;
	};
	
	@Override
	public void move(JPanel jpanel) {
		x += xDelta;
		y += yDelta;
		if ( x +20 > jpanel.getWidth()) {
			x = (int) (jpanel.getWidth()-20);
			xDelta *= -1;
		} else if (x<0) {
			x = 0;
			xDelta *= -1;
		} else if (y +20>jpanel.getHeight()) {
			y = (int) (jpanel.getHeight()-20);
			yDelta *= -1;
		} else if (y<0) {
			y = 0;
			yDelta *= -1;
		}
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(randomColor);
		Polygon poly1 = new Polygon(xValues,yValues,3);
		g.fillPolygon(poly1);
	}
}
