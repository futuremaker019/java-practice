public class VO {

    private String startDate;
    private String endDate;
    private String closeDate;

    public VO() {
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getCloseDate() {
        return closeDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setCloseDate(String closeDate) {
        this.closeDate = closeDate;
    }

    @Override
    public String toString() {
        return "VO{" +
                "startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", closeDate='" + closeDate + '\'' +
                '}';
    }
}
