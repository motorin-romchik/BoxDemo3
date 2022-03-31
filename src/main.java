class Box {
    double width;
    double height;
    double depth;

    double volume(){
        return width * height * depth;
    }
    void SetDim (double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}
public class main {
    public static void main(String args[])
        throws java.io.IOException {
        Box mybox1 = new Box ();
        Box mybox2 = new Box ();
        double var;
        mybox1.SetDim(10,20,15);
        mybox2.SetDim(3,6,9);

        var = mybox1.volume();
        System.out.println("Volume = " + var);
        var = mybox2.volume();
        System.out.println("Volume = " + var);


    }
}
