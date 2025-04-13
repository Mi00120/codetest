package codetest;



public class phoneDemoCapsule {
    public static void main(String[] args) {
        Phone myPhone = new Phone();
        myPhone.setModel("Galaxy S8");
        myPhone.setValue(100);
        myPhone.print();

        Phone yourPhone = new Phone();
        yourPhone.setModel("S6");
        yourPhone.setValue(20);
        yourPhone.print();
    }
}
class Phone {
    private String model;
    private int value;

    int getValue() {
        return value;
    }

    String getModel() {
        return model;
    }

    public void setModel(String m) {
        this.model = m;
    }

    public void setValue(int v) {
        this.value = v;
    }

    void print() {
        System.out.println(this.value + " 만원 짜리 " + this.model + " 스마트폰");
    }
}