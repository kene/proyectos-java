package mx.com.weather.stack.models;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Current {

    @SerializedName("observation_time")
    @Expose
    private String observationTime;
    @SerializedName("temperature")
    @Expose
    private Integer temperature;
    @SerializedName("weather_code")
    @Expose
    private Integer weatherCode;
    @SerializedName("weather_icons")
    @Expose
    private List<String> weatherIcons = new ArrayList<String>();
    @SerializedName("weather_descriptions")
    @Expose
    private List<String> weatherDescriptions = new ArrayList<String>();
    @SerializedName("wind_speed")
    @Expose
    private Integer windSpeed;
    @SerializedName("wind_degree")
    @Expose
    private Integer windDegree;
    @SerializedName("wind_dir")
    @Expose
    private String windDir;
    @SerializedName("pressure")
    @Expose
    private Integer pressure;
    @SerializedName("precip")
    @Expose
    private Integer precip;
    @SerializedName("humidity")
    @Expose
    private Integer humidity;
    @SerializedName("cloudcover")
    @Expose
    private Integer cloudcover;
    @SerializedName("feelslike")
    @Expose
    private Integer feelslike;
    @SerializedName("uv_index")
    @Expose
    private Integer uvIndex;
    @SerializedName("visibility")
    @Expose
    private Integer visibility;
    @SerializedName("is_day")
    @Expose
    private String isDay;

    public String getObservationTime() {
        return observationTime;
    }

    public void setObservationTime(String observationTime) {
        this.observationTime = observationTime;
    }

    public Current withObservationTime(String observationTime) {
        this.observationTime = observationTime;
        return this;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public Current withTemperature(Integer temperature) {
        this.temperature = temperature;
        return this;
    }

    public Integer getWeatherCode() {
        return weatherCode;
    }

    public void setWeatherCode(Integer weatherCode) {
        this.weatherCode = weatherCode;
    }

    public Current withWeatherCode(Integer weatherCode) {
        this.weatherCode = weatherCode;
        return this;
    }

    public List<String> getWeatherIcons() {
        return weatherIcons;
    }

    public void setWeatherIcons(List<String> weatherIcons) {
        this.weatherIcons = weatherIcons;
    }

    public Current withWeatherIcons(List<String> weatherIcons) {
        this.weatherIcons = weatherIcons;
        return this;
    }

    public List<String> getWeatherDescriptions() {
        return weatherDescriptions;
    }

    public void setWeatherDescriptions(List<String> weatherDescriptions) {
        this.weatherDescriptions = weatherDescriptions;
    }

    public Current withWeatherDescriptions(List<String> weatherDescriptions) {
        this.weatherDescriptions = weatherDescriptions;
        return this;
    }

    public Integer getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Integer windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Current withWindSpeed(Integer windSpeed) {
        this.windSpeed = windSpeed;
        return this;
    }

    public Integer getWindDegree() {
        return windDegree;
    }

    public void setWindDegree(Integer windDegree) {
        this.windDegree = windDegree;
    }

    public Current withWindDegree(Integer windDegree) {
        this.windDegree = windDegree;
        return this;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public Current withWindDir(String windDir) {
        this.windDir = windDir;
        return this;
    }

    public Integer getPressure() {
        return pressure;
    }

    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    public Current withPressure(Integer pressure) {
        this.pressure = pressure;
        return this;
    }

    public Integer getPrecip() {
        return precip;
    }

    public void setPrecip(Integer precip) {
        this.precip = precip;
    }

    public Current withPrecip(Integer precip) {
        this.precip = precip;
        return this;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Current withHumidity(Integer humidity) {
        this.humidity = humidity;
        return this;
    }

    public Integer getCloudcover() {
        return cloudcover;
    }

    public void setCloudcover(Integer cloudcover) {
        this.cloudcover = cloudcover;
    }

    public Current withCloudcover(Integer cloudcover) {
        this.cloudcover = cloudcover;
        return this;
    }

    public Integer getFeelslike() {
        return feelslike;
    }

    public void setFeelslike(Integer feelslike) {
        this.feelslike = feelslike;
    }

    public Current withFeelslike(Integer feelslike) {
        this.feelslike = feelslike;
        return this;
    }

    public Integer getUvIndex() {
        return uvIndex;
    }

    public void setUvIndex(Integer uvIndex) {
        this.uvIndex = uvIndex;
    }

    public Current withUvIndex(Integer uvIndex) {
        this.uvIndex = uvIndex;
        return this;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    public Current withVisibility(Integer visibility) {
        this.visibility = visibility;
        return this;
    }

    public String getIsDay() {
        return isDay;
    }

    public void setIsDay(String isDay) {
        this.isDay = isDay;
    }

    public Current withIsDay(String isDay) {
        this.isDay = isDay;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Current.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("observationTime");
        sb.append('=');
        sb.append(((this.observationTime == null)?"<null>":this.observationTime));
        sb.append(',');
        sb.append("temperature");
        sb.append('=');
        sb.append(((this.temperature == null)?"<null>":this.temperature));
        sb.append(',');
        sb.append("weatherCode");
        sb.append('=');
        sb.append(((this.weatherCode == null)?"<null>":this.weatherCode));
        sb.append(',');
        sb.append("weatherIcons");
        sb.append('=');
        sb.append(((this.weatherIcons == null)?"<null>":this.weatherIcons));
        sb.append(',');
        sb.append("weatherDescriptions");
        sb.append('=');
        sb.append(((this.weatherDescriptions == null)?"<null>":this.weatherDescriptions));
        sb.append(',');
        sb.append("windSpeed");
        sb.append('=');
        sb.append(((this.windSpeed == null)?"<null>":this.windSpeed));
        sb.append(',');
        sb.append("windDegree");
        sb.append('=');
        sb.append(((this.windDegree == null)?"<null>":this.windDegree));
        sb.append(',');
        sb.append("windDir");
        sb.append('=');
        sb.append(((this.windDir == null)?"<null>":this.windDir));
        sb.append(',');
        sb.append("pressure");
        sb.append('=');
        sb.append(((this.pressure == null)?"<null>":this.pressure));
        sb.append(',');
        sb.append("precip");
        sb.append('=');
        sb.append(((this.precip == null)?"<null>":this.precip));
        sb.append(',');
        sb.append("humidity");
        sb.append('=');
        sb.append(((this.humidity == null)?"<null>":this.humidity));
        sb.append(',');
        sb.append("cloudcover");
        sb.append('=');
        sb.append(((this.cloudcover == null)?"<null>":this.cloudcover));
        sb.append(',');
        sb.append("feelslike");
        sb.append('=');
        sb.append(((this.feelslike == null)?"<null>":this.feelslike));
        sb.append(',');
        sb.append("uvIndex");
        sb.append('=');
        sb.append(((this.uvIndex == null)?"<null>":this.uvIndex));
        sb.append(',');
        sb.append("visibility");
        sb.append('=');
        sb.append(((this.visibility == null)?"<null>":this.visibility));
        sb.append(',');
        sb.append("isDay");
        sb.append('=');
        sb.append(((this.isDay == null)?"<null>":this.isDay));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.visibility == null)? 0 :this.visibility.hashCode()));
        result = ((result* 31)+((this.weatherCode == null)? 0 :this.weatherCode.hashCode()));
        result = ((result* 31)+((this.feelslike == null)? 0 :this.feelslike.hashCode()));
        result = ((result* 31)+((this.observationTime == null)? 0 :this.observationTime.hashCode()));
        result = ((result* 31)+((this.windDir == null)? 0 :this.windDir.hashCode()));
        result = ((result* 31)+((this.pressure == null)? 0 :this.pressure.hashCode()));
        result = ((result* 31)+((this.isDay == null)? 0 :this.isDay.hashCode()));
        result = ((result* 31)+((this.cloudcover == null)? 0 :this.cloudcover.hashCode()));
        result = ((result* 31)+((this.weatherDescriptions == null)? 0 :this.weatherDescriptions.hashCode()));
        result = ((result* 31)+((this.precip == null)? 0 :this.precip.hashCode()));
        result = ((result* 31)+((this.weatherIcons == null)? 0 :this.weatherIcons.hashCode()));
        result = ((result* 31)+((this.temperature == null)? 0 :this.temperature.hashCode()));
        result = ((result* 31)+((this.humidity == null)? 0 :this.humidity.hashCode()));
        result = ((result* 31)+((this.windDegree == null)? 0 :this.windDegree.hashCode()));
        result = ((result* 31)+((this.windSpeed == null)? 0 :this.windSpeed.hashCode()));
        result = ((result* 31)+((this.uvIndex == null)? 0 :this.uvIndex.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Current) == false) {
            return false;
        }
        Current rhs = ((Current) other);
        return (((((((((((((((((this.visibility == rhs.visibility)||((this.visibility!= null)&&this.visibility.equals(rhs.visibility)))&&((this.weatherCode == rhs.weatherCode)||((this.weatherCode!= null)&&this.weatherCode.equals(rhs.weatherCode))))&&((this.feelslike == rhs.feelslike)||((this.feelslike!= null)&&this.feelslike.equals(rhs.feelslike))))&&((this.observationTime == rhs.observationTime)||((this.observationTime!= null)&&this.observationTime.equals(rhs.observationTime))))&&((this.windDir == rhs.windDir)||((this.windDir!= null)&&this.windDir.equals(rhs.windDir))))&&((this.pressure == rhs.pressure)||((this.pressure!= null)&&this.pressure.equals(rhs.pressure))))&&((this.isDay == rhs.isDay)||((this.isDay!= null)&&this.isDay.equals(rhs.isDay))))&&((this.cloudcover == rhs.cloudcover)||((this.cloudcover!= null)&&this.cloudcover.equals(rhs.cloudcover))))&&((this.weatherDescriptions == rhs.weatherDescriptions)||((this.weatherDescriptions!= null)&&this.weatherDescriptions.equals(rhs.weatherDescriptions))))&&((this.precip == rhs.precip)||((this.precip!= null)&&this.precip.equals(rhs.precip))))&&((this.weatherIcons == rhs.weatherIcons)||((this.weatherIcons!= null)&&this.weatherIcons.equals(rhs.weatherIcons))))&&((this.temperature == rhs.temperature)||((this.temperature!= null)&&this.temperature.equals(rhs.temperature))))&&((this.humidity == rhs.humidity)||((this.humidity!= null)&&this.humidity.equals(rhs.humidity))))&&((this.windDegree == rhs.windDegree)||((this.windDegree!= null)&&this.windDegree.equals(rhs.windDegree))))&&((this.windSpeed == rhs.windSpeed)||((this.windSpeed!= null)&&this.windSpeed.equals(rhs.windSpeed))))&&((this.uvIndex == rhs.uvIndex)||((this.uvIndex!= null)&&this.uvIndex.equals(rhs.uvIndex))));
    }

}
