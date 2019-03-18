package common;

public enum City {
    NewYork("New York"),
    Boston("Boston"),
    Paris("Paris"),
    Rome("Rome"),
    Berlin("Berlin"),
    Portland("Portland"),
    MexicoCity("Mexico City"),
    Philadelphia("Philadelphia"),
    SanDiego("San Diego"),
    SãoPaolo("São Paolo"),
    BuenosAires("Buenos Aires"),
    London("London"),
    Dublin("Dublin"),
    Cairo("Cairo");


    private String fullName;

    City(String fullName){
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public static City fromString(String fullName) {
        for (City city : City.values()) {
            if (city.fullName.equalsIgnoreCase(fullName)) {
                return city;
            }
        }
        return null;
    }
}

