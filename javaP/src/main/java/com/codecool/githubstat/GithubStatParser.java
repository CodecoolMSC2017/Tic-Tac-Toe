package com.codecool.githubstat;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class GithubStatParser {
    public static JSONArray getJSONStat(String repositoryName){

        String response = "";

        try{
            URL url = new URL("https://api.github.com/repos/CodecoolMSC2017/"+repositoryName+"/stats/contributors");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));
            String inputLine = "";
            while ((inputLine = in.readLine())!=null)
                response +=inputLine;
            in.close();


        }catch (Exception e){
            System.out.println("Error while parsing");
            e.printStackTrace();
        }

        JSONArray statistic = new JSONArray(response);




        return statistic;
    }
    public static GithubRepoStat getGithubStat(JSONArray statistic, String repositoryName){
        List<Contributor> contributors = new ArrayList<Contributor>();
        for (int i = 0; i < statistic.length(); i++) {
            JSONObject jsonObject = statistic.getJSONObject(i);
            JSONArray weeks = jsonObject.getJSONArray("weeks");
            String name = jsonObject.getJSONObject("author").getString("login");

            int commits = 0;
            int additions = 0;
            int deletions = 0;
            for (int j = 0; j <weeks.length(); j++) {
                JSONObject week = weeks.getJSONObject(j);
                additions+= week.getInt("a");
                deletions+= week.getInt("d");
                commits+= week.getInt("c");
            }
            contributors.add(new Contributor(additions,deletions,commits,name));
        }
        return new GithubRepoStat(contributors,repositoryName);
    }


}
