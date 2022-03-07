class Ponto {
	private double x;
	private double y;

	public static int id;
	public static int nextID = 0;
	
	public void setX(double x)
		{ this.x = x; }
	public double getX()
		{ return this.x; }

	public void setY(double y)
		{ this.y = y; }
	public double getY()
		{ return this.y; }

	public static int getID()
		{ return id; }
	public static int getNextID()
		{ return nextID; }

	public Ponto() {
		x = 0;
		y = 0;
		id = getNextID();
	}

	public Ponto(double x, double y) {
		this.x = x;
		this.y = y;
		id = getNextID();
	}

	public double dist(Ponto ponto) {
		return Math.sqrt(Math.pow(this.x - ponto.x, 2) + Math.pow(this.y - ponto.y, 2));
	}
	public double dist(double x, double y) {
		return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
	}
	public double getAreaRetangulo(Ponto ponto){
		return ((this.x - ponto.x) * (this.y - ponto.y));
	}
}
