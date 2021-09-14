import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Data{
    private List<Station> stations = new ArrayList<>();

    public Data(List<Station> stations) {
        this.stations = stations;
    }

    public List<Station> getStations(){return stations;}

    public Station findStation(String id){
        return stations.stream().filter(c -> c.getId().equals(id)).collect(Collectors.toList()).get(0);
    }

    public int addStation(Station station){
        stations.add(station);
        return 0;
    }

    public void mergeStation(String id, int bikes, int docks) {
        for (Station s : stations) {
            System.out.println(s);
        }

    }



    public void showStations() { stations.forEach( station -> System.out.println(station.toString()));}
}