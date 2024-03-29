package ke_thua.thuc_hanh;

import bai_tap_1.Resizeable;

public class Rectangle extends Shape implements Resizeable {
        private double width=1.0;
        private double  length=1.0;
        public Rectangle(){ }
        public Rectangle(double width,double length){
                this.width=width;
                this.length=length;
        }
        public Rectangle(double width,double length,String collor,boolean filled){
                super(collor,filled);
                this.width=width;
                this.length=length;
        }

        public double getWidth() {
                return width;
        }

        public double getLength() {
                return length;
        }

        public void setWidth(double width) {
                this.width = width;
        }

        public void setLength(double length) {
                this.length = length;
        }
        public double getArea(){
                return width*length;
        }
        public double getPerimeter(){
                return 2*(width*length);
        }

        @Override
        public String toString() {
                return "A Rectangle with width="+getWidth()+"and length="
                        +getLength()
                        +", which is subclass of "
                        +super.toString();
        }

        @Override
        public void resize(double percent) {
               this.width*=percent;
               this.length*=percent;

        }
}

