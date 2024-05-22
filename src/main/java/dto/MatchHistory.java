package dto;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MatchHistory {
    private int id;

    private Date date;

    private String map;

    private Map<String, Player> players = new HashMap<String, Player>();

    public MatchHistory(int id, Date date, String map) {
        this.id = id;
        this.date = date;
        this.map = map;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }




}
