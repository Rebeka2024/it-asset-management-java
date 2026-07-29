import java.util.ArrayList;


public class AssetManager {


    private ArrayList<Asset> assets;


    public AssetManager() {

        assets = new ArrayList<>();

    }


    public void addAsset(Asset asset) {

        assets.add(asset);

    }


    public void displayAssets() {


        if(assets.isEmpty()) {

            System.out.println("No assets available.");

            return;

        }


        for(Asset asset : assets) {

            asset.displayAsset();

        }

    }



    public void assignAsset(int id, String employee) {


        for(Asset asset : assets) {


            if(asset.getAssetId() == id) {

                asset.assignEmployee(employee);

                System.out.println(
                    "Asset assigned successfully."
                );

                return;

            }

        }


        System.out.println("Asset not found.");

    }

}
