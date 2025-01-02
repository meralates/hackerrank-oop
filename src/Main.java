
//https://www.hackerrank.com/challenges/java-method-overriding-2-super-keyword/problem?isFullScreen=true
class BiCylce{
    String define_me(){
        return "a vehicle with pedals.";
    }
}
class MotorCylce extends BiCylce{
    String define_me(){
        return "a cycle with an engine.";
    }
    MotorCylce(){
        System.out.println("Hello I am motorcycle,I am"+define_me());
        String temp=super.define_me();
            System.out.println("My ancestor is a cycle who is "+temp);
    }
}
class Main {
    public static void main(String[] args) {
        MotorCylce M = new MotorCylce();
    }
}