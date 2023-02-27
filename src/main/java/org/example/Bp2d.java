package org.example;

class Bp2d implements Cloneable {
    private float x;
    private float y;

    public Bp2d(float x, float y) {
        this.x = x;
        this.y = y;

    }

    public boolean equals(Object ob2) {
        if (ob2 == this) return true;
        if (!(ob2 instanceof Bp2d)) {
            return false;
        }
        Bp2d emp = (Bp2d) ob2;
        return emp.x == (this.x) && emp.y == this.y;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
