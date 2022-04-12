class Box{
	
	private int width;
	private int height;
	private int depth;
	
	Box(int width,int height,int depth){
		this.width=width;
		this.height=height;
		this.depth=depth;
		
	}
	int getVolume(){
		return width*height*depth;
		
	}


	public static void main(String[] args){
		Box b=new Box(5,6,7);
		System.out.print("Volume of box is: "+b.getVolume());
	
	
	}	
	
	
	}