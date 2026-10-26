class MainPen{
    public static void main(String[] args) {
        Pen p = new Pen();

        System.out.println(p.color);
        p.color = "Red";
        System.out.println(p.height);

        p.height = 10.5;
        p.weight = 5.3;
        p.brand = "Ten";
        p.price = 85.00;
        p.madein = "SriLanka";
        p.Write();
    }
}