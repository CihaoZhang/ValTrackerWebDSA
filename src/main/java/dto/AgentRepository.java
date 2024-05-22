package dto;

import java.io.File;

public interface AgentRepository {

    void addAgent(Agent agent);

    void removeAgent(Agent agent);

    void updateAgent(Agent agent);

    Agent getAgent(String name);

    Agent[] getAgents();

    int getAgentCount();

    void clearAgents();

    void clearAgentsExcept(Agent agent);

    void clearAgentsExcept(String name);

    void clearAgentsExcept(String[] names);

    void searchAgents(String agentName);

    void searchAgents(String agentName, String agentType);

    void displayAgents();

    void displayAgents(String agentType);

    void getAgentsFromApi(String url);

    void getAgentsFromFile(File file);

    void getAgentsFromFile(File file, String agentName);
}
