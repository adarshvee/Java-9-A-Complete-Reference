

package chapter14;

/**
 *This class demonstrates the use of bound wildcards. Creates classes for coordinates
 * in various dimensions that form a class hierarchy, and methods to display the
 * coordinates
 * @author Adarsh V
 */

class TwoD {
    int x;
    int y;
    
    TwoD(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class ThreeD extends TwoD {
    int z;
    ThreeD(int x, int y, int z) {
        super(x,y);
        this.z = z;
    }
}

class FourD extends ThreeD {
    int t;
    FourD(int x, int y, int z, int t) {
        super(x,y,z);
        this.t = t;
    }
}

class Coordinates<T extends TwoD> {
    T[] coordinates;
    
    Coordinates(T[] o) {
        coordinates = o;
    }
}
public class BoundedWildCardsDemo {
    static void showTwoCoordinates(Coordinates<? extends TwoD> coords){
        for (int i = 0; i < coords.coordinates.length ; i++) {
            System.out.println("X : " + coords.coordinates[i].x + " Y " + coords.coordinates[i].y);
        }
    }
    
    static void showThreeCoordinates(Coordinates<? extends ThreeD> coords){
        for (int i = 0; i < coords.coordinates.length ; i++) {
            System.out.println("X : " + coords.coordinates[i].x + " Y " + coords.coordinates[i].y + " Z " + coords.coordinates[i].z);
        }
    }
    
    static void showFourCoordinates(Coordinates<? extends FourD> coords){
        for (int i = 0; i < coords.coordinates.length ; i++) {
            System.out.println("X : " + coords.coordinates[i].x + " Y " + 
                    coords.coordinates[i].y + " Z " + coords.coordinates[i].z
            + " t " + coords.coordinates[i].t);
        }
    }
    
    public static void main(String[] args) {
        TwoD t2d[] = {new TwoD(1,2), new TwoD(2,3), new TwoD(4,5)};
        
        ThreeD t3d[] = {new ThreeD(1, 2, 4), new ThreeD(2,3, 5), new ThreeD(4,5, 1)};
        
        FourD t4d[] = {new FourD(1,2, 1,2), new FourD(2,3, 1,2), new FourD(4,5, 1,2)};
        
        Coordinates<TwoD> c2d = new Coordinates<TwoD>(t2d);
        Coordinates<ThreeD> c3d = new Coordinates<ThreeD>(t3d);
        Coordinates<FourD> c4d = new Coordinates<FourD>(t4d);
        
        showTwoCoordinates(c2d);
        showTwoCoordinates(c3d);
        showTwoCoordinates(c4d);
        
        showThreeCoordinates(c3d);
        showThreeCoordinates(c4d);
        
        showFourCoordinates(c4d);
        
    }
}
