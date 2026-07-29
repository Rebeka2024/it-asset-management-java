public class Asset {

    private int assetId;
    private String deviceName;
    private String type;
    private String assignedEmployee;
    private String status;


    public Asset(int assetId, String deviceName, String type) {

        this.assetId = assetId;
        this.deviceName = deviceName;
        this.type = type;
        this.assignedEmployee = "Unassigned";
        this.status = "Available";

    }


    public void assignEmployee(String employee) {

        this.assignedEmployee = employee;
        this.status = "Assigned";

    }


    public int getAssetId() {

        return assetId;

    }


    public String getDeviceName() {

        return deviceName;

    }


    public void displayAsset() {

        System.out.println(
            "ID: " + assetId +
            " | Device: " + deviceName +
            " | Type: " + type +
            " | Employee: " + assignedEmployee +
            " | Status: " + status
        );

    }

}
