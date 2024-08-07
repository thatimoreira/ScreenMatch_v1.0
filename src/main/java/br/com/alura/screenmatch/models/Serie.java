package br.com.alura.screenmatch.models;

public class Serie extends Title {
    private int seasons;
    private int episodesPerSeason;
    private boolean active;         //indicates if new episodes will be released
    private int minutesPerEpisode;

    public Serie(String title, int releaseYear) {
        super(title, releaseYear);
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }

    @Override
    public int getRunningTimeInMinutes() {
        return seasons * episodesPerSeason * minutesPerEpisode;
    }

    @Override
    public String toString() {
        return "Serie: " + this.getTitle() + " (" + this.getReleaseYear() + ")";
    }
}
