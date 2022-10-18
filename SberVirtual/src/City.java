public class City {
    private String name;
    private String region;
    private String district;
    private String population;
    private String foundation;
    public City(String name, String region, String district, String population, String foundation) {
        this.name = name;
        this.region = region;
        this.district = district;
        this.population = population;
        this.foundation = foundation;
    }
    public void Output() {
        System.out.println(City.class.getName() + " { name=" + name +  ", region=" + region + ", district="  + district + ", population=" + population + ", foundation=" + foundation + " }");
    }
}
