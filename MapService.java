public class MapService {

   
    public MapData fetchMapData(String location) {
        
        MapData mapData = externalMapAPI.getMapData(location);
        return mapData;
    }

    public ProcessedMapData processMapData(MapData mapData) {
       
        ProcessedMapData processedData = new ProcessedMapData();
        
        return processedData;
    }
}
