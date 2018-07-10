package pl.akademiakodu.AK_Spring_ExerciseMethod_BasicCalculatorTODO.models;

public class Person {

    private String imieF;
    private String nazwiskoF;

    public Person(String imieF, String nazwiskoF) {
        this.imieF = imieF;
        this.nazwiskoF = nazwiskoF;
    }

    public String getImieF() {
        return imieF;
    }

    public void setImieF(String imieF) {
        this.imieF = imieF;
    }

    public String getNazwiskoF() {
        return nazwiskoF;
    }

    public void setNazwiskoF(String nazwiskoF) {
        this.nazwiskoF = nazwiskoF;
    }

    @Override
    public String toString() {
        return imieF+"  "+nazwiskoF+" !@! ";
    }
}
