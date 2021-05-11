import java.util.ArrayList;

public class Europe {

    private static Europe singleton;
    private ArrayList<Country> countries;

    private Europe() {
        countries = new ArrayList<>();
        countries.add(new Country("Frankrijk", "FR"));
        countries.add(new Country("Duitsland", "DE"));
        countries.add(new Country("Groot-Brittanie", "GB"));
        countries.add(new Country("Belgie", "BE"));
    }

    public static Europe getInstance(){
        if(singleton == null) singleton = new Europe();
        return singleton;
    }

    private Country getCountry(String countryCode) {

        for (Country country : countries) {

            if (country.getCountryCode().equals(countryCode)) {
                return country;
            }
        }

        return null;
    }

    public boolean isReverseChargeApplicable(String countryCode) {

        if (this.getCountry(countryCode) != null) {
            return true;
        }

        return false;
    }
    private class Country {

        private String name;
        private String countryCode;

        public Country (String name, String countryCode) {
            this.name = name;
            this.countryCode = countryCode;
        }

        public String getCountryCode () {
            return countryCode;
        }
    }
}