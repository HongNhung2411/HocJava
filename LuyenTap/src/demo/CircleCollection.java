package demo;

import java.util.ArrayList;

/**
 * Created by FPT on 6/26/2019 at 4:45 PM.
 */
public class CircleCollection {
    private ArrayList<Circle> listCircle;

    public CircleCollection() {
    }

    public ArrayList<Circle> getListCircle() {
        return listCircle;
    }

    public void setListCircle(ArrayList<Circle> listCircle) {
        this.listCircle = listCircle;
    }

    public CircleCollection(ArrayList<Circle> listCircle) {
        this.listCircle = listCircle;
    }

    public void addCircle(Circle x) {
        listCircle.add(x);
    }

    public int getSize() {
        return listCircle.size();

    }

    public Circle getCircle(int x) {
        if (x >= listCircle.size()) {
            return null;
        }
        return listCircle.get(x);
    }

    public void setCircle(int x, Circle c1) {
        if (x <= listCircle.size()) {
            listCircle.set(x, c1);
        } else {
            System.out.println("Vi tri qua lon!");
        }
    }

    public String toString() {

        String x = "";
        for (int i = 0; i < listCircle.size(); i++) {
            x += "Hinh tron thu " + (i + 1) + " co ban kinh la: " + listCircle.get(i).getRadius() +"\n";
        }

        return x;

    }

    public double sumS() {
        double tong = 0.0;
        for (int i = 0; i < listCircle.size(); i++) {
            tong += listCircle.get(i).getArea();
        }
        return tong;
    }

    public double getMaxS() {
        double maxS = listCircle.get(0).getArea();
        for (int i = 1; i < listCircle.size(); i++) {
            if (listCircle.get(i).getArea() > maxS) {
                maxS = listCircle.get(i).getArea();
            }
        }
        return maxS;
    }

    public double getMinS() {
        double minS = listCircle.get(0).getArea();
        for (int i = 1; i < listCircle.size(); i++) {
            if (listCircle.get(i).getArea() < minS) {
                minS = listCircle.get(i).getArea();
            }
        }
        return minS;
    }

}
