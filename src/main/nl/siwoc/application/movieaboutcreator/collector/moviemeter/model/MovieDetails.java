package nl.siwoc.application.movieaboutcreator.collector.moviemeter.model;

import java.util.ArrayList;

public class MovieDetails {
	private long id;
	private String url;
	private int year;
	private String imdb;
	private String title;
	private String displayTitle;
	private String alternativeTitle = null;
	private String plot;
	private int duration;
	private long votesCount;
	private float average;
	private Posters posters;
	private ArrayList<String> countries = new ArrayList<String>();
	private ArrayList<String> genres = new ArrayList<String>();
	private ArrayList<Actor> actors = new ArrayList<Actor>();
	private ArrayList<String> directors = new ArrayList<String>();
	private String userVote = null;

	public static class Actor {
		private String name;
		private boolean voice;

		public String getName() {
			return name;
		}
		
		public void setName(String _name) {
			this.name = _name;
		}

		public boolean isVoice() {
			return voice;
		}

		public void setVoice(boolean _voice) {
			this.voice = _voice;
		}
		
		public String toString() {
			return getName();
		}
	}
	
	public class Posters {
		private String thumb;
		private String small;
		private String regular;
		private String large;

		public String getThumb() {
			return thumb;
		}

		public String getSmall() {
			return small;
		}

		public String getRegular() {
			return regular;
		}

		public String getLarge() {
			return large;
		}

		public void setThumb(String thumb) {
			this.thumb = thumb;
		}

		public void setSmall(String small) {
			this.small = small;
		}

		public void setRegular(String regular) {
			this.regular = regular;
		}

		public void setLarge(String large) {
			this.large = large;
		}
	}

	public long getId() {
		return id;
	}

	public String getUrl() {
		return url;
	}

	public int getYear() {
		return year;
	}

	public String getImdb() {
		return imdb;
	}

	public String getTitle() {
		return title;
	}

	public String getDisplay_title() {
		return displayTitle;
	}

	public String getAlternative_title() {
		return alternativeTitle;
	}

	public String getPlot() {
		return plot;
	}

	public int getDuration() {
		return duration;
	}

	public long getVotes_count() {
		return votesCount;
	}

	public float getAverage() {
		return average;
	}

	public Posters getPosters() {
		return posters;
	}

	public String getUser_vote() {
		return userVote;
	}

	public ArrayList<String> getCountries() {
		return countries;
	}

	public ArrayList<String> getGenres() {
		return genres;
	}

	public ArrayList<Actor> getActors() {
		return actors;
	}

	public ArrayList<String> getDirectors() {
		return directors;
	}

	public void setCountries(ArrayList<String> countries) {
		this.countries = countries;
	}

	public void setGenres(ArrayList<String> genres) {
		this.genres = genres;
	}

	public void setActors(ArrayList<Actor> actors) {
		this.actors = actors;
	}

	public void setDirectors(ArrayList<String> _directors) {
		this.directors = _directors;
	}

	public void setId(long _id) {
		this.id = _id;
	}

	public void setUrl(String _url) {
		this.url = _url;
	}

	public void setYear(int _year) {
		this.year = _year;
	}

	public void setImdb(String _imdb) {
		this.imdb = _imdb;
	}

	public void setTitle(String _title) {
		this.title = _title;
	}

	public void setDisplay_title(String _display_title) {
		this.displayTitle = _display_title;
	}

	public void setAlternative_title(String _alternative_title) {
		this.alternativeTitle = _alternative_title;
	}

	public void setPlot(String _plot) {
		this.plot = _plot;
	}

	public void setDuration(int _duration) {
		this.duration = _duration;
	}

	public void setVotes_count(long _votesCount) {
		this.votesCount = _votesCount;
	}

	public void setAverage(float _average) {
		this.average = _average;
	}

	public void setPosters(Posters _posters) {
		this.posters = _posters;
	}

	public void setUser_vote(String _user_vote) {
		this.userVote = _user_vote;
	}

	public String toString() {
		return getTitle() + " (" + getYear() + ")";
	}
	
}
