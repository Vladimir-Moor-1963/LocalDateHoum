import java.time.LocalDateTime;
import java.util.Objects;

public class Packtage {

    private String departureCity;
    private String receiptOfCiti;
    private Double weightParcel;
    private LocalDateTime departureTime;

    public Packtage(String departureCity, String receiptOfCiti, Double weightParcel, LocalDateTime departureTime) {
        this.departureCity = departureCity;
        this.receiptOfCiti = receiptOfCiti;
        this.weightParcel = weightParcel;
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        return "Packtage{" +
                "departureCity='" + departureCity + '\'' +
                ", receiptOfCiti='" + receiptOfCiti + '\'' +
                ", weightParcel=" + weightParcel +
                ", departureTime=" + departureTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Packtage packtage = (Packtage) o;
        return Objects.equals(departureCity, packtage.departureCity) && Objects.equals(receiptOfCiti, packtage.receiptOfCiti) && Objects.equals(weightParcel, packtage.weightParcel) && Objects.equals(departureTime, packtage.departureTime);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(departureCity);
        result = 31 * result + Objects.hashCode(receiptOfCiti);
        result = 31 * result + Objects.hashCode(weightParcel);
        result = 31 * result + Objects.hashCode(departureTime);
        return result;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getReceiptOfCiti() {
        return receiptOfCiti;
    }

    public void setReceiptOfCiti(String receiptOfCiti) {
        this.receiptOfCiti = receiptOfCiti;
    }

    public Double getWeightParcel() {
        return weightParcel;
    }

    public void setWeightParcel(Double weightParcel) {
        this.weightParcel = weightParcel;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }
}
