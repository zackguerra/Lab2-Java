public class Canada {

    private Province[] provinces;

    public Canada(){
        provinces = new Province[10];
        provinces[0]= new Province("Alberta","Edmonton", 4_067_175);
        provinces[1]= new Province("British Columbia","Victoria", 4_648_055);
        provinces[2]= new Province("Manitoba","Winnipeg", 1_278_365);
        provinces[3]= new Province("New Brunswick","Fredericton", 747_101);
        provinces[4]= new Province("Newfoundland and Labrador","St. John's", 519_716);
        provinces[5]= new Province("Nova Scotia","Halifax", 971_395);
        provinces[6]= new Province("Ontario","Toronto", 13_448_494);
        provinces[7]= new Province("Prince Edward Island","Charlottetown", 142_907);
        provinces[8]= new Province("Quebec","Quebec city", 8_164_361);
        provinces[9]= new Province("Saskatchewan","Regina", 1_098_352);
    }
    public void displayAllProvinces() {
        for (int i = 0; i < provinces.length; i++) {
            System.out.println(provinces[i].getDetails());
        }
    }
    public int getNumOfProvincesBetween(int min, int max) {

        int counter = 0;
        min = min * 1_000_000;
        max = max * 1_000_000;

        for (int i = 0; i < provinces.length; i++) {
        if (provinces[i].getPopulation() >= min && provinces[i].getPopulation() <= max)
            counter++;
        }
        return counter;
    }
}