class Retangulo {
	public double base;
	public double altura;

	public Retangulo() {
		base = 0;
		altura = 0;
	}

	public Retangulo(double base) {
		this.base = base;
		altura = 0;
	}

	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public double getArea()
		{ return (this.altura * this.base); }

	public double getPerimetro()
		{ return (this.altura * 2) + (this.base * 2); }

	public double getDiagonal()
		{ return Math.sqrt(Math.pow(this.altura, 2) + Math.pow(this.base, 2)); }
}
