import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class Province {
    public static final int MIN_POPULATION_DEFAULT = 30_000;
    public static final int MAX_POPULATION_DEFAULT = 15_000_000;
    private String name;
    private String capital;
    private long population;
    private static final long DEFAULT_POPULATION = 4_468_055;
    private static final String DEFAULT_PROVINCE = "British Columbia";
    private static final String DEFAULT_CAPITAL = "Victoria";


    private String[] provincelist = {"Ontario", "Quebec", "Nova Scotia", "New Brunswick", "Manitoba", "British Columbia", "Prince Edward Island", "Saskatchewan", "Alberta", "Newfoundland and Labrador"};
    private String[] capitallist = {"Toronto", "Quebec City", "Halifax", "Fredericton", "Winnipeg", "Victoria", "Charlottetown", "Regina", "Edmonton", "St. John's"};

    public Province(String name, String capital, long population) {
        if (isValidPopulation(population) && isValidProvince(name) && isValidCapitalCity(capital)) {

            this.name = name;
            this.capital = capital;
            this.population = population;

        } else {

            // if there is any error; create the default data, shown below
            this.population = DEFAULT_POPULATION; // 4,648,055
            this.name = DEFAULT_PROVINCE; // “British Columbia”
            this.capital = DEFAULT_CAPITAL; // “Victoria”
        }
    }

    private boolean isValidPopulation(long population) {
        if (population >= MIN_POPULATION_DEFAULT && population <= MAX_POPULATION_DEFAULT){
            return true;
        } else
            return false;
        }

    private boolean isValidProvince(String name) {
        for (int i = 0; i < provincelist.length; i++) {
            if (name == provincelist[i]){
                return true;
            }
        }
        return false;
    }
        private boolean isValidCapitalCity(String capital) {
            for (int i = 0; i < capitallist.length; i++) {
                if (capital == capitallist[i]) {
                    return true;
                }
            }
            return false;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public String[] getProvincelist() {
        return provincelist;
    }

    public void setProvincelist(String[] provincelist) {
        this.provincelist = provincelist;
    }

    public String[] getCapitallist() {
        return capitallist;
    }

    public void setCapitallist(String[] capitallist) {
        this.capitallist = capitallist;
    }

    public String getDetails() { return "The capital of " + getName() + " (population. " + getPopulation() + ") is " + getCapital() + ".";}

}
