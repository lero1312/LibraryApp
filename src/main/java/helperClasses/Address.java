package helperClasses;

public class Address {

    private String city, area;
    private int streetNo, building ,floor, apartmentNo, landline;

    public Address(String city, String area, int streetNo, int building, int floor, int apartmentNo, int landline) {
        this.city = city;
        this.area = area;
        this.streetNo = streetNo;
        this.building = building;
        this.floor = floor;
        this.apartmentNo = apartmentNo;
        this.landline = landline;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(int streetNo) {
        this.streetNo = streetNo;
    }

    public int getBuilding() {
        return building;
    }

    public void setBuilding(int building) {
        this.building = building;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getApartmentNo() {
        return apartmentNo;
    }

    public void setApartmentNo(int apartmentNo) {
        this.apartmentNo = apartmentNo;
    }

    public int getLandline() {
        return landline;
    }

    public void setLandline(int landline) {
        this.landline = landline;
    }
}
