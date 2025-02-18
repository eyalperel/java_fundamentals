package labs_examples.objects_classes_methods.labs.objects;

public class Door {
    private Boolean isEmergency;
    private Boolean isClosed;

    public Door () {
        this.isEmergency = false;
        this.isClosed = false;
    }

    public String toString() {
        return "Properties of door:\n" + "Emergency door: " + this.isEmergency + "\n" + "Closed Door: " + this.isClosed;
    }

    public void setClosed(Boolean closed) {
        isClosed = closed;
    }

    public Boolean getClosed() {
        return isClosed;
    }

    public void setEmergency(Boolean emergency) {
        isEmergency = emergency;
    }

    public Boolean getEmergency() {
        return isEmergency;
    }
}
