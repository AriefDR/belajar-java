class Shape {
    int getCorner(){
        return 0;
    }
}

class Rectengle extends Shape {
    int getCorner(){
        super.getCorner();
        return 4;
    }

    int getParentCorner(){
        return super.getCorner();
    }
}