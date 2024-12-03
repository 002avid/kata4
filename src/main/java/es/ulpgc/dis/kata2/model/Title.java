package es.ulpgc.dis.kata2.model;

import java.time.Year;

public record Title(String id, Title.TitleType titleType,
					String primaryTitle, String originalTitle, boolean isAdult, Year startYear, Year endYear, Integer runtimeMinutes) {

	public enum TitleType {
		VideoGame,
		TvPilot,
		Movie,
		TvSeries,
		TvMiniSeries,
		Short,
		TvSpecial,
		TvShort,
		Video,
		TvMovie,
		TvEpisode
	}
}
