package pets;


public class Country {
    private String name;
    private long population;
    private String capitol;

    public Country(){
    }

    public Country(String name, long population){
    }

    public Country(String name, long population, String capitol){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public String getCapitol() {
        return capitol;
    }

    public void setCapitol(String capitol) {
        this.capitol = capitol;
    }

    public boolean containsHumans(){
        return true;
    }

    public String createACountrySong(String opening, String middle, String closing){
        return opening + middle + closing;
    }
}
