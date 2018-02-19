package com.codecool.githubstat;

import java.util.List;

public class GithubRepoStat {
    List<Contributor> contributors;
    String repositoryName;

    public GithubRepoStat(List<Contributor> contributors, String repositoryName) {
        this.contributors = contributors;
        this.repositoryName = repositoryName;
    }

    public List<Contributor> getContributors() {
        return contributors;
    }

    public String getRepositoryName() {
        return repositoryName;
    }
}
