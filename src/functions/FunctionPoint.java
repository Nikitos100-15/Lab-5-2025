package functions;

import java.io.Serializable;

public class FunctionPoint implements Serializable {

    private static final long serialVersionUID = 1L;
    // поле нашего класса
    private double x;
    private double y;
    // конструктор, который создаёт объект с двумя точками координат
    public  FunctionPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    // конструктор, который создаёт объект с двумя нулевыми точками
    public FunctionPoint() {
        this.x = 0;
        this.y = 0;
    }
    // конструктор, который создает объект с двумя точно такими же точками(т.е. копии какой-либо другой точкой)
    public FunctionPoint(FunctionPoint point) {
        this.x = point.x;
        this.y = point.y;

    }
    // геттер получение переменной X
    public double getX(){
        return x;
    }
    // геттер полечения переменной Y
    public  double getY(){
        return y;
    }
    // сеттеры для переменных x и y
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    // 5 лаболаторная
    // 1 задание переопределение методов
    public String toString() {
        return "(" + x +"," + y +")"; // возвращает текстовое описание точки
    }
    public boolean equals(Object o) {
        // проверяем, чтобы не был передан null
        if (o == null) return false;
        // приводим Object к FunctionPoint
        FunctionPoint var = (FunctionPoint) o;
        double epsilon = 1e-10;
        return Math.abs(x - var.x) < epsilon && Math.abs(y - var.y) < epsilon;}
    public int hashCode() {
        // приводим в 64-битное представление
        long x_dbits = Double.doubleToLongBits(x);
        long y_dbits= Double.doubleToLongBits(y);

        int  x_hash= (int)(x_dbits ^ (x_dbits >>> 32));
        int y_hash = (int)(y_dbits ^ (y_dbits >>> 32));
        //  с помощью ^ смешивает по 32 бита с каждого элемента
        return x_hash ^ y_hash; }
    // метод clone():
    public Object clone() throws CloneNotSupportedException {
        // возвращаем объект-копию для объекта точки
        return super.clone();
    }
    }

