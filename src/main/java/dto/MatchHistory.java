package dto;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MatchHistory {
    private int id;

    private Date date;

    private String map;

    private Map<String, Player> players = new HashMap<String, Player>();
}
