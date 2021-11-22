package ensim_tp.demo.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Forecast {
    private String insee;
    private int cp;
    private float latitude;
    private float longitude;
    private int day;
    private String datetime;
    private int wind10m;
    private int gust10m;
    private int dirwind10m;
    private float rr10;
    private float rr1;
    private int probarain;
    private int weather;
    private int tmin;
    private int tmax;
    private int sunHours;
    private float etp;
    private int probafrost;
    private int probafog;
    private int probawind70;
    private int probawind100;
    private int gustx;

    public Forecast(){

    }

    public String getInsee() {
        return insee;
    }

    public void setInsee(String insee) {
        this.insee = insee;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public int getWind10m() {
        return wind10m;
    }

    public void setWind10m(int wind10m) {
        this.wind10m = wind10m;
    }

    public int getGust10m() {
        return gust10m;
    }

    public void setGust10m(int gust10m) {
        this.gust10m = gust10m;
    }

    public int getDirwind10m() {
        return dirwind10m;
    }

    public void setDirwind10m(int dirwind10m) {
        this.dirwind10m = dirwind10m;
    }

    public float getRr10() {
        return rr10;
    }

    public void setRr10(float rr10) {
        this.rr10 = rr10;
    }

    public float getRr1() {
        return rr1;
    }

    public void setRr1(float rr1) {
        this.rr1 = rr1;
    }

    public int getProbarain() {
        return probarain;
    }

    public void setProbarain(int probarain) {
        this.probarain = probarain;
    }

    public int getWeather() {
        return weather;
    }

    public void setWeather(int weather) {
        this.weather = weather;
    }

    public int getTmin() {
        return tmin;
    }

    public void setTmin(int tmin) {
        this.tmin = tmin;
    }

    public int getTmax() {
        return tmax;
    }

    public void setTmax(int tmax) {
        this.tmax = tmax;
    }

    public int getSunHours() {
        return sunHours;
    }

    public void setSunHours(int sunHours) {
        this.sunHours = sunHours;
    }

    public float getEtp() {
        return etp;
    }

    public void setEtp(float etp) {
        this.etp = etp;
    }

    public int getProbafrost() {
        return probafrost;
    }

    public void setProbafrost(int probafrost) {
        this.probafrost = probafrost;
    }

    public int getProbafog() {
        return probafog;
    }

    public void setProbafog(int probafog) {
        this.probafog = probafog;
    }

    public int getProbawind70() {
        return probawind70;
    }

    public void setProbawind70(int probawind70) {
        this.probawind70 = probawind70;
    }

    public int getProbawind100() {
        return probawind100;
    }

    public void setProbawind100(int probawind100) {
        this.probawind100 = probawind100;
    }

    public int getGustx() {
        return gustx;
    }

    public void setGustx(int gustx) {
        this.gustx = gustx;
    }
}
