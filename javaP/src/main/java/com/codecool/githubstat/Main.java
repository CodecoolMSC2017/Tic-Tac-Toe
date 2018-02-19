package com.codecool.githubstat;

import org.jfree.data.general.DefaultPieDataset;
import org.json.JSONArray;

public class Main {
    public static void main(String[] args) {
        JSONArray jsonArray = GithubStatParser.getJSONStat("kokeroface");
        GithubRepoStat githubRepoStat = GithubStatParser.getGithubStat(jsonArray,"kokeroface");
        DefaultPieDataset result = new DefaultPieDataset();

        for (Contributor contributor:githubRepoStat.getContributors()) {
           result.setValue(contributor.getUsername(),contributor.getCommits());
        }
        PieChart pieChart = new PieChart("GithubStat","Commits by contributors","set",result);
        pieChart.pack();
        pieChart.setVisible(true);
    }
}
