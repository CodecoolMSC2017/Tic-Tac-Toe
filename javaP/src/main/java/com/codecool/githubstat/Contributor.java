package com.codecool.githubstat;

public class Contributor {
    int additions;
    int deletions;
    int commits;
    String username;


    public Contributor(int additions, int deletions, int commits, String username) {
        this.additions = additions;
        this.deletions = deletions;
        this.commits = commits;
        this.username = username;
    }

    public int getAdditions() {
        return additions;
    }

    public int getDeletions() {
        return deletions;
    }

    public int getCommits() {
        return commits;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "Contributor{" +
                "additions=" + additions +
                ", deletions=" + deletions +
                ", commits=" + commits +
                ", username='" + username + '\'' +
                '}';
    }
}
