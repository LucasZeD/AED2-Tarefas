class Lixao {
    public static void main (String[] args){
        //
        Ponto p1 = new Ponto(4,3);
        Ponto p2 = new Ponto(8,5);
        Ponto p3 = new Ponto(9.2,10);
        //
        System.out.println("p1 e p2: "		+ p1.dist(p2));
        System.out.println("p1 e (5,2): "	+ p1.dist(5,2));
        System.out.println("(4,3) e (5,2): "	+ Ponto.dist(4,3,5,2));
        System.out.println("triangulo:"		+ Ponto.isTriangulo(p1,p2,p3));
        //
        System.out.println("retangulo:"		+ p1.getAreaRetangulo(p2));
        System.out.println("ID P1: "		+ p1.getID());
        System.out.println("ID P2: "		+ p2.getID());
        System.out.println("ID P3: "		+ p3.getID());
        //
        System.out.println("Next ID: "		+ Ponto.getNextID());
    }
}
