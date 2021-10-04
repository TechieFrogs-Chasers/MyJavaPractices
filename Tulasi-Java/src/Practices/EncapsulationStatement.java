package Practices;

public class EncapsulationStatement {


    private class Measurement {

        private double width;
        private double height;
        private double screenSize;
        private int maxVolume;
        private boolean power;

        public double getWidth() {
            return width=10;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getHeight() {
            return height=11.5;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double getScreenSize() {
            return screenSize=10.2;
        }

        public void setScreenSize(double screenSize) {
            this.screenSize = screenSize;
        }

        public int getMaxVolume() {
            return maxVolume=10;
        }

        public void setMaxVolume(int maxVolume) {
            this.maxVolume = maxVolume;
        }

        public boolean getPower() {
            return power=false;
        }

        public void setPower(boolean power) {
            this.power = power;
        }
    }


    public static void main(String[] args) {
        EncapsulationStatement settterObj = new EncapsulationStatement();
        EncapsulationStatement.Measurement setObj = settterObj.new Measurement();

        setObj.setWidth(6);
        setObj.setHeight(7);
        setObj.setMaxVolume(9);
        setObj.setScreenSize(9);
        setObj.setPower(true);
        setObj.getWidth();
        setObj.getHeight();
        setObj.getMaxVolume();
        setObj.getScreenSize();
        setObj.getPower();

        System.out.println("Width :" + setObj.getWidth() + "," + "Height :" + setObj.getHeight() + "," + "MaxVolume :" + setObj.getMaxVolume() + "," + "ScreenSize :" + setObj.getScreenSize() + "," + "Power :" + setObj.getPower());
        System.out.println(setObj.getWidth());
        System.out.println(setObj.getHeight());
        System.out.println(setObj.getMaxVolume());
        System.out.println(setObj.getScreenSize());
        System.out.println(setObj.getPower());


    }
}