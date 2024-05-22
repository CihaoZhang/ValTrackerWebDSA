package dto;

import net.socketconnection.jva.ValorantAPI;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AgentManager implements AgentRepository {
    ValorantAPI api = new ValorantAPI();

    private List<Agent> agents;

    public AgentManager() throws IOException {
        this.agents = new ArrayList<>();
    }

    @Override
    public void addAgent(Agent agent) {
        agents.add(agent);
    }

    @Override
    public void removeAgent(Agent agent) {
        agents.remove(agent);
    }

    @Override
    public void updateAgent(Agent agent) {
        int index = agents.indexOf(agent);
        if (index != -1) {
            agents.set(index, agent);
        }
    }

    @Override
    public Agent getAgent(String name) {
        for (Agent agent : agents) {
            if (agent.getName().equals(name)) {
                return agent;
            }
        }
        return null;
    }

    @Override
    public Agent[] getAgents() {
        return agents.toArray(new Agent[0]);
    }

    @Override
    public int getAgentCount() {
        return agents.size();
    }

    @Override
    public void clearAgents() {
        agents.clear();
    }

    @Override
    public void clearAgentsExcept(Agent agent) {
        agents.removeIf(a -> !a.equals(agent));
    }

    @Override
    public void clearAgentsExcept(String name) {
        agents.removeIf(a -> !a.getName().equals(name));
    }

    @Override
    public void clearAgentsExcept(String[] names) {
        agents.removeIf(a -> !containsName(a.getName(), names));
    }

    private boolean containsName(String name, String[] names) {
        for (String n : names) {
            if (n.equals(name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void searchAgents(String agentName) {
        System.out.println("Searching for agents with name: " + agentName);
        for (Agent agent : agents) {
            if (agent.getName().contains(agentName)) {
                System.out.println(agent);
            }
        }
    }

    @Override
    public void searchAgents(String agentName, String agentType) {
        System.out.println("Searching for agents with name: " + agentName + " and type: " + agentType);
        for (Agent agent : agents) {
            if (agent.getName().contains(agentName) && agent.getRole().equals(agentType)) {
                System.out.println(agent);
            }
        }
    }

    @Override
    public void displayAgents() {
        System.out.println("Displaying all agents:");
        for (Agent agent : agents) {
            System.out.println(agent);
        }
    }

    @Override
    public void displayAgents(String agentType) {
        System.out.println("Displaying agents with type: " + agentType);
        for (Agent agent : agents) {
            if (agent.getRole().equals(agentType)) {
                System.out.println(agent);
            }
        }
    }

    @Override
    public void getAgentsFromApi(String url) {

    }

    @Override
    public void getAgentsFromFile(File file) {
        // Implement the logic to read agents from a file
    }

    @Override
    public void getAgentsFromFile(File file, String agentName) {
        // Implement the logic to read agents from a file and filter by name
    }


}
